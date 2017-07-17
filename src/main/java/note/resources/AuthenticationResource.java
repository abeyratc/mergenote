package note.resources;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import note.beans.Credentials;
import note.beans.Principal;
import note.beans.ServerInfo;
import note.services.AuthenticationService;
import note.utils.CredentialsValidator;

@Component
@Path("/authc")
public class AuthenticationResource {
	
	@Autowired
	private AuthenticationService authenticationService;

	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(Credentials credentials) {
		if(CredentialsValidator.valid(credentials.getUsername()) && CredentialsValidator.valid(credentials.getPassword())) {
			Principal principal = authenticationService.authenticate(credentials);
			if(principal != null) {
				return Response.status(200).header("Access-Control-Allow-Origin", "*").entity(principal).build();
			}
		}
		return Response.status(Response.Status.UNAUTHORIZED).build();
	}
	
	@GET
	@Path("/ping")
	@Produces(MediaType.APPLICATION_JSON)
	public ServerInfo ping() {
		final SimpleDateFormat SDF = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		ServerInfo server = new ServerInfo();
		server.setName("IBM Liberty Profile 16.x.x");
		server.setStatus("Server is Running ...");
		server.setCurrentDate(SDF.format(new Date()));
		return server;
	}
/**
 * http://stackoverflow.com/questions/4989063/what-is-the-meaning-of-subject-vs-user-vs-principal-in-a-security-context
 * http://stackoverflow.com/questions/26777083/best-practice-for-rest-token-based-authentication-with-jax-rs-and-jersey
 */

}
