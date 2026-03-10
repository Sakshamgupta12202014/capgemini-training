package com.capg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Movie;
import com.capg.springboot.repository.MovieDAOInterfaceImpl;

@Service
public class MovieServiceInterfaceImpl implements  MovieServiceInterface{

	@Autowired
	MovieDAOInterfaceImpl movieDAO;
	
	
	@Override
	public Movie createMovie(Movie movie) {
		return movieDAO.createMovie(movie);
	}

	@Override
	public List<Movie> fetchAllMovies() {
		return movieDAO.fetchAllMovies();
	}

	@Override
	public void deleteMovie(int id) {
		movieDAO.deleteMovie(id);
	}

	@Override
	public Movie updateMovie(int id, Movie movie) {
		return movieDAO.updateMovie(id, movie);
	}

	@Override
	public Movie getMovieById(int id) {
		return movieDAO.getMovieById(id);
	}

}
