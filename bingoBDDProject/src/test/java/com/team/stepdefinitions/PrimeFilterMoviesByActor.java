package com.team.stepdefinitions;

import java.util.List;

import com.team.app.MovieByActor;
import com.team.app.MovieOnPrimeByActor;
import com.team.utils.DependencyUtil;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class PrimeFilterMoviesByActor {
	
	DependencyUtil service;
	
	public PrimeFilterMoviesByActor(DependencyUtil service) {
		this.service = service;
	}
	
	int moviesOnPrimeByActor;
	
	MovieByActor movieByActor;
	MovieOnPrimeByActor moviesOnPrime = new MovieOnPrimeByActor();
	
	@And("I have the following movies on Prime based on Actor")
	public void i_have_the_following_movies_on_Prime_based_on_Actor(DataTable datatable){
		//
		
		List<List<String>> rows = datatable.asLists(String.class);
		
		for(List<String> list : rows)
		{
			System.out.println("Movie: " + list.get(0));
			System.out.println("Actor: " + list.get(1));
			
			movieByActor = new MovieByActor(list.get(0), list.get(1));
			moviesOnPrime.setMovieByActorList(movieByActor);
		}
	}
	
	@When("i search for movies by Actor {string}")
	public void i_search_for_movies_by(String actor) {
		moviesOnPrimeByActor = moviesOnPrime.getMovieByActorList(actor).size();
	}
	
	
	@Then("I find Number of {string} by Actor")
	public void i_find_Number_of_movies_by_Actor(String expected)
	{
		try {
			System.out.println("Actual: " + moviesOnPrimeByActor);
			System.out.println("Expected: " + expected);
			Assert.assertEquals(Integer.parseInt(expected), moviesOnPrimeByActor);
			System.out.println("Test passed");
			
		}
		catch (AssertionError e) {
			System.out.println("Test Failed");
			Assert.fail();
		}
	}
}