package com.team.stepdefinitions;

import java.util.List;

import com.team.app.MovieByGenre;
import com.team.app.MovieOnPrimeByGenre;
import com.team.utils.DependencyUtil;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class PrimeFilterMoviesByGenre {
	DependencyUtil service;
	
	public PrimeFilterMoviesByGenre(DependencyUtil service) {
		this.service = service;
	}
	
	int moviesOnPrimeByGenre;
	
	MovieByGenre movie;
	MovieOnPrimeByGenre movieOnPrimeByGenre = new MovieOnPrimeByGenre();
	
	@Given("I have signed in to Amazaon prime")
	public void I_have_signed_in_to_Amazaon_prime()
	{
		
	}
	
	@And("I have the following movies by genre on Amazon prime")
	public void I_have_the_following_movies_by_genre_on_Amazon_prime(DataTable dataTable)
	{
		List<List<String>> rows = dataTable.asLists(String.class);
		
		for (List<String> list : rows) {
			System.out.println("Movie: " + list.get(0));
			System.out.println("Genre: " + list.get(1));
			
			movie = new MovieByGenre(list.get(0), list.get(1));
			movieOnPrimeByGenre.setMovieByGenreList(movie);
		}
	}
	
	@When("I search for movies by Genre {string}")
	public void i_search_for_movies_by_Genre(String genre) {
		moviesOnPrimeByGenre = movieOnPrimeByGenre.getMovieByGenreList(genre).size();
		System.out.println("Movies count actual: " + moviesOnPrimeByGenre);
	}
	
	@Then("I find Number of {string} by Genre")
	public void i_find_Number_of_movies_by_Genre(String expected) {
		try {
			System.out.println("Actual: " + moviesOnPrimeByGenre);
			Assert.assertEquals(Integer.parseInt(expected), moviesOnPrimeByGenre);
			System.out.println("Test Passed");
		}
		catch (Exception e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
}
