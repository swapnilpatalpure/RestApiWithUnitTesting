package com.codewithswap.restapi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.codewithswap.restapi.model.CloudVendor;
import com.codewithswap.restapi.repository.CloudVendorRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CloudVendorRepositoryTest {
	
	@Autowired
	private CloudVendorRepository cloudVendorRepository;
	
	CloudVendor cloudVendor;
	
	@BeforeEach
	void setUp() {
		cloudVendor= new CloudVendor("1", "Amazon", "USA", "xxxxx");
		cloudVendorRepository.save(cloudVendor);
	}
	
	@AfterEach
	void tearDown() {
		cloudVendor=null;
		cloudVendorRepository.deleteAll();
	}
	
	//test case for Success scenario
	@Test
	void testFindByVendorName_Found() {
		List<CloudVendor> cloudVendorsList = cloudVendorRepository.findByVendorName("Amazon");
		assertThat(cloudVendorsList.get(0).getVendorId()).isEqualTo(cloudVendor.getVendorId());
		assertThat(cloudVendorsList.get(0).getVendorAddress()).isEqualTo(cloudVendor.getVendorAddress());
	}
	
	//test case for Failure scenario
	@Test
	void testFindByVendorName_NotFound() {
		List<CloudVendor> cloudVendorsList = cloudVendorRepository.findByVendorName("GCP");
		assertThat(cloudVendorsList.isEmpty()).isTrue();
	}
}
