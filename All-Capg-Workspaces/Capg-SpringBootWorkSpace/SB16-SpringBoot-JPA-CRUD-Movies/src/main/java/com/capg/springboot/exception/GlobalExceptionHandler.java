package com.capg.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<String> handleMovieNotFoundException(MovieNotFoundException ex) {
		return new ResponseEntity<String>("An error occurred - " + ex.getMessage() , HttpStatus.BAD_REQUEST);
	}
}
