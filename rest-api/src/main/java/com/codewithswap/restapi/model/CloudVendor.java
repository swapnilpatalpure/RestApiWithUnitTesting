package com.codewithswap.restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class CloudVendor {
	
	@Id
	private String vendorId;
	
	private String vendorName;
	
	private String vendorAddress;
	
	private String vendorPhoneNUmber;
	
	

}
