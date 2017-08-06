package com.compit.analytics.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.compit.analytics.common.HomeDetailsDTO;

@Path("/")
public interface HomeInformation {

	@GET
	@Path("/default")
	@Produces("text/plain")
	public String getDefaultHome();

	@GET
	@Path("/zipcode/{zipCode}")
	@Produces("application/json")
	public HomeDetailsDTO getHomesFromZipCode(@PathParam("zipCode") String zipCode);

}
