package com.compit.analytics.impl;

import org.springframework.stereotype.Service;

import com.compit.analytics.api.HomeInformation;
import com.compit.analytics.common.HomeDetailsDTO;

@Service
public class HomeInformationImpl implements HomeInformation {

	public String getDefaultHome() {
		// TODO Auto-generated method stub
		HomeDetailsDTO homeDetails = new HomeDetailsDTO();

		homeDetails.setHomeId("1");
		homeDetails.setHomeZipCode("94086");
		homeDetails.setHomeAddress("123 test address, Sunnyvale, CA");

		return "default home page";

	}

	public HomeDetailsDTO getHomesFromZipCode(String zipCode) {
		// TODO Auto-generated method stub

		HomeDetailsDTO homeDetails = new HomeDetailsDTO();

		homeDetails.setHomeId("1");
		homeDetails.setHomeZipCode(zipCode);
		homeDetails.setHomeAddress("123 test address, Sunnyvale, CA");

		return homeDetails;
	}

}
