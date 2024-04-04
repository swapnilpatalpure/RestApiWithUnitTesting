package com.codewithswap.restapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithswap.restapi.model.CloudVendor;
import com.codewithswap.restapi.repository.CloudVendorRepository;
import com.codewithswap.restapi.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
	
	@Autowired
	private CloudVendorRepository cloudVendorRepository;
	
	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {

		CloudVendor cloudVendor = cloudVendorRepository.findById(cloudVendorId).get();
		
		return cloudVendor;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Cloud Vendor created Successfully";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Cloud Vendor updated Successfully";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {

		cloudVendorRepository.deleteById(cloudVendorId);
		
		return "Cloud Vendor deleted Successfully";
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {

		List<CloudVendor> cloudVendors = cloudVendorRepository.findAll();
		
		return cloudVendors;
	}

}
