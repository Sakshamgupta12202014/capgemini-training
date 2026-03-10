package com.capg.springboot.exception;

public class MovieNotFoundException extends RuntimeException {
	public MovieNotFoundException(String mess) {
		super(mess);
	}
}
