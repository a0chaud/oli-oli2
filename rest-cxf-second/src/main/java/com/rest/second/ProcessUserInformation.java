package com.rest.second;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public interface ProcessUserInformation {

	@GET
	@Produces("text/plain")
	public String getServiceInformation();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/userInformationJson")
	public Response getUserInformationJ();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/userInformationXml")
	public Response getUserInformationX();

}
