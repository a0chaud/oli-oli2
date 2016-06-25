package com.rest.first.impl;

import org.springframework.stereotype.Service;

import com.rest.first.ProcessUserInformation;

@Service("processUserInfo")
public class ProcessUserInformationImpl implements ProcessUserInformation {

	public String getServiceInformation() {
		// TODO Auto-generated method stub
		return "This is First Response message from First REST service. Implemented with cxf, mvn, spring framework.";
	}

}
