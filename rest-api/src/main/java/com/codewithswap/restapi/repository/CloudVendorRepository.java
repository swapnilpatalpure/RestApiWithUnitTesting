package com.codewithswap.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codewithswap.restapi.model.CloudVendor;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
	
	List<CloudVendor> findByVendorName(String vendorName);

}
