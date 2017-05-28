package org.keycloak.dmgw;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

@Path("/")
public class Resource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/v2/secured/sms")
	public String getSecuredSMSDetail(@QueryParam("token") String token){
		
		System.out.println(token);
		Client client = Client.create();
		Builder webResource = client
				   .resource("http://localhost:8080/service/secured")
				   .header("Authorization", "Bearer "+token);

				ClientResponse response = webResource.accept("application/json")
		                   .get(ClientResponse.class);			
/*
				if (response.getStatus() != 200) {
				   throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
				}*/

				String output = response.getEntity(String.class);

				System.out.println("Output from Server .... \n");
				System.out.println(output);

		
		return output;
		
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/v2/admin/sms")
	public String getAdminSMSDetail(@QueryParam("token") String token){
		
		System.out.println(token);
		Client client = Client.create();
		Builder webResource = client
				   .resource("http://localhost:8080/service/admin")
				   .header("Authorization", "Bearer "+token);

				ClientResponse response = webResource.accept("application/json")
		                   .get(ClientResponse.class);			
/*
				if (response.getStatus() != 200) {
				   throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
				}*/

				String output = response.getEntity(String.class);

				System.out.println("Output from Server .... \n");
				System.out.println(output);

		
		return output;
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/v2/public/sms")
	public String getPublicSMSDetail(@QueryParam("token") String token){
		
		System.out.println(token);
		Client client = Client.create();
		Builder webResource = client
				   .resource("http://localhost:8080/service/public")
				   .header("Authorization", "Bearer "+token);

				ClientResponse response = webResource.accept("application/json")
		                   .get(ClientResponse.class);			
/*
				if (response.getStatus() != 200) {
				   throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
				}*/

				String output = response.getEntity(String.class);

				System.out.println("Output from Server .... \n");
				System.out.println(output);

		
		return output;
		
	}
}
