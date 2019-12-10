package com.exercise43rest.services;
import javax.ws.rs.Path;
import javax.ws.rs.GET;

@Path("/Messages")
public class Messages {
	
	//With this path the endpoint ir redirect to
	//http://localhost:8081/Exercise43Rest/Messages/sayHello
	@Path("/sayHello")
	@GET
	public String sayHello() {
		return "Hi User";
	}
}
