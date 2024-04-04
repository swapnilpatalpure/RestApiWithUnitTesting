package com.codewithswap.restapi.service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.codewithswap.restapi.model.CloudVendor;
import com.codewithswap.restapi.repository.CloudVendorRepository;
import com.codewithswap.restapi.service.CloudVendorService;


class CloudVendorServiceImplTest {
	
	@Mock
	private CloudVendorRepository cloudVendorRepository;
	
	@Autowired
	private CloudVendorService cloudVendorService;
	
	AutoCloseable autoCloseable;
	CloudVendor cloudVendor;

	@BeforeEach
	void setUp() throws Exception {
		autoCloseable= MockitoAnnotations.openMocks(this);
		cloudVendorService=new CloudVendorServiceImpl(cloudVendorRepository);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void getCloudVendor(String cloudVendorId) {

		
	}

	@Test
	void createCloudVendor() {
		
	}

	@Test
	void updateCloudVendor() {
		
	}

	@Test
	void deleteCloudVendor() {

	}

	@Test
	void getAllCloudVendor() {

		
	}

}
