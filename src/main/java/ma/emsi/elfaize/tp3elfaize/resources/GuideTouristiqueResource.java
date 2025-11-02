package ma.emsi.elfaize.tp3elfaize.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import ma.emsi.elfaize.tp3elfaize.llm.LlmClient;

@Path("/guide")
public class GuideTouristiqueResource {
    @Inject
    private LlmClient llm;


    @GET
    @Path("/lieu/{ville_ou_pays}")
    @Produces(MediaType.APPLICATION_JSON)
    public String  getLieu(@PathParam("ville_ou_pays") String lieu) {
        return llm.ask(lieu);   }
}