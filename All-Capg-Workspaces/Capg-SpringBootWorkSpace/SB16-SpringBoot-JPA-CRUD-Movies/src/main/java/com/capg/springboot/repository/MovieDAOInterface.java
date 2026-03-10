package com.capg.springboot.repository;

import java.util.List;

import com.capg.springboot.entity.Movie;

public interface MovieDAOInterface {
	public Movie createMovie(Movie movie);
	public List<Movie> fetchAllMovies();
	public Movie getMovieById(int id);
	public void deleteMovie(int id);
	public Movie updateMovie(int id ,Movie movie);
}
