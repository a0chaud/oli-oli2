package com.rest.first;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/")
public interface ProcessUserInformation {

	@GET
	@Produces("text/plain")
	public String getServiceInformation();
}
