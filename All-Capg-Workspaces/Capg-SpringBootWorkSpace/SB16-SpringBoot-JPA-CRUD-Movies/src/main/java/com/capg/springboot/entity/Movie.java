package com.capg.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movie {
	
	@Id
	@Column(name = "movie_id", length = 10)
	int movie_id;
	
	@Column(name = "movie_title", length = 20)
	String movie_title;
	
	@Column(name = "movie_genre", length = 20)
	String movie_genre;
	
	public Movie() {
		
	}
	public Movie(int movie_id, String movie_title, String movie_genre) {
		super();
		this.movie_id = movie_id;
		this.movie_title = movie_title;
		this.movie_genre = movie_genre;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public String getMovie_genre() {
		return movie_genre;
	}
	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}
	
}
