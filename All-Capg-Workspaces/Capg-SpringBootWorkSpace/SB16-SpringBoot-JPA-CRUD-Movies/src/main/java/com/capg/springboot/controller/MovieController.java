package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Movie;
import com.capg.springboot.exception.MovieNotFoundException;
import com.capg.springboot.service.MovieServiceInterfaceImpl;

@RestController
public class MovieController {
	
	@Autowired
	MovieServiceInterfaceImpl movieService;
	
	@GetMapping("/getAllMovies")
	public ResponseEntity<List<Movie>> getAllMovies() {
		
		List<Movie> movieList = movieService.fetchAllMovies();
		ResponseEntity<List<Movie>> responseEntity = new ResponseEntity<>(movieList, new HttpHeaders(), HttpStatus.OK);
		return responseEntity;
	}
	
	@PostMapping("/addMovie")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
		Movie newMovie = movieService.createMovie(movie);
		ResponseEntity<Movie> responseEntity = new ResponseEntity<>(newMovie , new HttpHeaders(), HttpStatus.CREATED);
		return responseEntity;
	}
	
	// get movie by id
	@GetMapping("/getmovie/{id}")
	public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
		Movie movie = movieService.getMovieById(id);
		
		if(movie == null) {
			throw new MovieNotFoundException("Movie with movie id " + id + " does not exist");
		}
		
		ResponseEntity<Movie> responseEntity = new ResponseEntity<>(movie, new HttpHeaders(), HttpStatus.OK);
		return responseEntity;
	}
	
	// Update movie
	@PutMapping("/movie/{id}")
	public ResponseEntity<Movie> updateMovie(@PathVariable int id , @RequestBody Movie movie) {
		Movie updatedMovie = movieService.updateMovie(id, movie);
		if(updatedMovie == null) {
			throw new MovieNotFoundException("Movie with movie id " + id + " does not exist");
		}
		
		ResponseEntity<Movie> responseEntity = new ResponseEntity<>(updatedMovie, new HttpHeaders(), HttpStatus.OK);
		return responseEntity;
	}
	
	//delete movie
	@DeleteMapping("/movie/{id}")
	public ResponseEntity<Void> deleteMovie(@PathVariable int id) {
		movieService.deleteMovie(id);
		
		return ResponseEntity.noContent().build();
	}

}
