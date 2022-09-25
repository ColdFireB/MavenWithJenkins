package com.team.app;

import java.util.ArrayList;
import java.util.List;

public class MovieOnPrimeByActor {

	private List<MovieByActor> MovieByActorList = new ArrayList<MovieByActor>();
	private List<MovieByActor> foundList = new ArrayList<MovieByActor>();

	/**
	 * 
	 * @param MovieByActor
	 */
	public void setMovieByActorList(MovieByActor MovieByActor) {
		MovieByActorList.add(MovieByActor);
	}

	/**
	 * 
	 * @param actor
	 * @return
	 */
	public List<MovieByActor> getMovieByActorList(String actor) {
		for (MovieByActor MovieByActor : MovieByActorList) {
			if (MovieByActor.getActor().equals(actor)) {
				foundList.add(MovieByActor);
				continue;
			}
		}
		return foundList;
	}
}
