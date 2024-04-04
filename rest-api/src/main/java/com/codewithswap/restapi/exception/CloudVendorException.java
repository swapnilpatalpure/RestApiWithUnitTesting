package com.codewithswap.restapi.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CloudVendorException {
	
	 	private String apiPath;

	   	private HttpStatus errorCode;

	    private String errorMessage;

	    private LocalDateTime errorTime;

}
