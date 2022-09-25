package com.team.app;

import java.util.ArrayList;
import java.util.List;

public class MovieOnPrimeByGenre {

	private List<MovieByGenre> MovieByGenreList = new ArrayList<MovieByGenre>();
	private List<MovieByGenre> foundList = new ArrayList<MovieByGenre>();

	public void setMovieByGenreList(MovieByGenre movieByGenre) {
		MovieByGenreList.add(movieByGenre);
	}

	public List<MovieByGenre> getMovieByGenreList(String genre) {

		for (MovieByGenre movieByGenre : MovieByGenreList) {
			if (movieByGenre.getClass().equals(genre)) {
				foundList.add(movieByGenre);
				continue;
			}
		}
		return foundList;
	}
}
