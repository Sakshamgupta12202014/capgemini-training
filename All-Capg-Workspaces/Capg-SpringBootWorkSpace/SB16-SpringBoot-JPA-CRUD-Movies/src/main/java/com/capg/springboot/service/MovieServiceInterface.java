package com.capg.springboot.service;

import java.util.List;

import com.capg.springboot.entity.Movie;

public interface MovieServiceInterface {
	public Movie createMovie(Movie movie);
	public List<Movie> fetchAllMovies();
	public Movie getMovieById(int id);
	public void deleteMovie(int id);
	public Movie updateMovie(int id ,Movie movie);
}
