package com.compit.soa.rest.spring_framework.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author: chaudharimehul
 * @date:	Sep 16, 2017
 * 
 */

public interface Integration {

	@RequestMapping(value="/getmethod/noheader", method = RequestMethod.GET)
	public @ResponseBody String getUserName();
	
	@RequestMapping(value= "/getpostput/toonemethod", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody String getName();
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public String enter();
	
}
