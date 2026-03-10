package com.capg.springboot.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.Movie;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
@Transactional
public class MovieDAOInterfaceImpl implements MovieDAOInterface{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Movie createMovie(Movie movie) {
		return em.merge(movie);
	}

	@Override
	public List<Movie> fetchAllMovies() {
		Query query = em.createQuery("Select m from Movie m");
		List<Movie> movies = query.getResultList();
		return movies;
	}

	@Override
	public Movie getMovieById(int id) {
		Movie movie = em.find(Movie.class, id);
		return movie;
	}

	@Override
	public void deleteMovie(int id) {
		Movie movie = em.find(Movie.class, id);
		em.remove(movie);
	}

	@Override
	public Movie updateMovie(int id, Movie movie) {
		Movie movieToUpdate = em.find(Movie.class, id);
		movieToUpdate.setMovie_title(movie.getMovie_title());
		movieToUpdate.setMovie_genre(movie.getMovie_genre());
		
		em.merge(movieToUpdate);
		return movie;
	}
	

}
