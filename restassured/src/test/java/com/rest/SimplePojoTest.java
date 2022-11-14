package com.rest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SimplePojoTest {

	public static String accessToken;
	Properties prop;
	FileInputStream file;
	ArrayList<Integer> productIDs;
	
	@BeforeClass
	public void beforeclass() {
		loadProperties();
	}
	
	
	@Test
	public void get_status() {
		String status = given().
		 	baseUri("https://simple-grocery-store-api.glitch.me").
		when().
			get("/status").
		then().
		log().all().
		assertThat().
		statusCode(200).
		extract().response().path("status");
			//body("status", is(equalTo("UP")));
		//System.out.println("Get status of the API:" res.path("status"));
		
		System.out.println("Get status of the API:" + status);
	}	
	
	
	@Test
	public void get_ListOfProducts() {
		productIDs = given().
		 	baseUri("https://simple-grocery-store-api.glitch.me").
		when().
			get("/products").
		then().
		log().all().
		assertThat().
		statusCode(200).
		body("category", hasItem("meat-seafood"),
				"name", hasItem("Fresh Spinach Organic"),
				"id", hasItems(4643, 4646, 4641, 1225, 3674, 2585, 5851, 8739, 2177, 1709, 1709, 7395, 8554, 6483, 5774, 8753, 9482, 5477, 5478, 4875)).
		extract().response().path("id");
		
		System.out.println(productIDs);
		//System.out.println(res.path("id"));
	}	
	
	@Test
	public void get_Product() {
		given().
		 	baseUri("https://simple-grocery-store-api.glitch.me").
		when().
			get("/products/4875").
		then().
		log().all().
		assertThat().
		statusCode(200).
			body("id", is(equalTo(4875)),
					"category", is(equalTo("bread-bakery")),
					"name", is(equalTo("2800 Watt Inverter Generator")),
					"manufacturer", is(equalTo("Honda")),
					"price", is(equalTo(47.45f)),
					"current-stock", is(equalTo(10)),
					"inStock", is(equalTo(true)));
	}
	
	@Test
	public void get_Cart_items() {
		Response res = given().
		 	baseUri("https://simple-grocery-store-api.glitch.me").
		when().
			get("/carts/"+ prop.getProperty("cartId") +"/items").
		then().
		log().all().
		assertThat().
		statusCode(404).extract().response();
		System.out.println("Error field value: "  +res.path("error"));
	}
	
	
	@Test
	public void get_Cart_using_CartID() {
		given().
		 	baseUri("https://simple-grocery-store-api.glitch.me").
		when().
			get("/carts/"+ prop.getProperty("cartId")).
		then().
		log().all().
		assertThat().
		statusCode(200).
		body("items", hasSize(1));
	}
	
	@Test
	public void register_ExistingAPI_Client() {
		given().
			log().all().
		 	baseUri("https://simple-grocery-store-api.glitch.me").
		 	contentType(ContentType.JSON).
		 	body("{\r\n"
		 			+ "   \"clientName\": \"Bala\",\r\n"
		 			+ "   \"clientEmail\": \"balaece1991@gmail.com\"\r\n"
		 			+ "}").
		when().
			post("/api-clients").
		then().
		log().all().
		assertThat().
		statusCode(409).
		body("error", is(equalTo("API client already registered. Try a different email.")));
	}
	
	@Test
	public void register_newAPI_Client() {
		Response res = given().
			log().all().
		 	baseUri("https://simple-grocery-store-api.glitch.me").
		 	contentType(ContentType.JSON).
		 	body("{\r\n"
		 			+ "   \"clientName\": \"ArulBala3\",\r\n"
		 			+ "   \"clientEmail\": \"colorsbybala2@gmail.com\"\r\n"
		 			+ "}").
		when().
			post("/api-clients").
		then().
		log().all().
		assertThat().
		statusCode(201).extract().response();
		
		accessToken = res.path("accessToken");
		writeProperties("accessToken",accessToken);
	}
	
	@Test
	public void writeProperties(String key, String value) {
		prop = new Properties();

		try {
			file = new FileInputStream("D:\\eclipse-workspace\\restassured\\src\\test\\resources\\accessTokens.properties");
			prop.load(file);
			prop.setProperty(key, value);
			prop.store(new FileOutputStream("D:\\eclipse-workspace\\restassured\\src\\test\\resources\\accessTokens.properties"), "accessTokens");			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void loadProperties() {
		prop = new Properties();
		try {
			file = new FileInputStream("D:\\eclipse-workspace\\restassured\\src\\test\\resources\\accessTokens.properties");
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void create_cart() {
		Response res = given().
			log().all().
		 	baseUri("https://simple-grocery-store-api.glitch.me").
		when().
			post("/carts").
		then().
			log().all().
			assertThat().
			statusCode(201).
			body("created", equalTo(true)). 
			extract().response();
		
		writeProperties("cartId", (res.path("cartId")).toString());	
	}
	
	@Test(dependsOnMethods = "get_ListOfProducts")
	public void Add_ItemTo_cart() {
		writeProperties("productID2", (productIDs.get(1)).toString());
		
		Response res = given().
			log().all().
		 	baseUri("https://simple-grocery-store-api.glitch.me").
		when().
		    body("{\r\n"
				+ "   \"productId\":" +productIDs.get(1)+"\r\n"
				+ "}").
		    contentType(ContentType.JSON).
			post("/carts/"+ prop.getProperty("cartId") + "/items").
			
		then().
			log().all().
			assertThat().
			statusCode(201).
			body("created", is(true)).
			extract().response();
		
		System.out.println(res.toString());
		writeProperties("itemId2", (res.path("itemId")).toString());			
	}
	
	@Test
	public void create_new_order() {
		loadProperties();
		
		Response res = given().
			log().all().
			header("Authorization", "Bearer "+ prop.getProperty("accessToken")).
		 	baseUri("https://simple-grocery-store-api.glitch.me").
		 	
		when().
		    body("{\r\n"
		    		+ "    \"cartId\":"+ "\"" + prop.getProperty("cartId") +"\""+",\r\n"
		    		+ "    \"customerName\": \"Arul\"\r\n"
		    		+ "}").
		    contentType(ContentType.JSON).
			post("/Orders").			
		then().
			log().all().
			assertThat().
			statusCode(201).
			body("created", is(true)).
			extract().response();
		
		System.out.println(res.toString());
		writeProperties("OrderID1", (res.path("orderId")).toString());			
	}
	
	
}