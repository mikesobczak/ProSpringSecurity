package com.apress.pss.terrormovies.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;

import com.apress.pss.terrormovies.model.Movie;

public class MoviesServiceImpl implements MoviesService {
	
	private static final Map<String, Movie> MOVIES = new HashMap<String, Movie>();

	static
	{
		MOVIES.put("die hard", new Movie("Die Hard", "20000000"));
		MOVIES.put("two days in paris", new Movie("Two Days in Paris", "1000000"));
	}
	
	public Movie getMovieByName(String name) {
		return MOVIES.get(name.toLowerCase());
	}
	
	public void addNewMovies(List<String> movies)
	{
		for ( String movie : movies)
		{
			MOVIES.put(movie, new Movie(movie, "10000"));
		}
	}
	
	public Collection<Movie> getAllMovies()
	{
		return new ArrayList<Movie>(MOVIES.values());
	}

}
