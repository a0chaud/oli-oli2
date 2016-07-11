package com.rest.second.impl;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.rest.biz.dto.UserInformation;
import com.rest.second.ProcessUserInformation;

@Service("processUserInfo")
public class ProcessUserInformationImpl implements ProcessUserInformation {

	public String getServiceInformation() {
		// TODO Auto-generated method stub
		return "This is First Response message from First REST service. Implemented with cxf, mvn, spring framework.";
	}

	public Response getUserInformationJ() {
		// TODO Auto-generated method stub
		UserInformation userInfo = new UserInformation();
		userInfo.setUserId("1");
		userInfo.setUserName("testUser");
		userInfo.setUserEmail("a@xyz.com");
		userInfo.setUserAge("none");
		userInfo.setUserPhone("123-234-3456");
		userInfo.setUserAddress("SunnyvaleCA");
		return Response.ok(userInfo).build();
	}

	public Response getUserInformationX() {
		// TODO Auto-generated method stub
		UserInformation userInfo = new UserInformation();
		userInfo.setUserId("1");
		userInfo.setUserName("testUser");
		userInfo.setUserEmail("a@xyz.com");
		userInfo.setUserAge("none");
		userInfo.setUserPhone("123-234-3456");
		userInfo.setUserAddress("SunnyvaleCA");
		return Response.ok(userInfo).build();
	}

	public String testEndPoint() {
		// TODO Auto-generated method stub
		return "testEndPoint";
	}
}
