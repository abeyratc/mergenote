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

import note.beans.Note;
import note.beans.Result;
import note.beans.ServerInfo;
import note.services.NotesService;

@Component
@Path("/notes")
public class NotesResource {
	
	@Autowired
	private NotesService notesService;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response saveNote(Note note) throws Exception {
		Result finalResult = notesService.insertNote(note);
		return Response.status(200).header("Access-Control-Allow-Origin", "*").entity(finalResult).build();
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

}
