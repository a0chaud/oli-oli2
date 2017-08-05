package com.compit.analytics.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.compit.analytics.api.RestController;
import com.compit.analytics.common.RestJsonInterface;

@Component
public class RestControllerImpl implements RestController {

	public RestJsonInterface getHelloWorld() {
		// TODO Auto-generated method stub
		RestJsonInterface helloWorld = new RestJsonInterface();
		helloWorld.setId("1");
		helloWorld.setName("helloWorld");

		return helloWorld;
	}

	public RestJsonInterface testEndPoint(@PathVariable String name) {
		// TODO Auto-generated method stub
		RestJsonInterface helloWorld = new RestJsonInterface();
		helloWorld.setId("2");
		helloWorld.setName(name);

		return helloWorld;
	}

}
