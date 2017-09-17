package com.compit.soa.rest.cxf.api;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
/**
 * @author: chaudharimehul
 * @date:	Sep 16, 2017
 * 
 */
public interface Integration {

	@Path("/getmethod/noheader")
	@GET
	@Produces
	public String getFullName();
	
	@GET
//	@POST //TODO: revisit this is not working in this code
//	@PUT //TODO: revisit this is not working in this code
	@Path("/getpostput/toonemethod")
	@Produces
	public String getName();
	
	@GET
	@Path("/")
	@Produces
	public String enter();

}
