package com.codewithswap.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "cloud_vendor_info")
public class CloudVendor {
	
	@Id
	@Column(name = "vendor_id")
	private String vendorId;
	
	@Column(name = "vendor_name")
	private String vendorName;
	
	@Column(name = "vendor_address")
	private String vendorAddress;
	
	@Column(name = "vendor_phonenumber")
	private String vendorPhoneNUmber;
	
	

}
