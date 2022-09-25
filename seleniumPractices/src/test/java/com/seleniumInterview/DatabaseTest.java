package com.seleniumInterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatabaseTest {

	public static void main(String[] args) throws InterruptedException, SQLException {

		//
		String cust_firstname = "john";
		String cust_lastname = "Doe";
		String cust_email = "john@email.com";
		String cust_telphone = "1234567";
		String cust_password = "john123";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("URL");

		try {
			String confirm_msg = (driver.findElement(By.xpath("//h1[text()='Your account']"))).getText();
			if (confirm_msg.equals("Your account has been credited")) {
				System.out.println("Registration successfull");
			} else {
				System.out.println("Registration not successfull");
			}
		} catch (Exception e) {
			System.out.println("Some problem in the UI");
		}

		// Database variables
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3396/openshop", "rott", "");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from Employee");

		boolean status = false;

		while (rs.next()) {
			String firstname = rs.getString("firstname");
			String lastname = rs.getString("lastname");
			String email = rs.getString("email");
			String telephone = rs.getString("telephone");

			if (cust_firstname.equals(firstname) && cust_lastname.equals(lastname) && cust_email.equals(email)
					&& cust_telphone.equals(telephone)) {
				System.out.println("Record found in the table || Test Passed");
				status = true;
				break;
			}
		}

		if (status == false) {
			System.out.println("Record not found in the table || Test Failed");
		}
	}
}
