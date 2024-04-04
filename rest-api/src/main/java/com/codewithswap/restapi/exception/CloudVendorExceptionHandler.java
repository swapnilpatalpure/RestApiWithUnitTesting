package com.codewithswap.restapi.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CloudVendorExceptionHandler {

	@ExceptionHandler(value = {CloudVendorNotFoundException.class})
	public ResponseEntity<CloudVendorException> handleCloudVendorNotFoundException(CloudVendorNotFoundException exception, WebRequest webRequest){
		
		CloudVendorException cloudVendorException = new CloudVendorException(
				webRequest.getDescription(false),
                HttpStatus.NOT_FOUND,
                exception.getMessage(),
                LocalDateTime.now()
                );
		
		return new ResponseEntity<>(cloudVendorException,HttpStatus.BAD_REQUEST);
		
	}
	
}
