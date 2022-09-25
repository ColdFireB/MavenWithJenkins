package com.team.app;

/**
 * 
 * @author DELL 3521
 *
 */
public class MovieByActor extends Movie {

	private String actor;

	public MovieByActor(String movie, String actor) {
		super(movie);
		this.actor = actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActor() {
		return actor;
	}
}