package com.cg.show.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ShowExceptionController {
	@ExceptionHandler(value = ShowException.class)
	public ResponseEntity<Object> handleException(ShowException exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	//@ExceptionHandler(value = NoShowIdFoundException.class)
	//public ResponseEntity<Object> handleException(NoShowIdFoundException exception) {
		//return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	//}

}
