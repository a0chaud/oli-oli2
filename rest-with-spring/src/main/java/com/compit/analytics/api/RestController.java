package com.compit.analytics.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.compit.analytics.common.RestJsonInterface;

@Controller
@RequestMapping("/")
public interface RestController {


	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public @ResponseBody RestJsonInterface getHelloWorld();
	
	@RequestMapping(value = "/test/{name}", method = RequestMethod.GET)
	public @ResponseBody RestJsonInterface testEndPoint(@PathVariable String name);

}
