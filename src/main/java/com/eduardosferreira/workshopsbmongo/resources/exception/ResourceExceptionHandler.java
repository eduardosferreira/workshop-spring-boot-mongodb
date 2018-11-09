package com.eduardosferreira.workshopsbmongo.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.eduardosferreira.workshopsbmongo.services.exception.ObjectNotFoundRunTimeException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundRunTimeException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundRunTimeException e, 
			                                            HttpServletRequest request){
		StandardError standardError = new StandardError(System.currentTimeMillis(), 
										HttpStatus.NOT_FOUND.value(), 
										"Not Found", 
										e.getMessage(), 
										request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardError);
	}
}
