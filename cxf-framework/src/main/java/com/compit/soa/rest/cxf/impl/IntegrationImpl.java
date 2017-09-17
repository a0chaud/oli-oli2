package com.compit.soa.rest.cxf.impl;

import com.compit.soa.rest.cxf.api.Integration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
/**
 * @author: chaudharimehul
 * @date:	Sep 16, 2017
 * 
 */
 //@Component
 @Service
 //@Controller
public class IntegrationImpl implements Integration {

	/* (non-Javadoc)
	 * @see com.compit.soa.rest.cxf.api.Integration#getFullName()
	 */
	public String getFullName() {
		// TODO Auto-generated method stub
		return "Mehul Chaudhari";
	}

	/* (non-Javadoc)
	 * @see com.compit.soa.rest.cxf.api.Integration#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return "Mehul";
	}

	/* (non-Javadoc)
	 * @see com.compit.soa.rest.cxf.api.Integration#enter()
	 */
	public String enter() {
		// TODO Auto-generated method stub
		return "Enter ...";
	}

}
