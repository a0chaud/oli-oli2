package com.compit.analytics.service.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.compit.analytics.common.H2HomeDTO;

@Path("/")
public interface H2HomeInfoManager {

	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String updateHome(H2HomeDTO h2homeDto);
	
	//To search using zipcode
	@GET
	@Path("/search/zipcode")
	@Produces(MediaType.APPLICATION_JSON)
	public List<H2HomeDTO> searchHome(@QueryParam("query") String zipCode);

	//To search using fiql
	@GET
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public List<H2HomeDTO> searchHomeFiql(@QueryParam("query") String query);

	@GET
	@Path("/welcome")
	@Produces(MediaType.TEXT_PLAIN)
	public String welcome();
}
