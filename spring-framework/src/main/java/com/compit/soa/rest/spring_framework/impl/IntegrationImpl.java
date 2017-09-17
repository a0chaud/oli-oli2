package com.compit.soa.rest.spring_framework.impl;

import org.springframework.stereotype.Controller;
import com.compit.soa.rest.spring_framework.api.Integration;

/**
 * @author: chaudharimehul
 * @date:	Sep 16, 2017
 * 
 */
@Controller
public class IntegrationImpl implements Integration {

	/* (non-Javadoc)
	 * @see com.compit.soa.rest.spring_framework.api.Integration#getUserName()
	 */
	public String getUserName() {
		// TODO Auto-generated method stub
		return "Mehul Chaudhari";
	}

	/* (non-Javadoc)
	 * @see com.compit.soa.rest.spring_framework.api.Integration#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return "Mehul";
	}

	/* (non-Javadoc)
	 * @see com.compit.soa.rest.spring_framework.api.Integration#enter()
	 */
	public String enter() {
		// TODO Auto-generated method stub
		return "Enter ...";
	}

}
