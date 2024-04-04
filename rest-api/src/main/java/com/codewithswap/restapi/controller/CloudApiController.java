package com.codewithswap.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithswap.restapi.model.CloudVendor;
import com.codewithswap.restapi.response.ResponseHandler;
import com.codewithswap.restapi.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudApiController {
	
	@Autowired
	private CloudVendorService cloudVendorService;
	
	@GetMapping("{vendorId}")
	public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		
		CloudVendor cloudVendor = cloudVendorService.getCloudVendor(vendorId);
		return ResponseHandler
				.responseBuilder("Requested Vendor details given here", HttpStatus.OK, cloudVendor);
		
		 
	}
	
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		
		return cloudVendorService.createCloudVendor(cloudVendor);
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		
		return cloudVendorService.updateCloudVendor(cloudVendor);
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		
		return cloudVendorService.deleteCloudVendor(vendorId);
	}
	
	@GetMapping
	public List<CloudVendor> getAllCloudVendorDetails() {
		return cloudVendorService.getAllCloudVendor();
	}

}
