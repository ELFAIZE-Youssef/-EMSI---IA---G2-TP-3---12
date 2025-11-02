package ma.emsi.elfaize.tp3elfaize;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Path("/personnes/{nom}")
    @Produces("text/plain")
    public Response  hello(@PathParam("nom") String nom) {
        //return Response.ok("Hello, " + nom).build();

        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity("Erreur interne : impossible de saluer " + nom)
                .build();
    }
}