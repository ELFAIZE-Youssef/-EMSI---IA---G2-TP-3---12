package ma.emsi.elfaize.tp3elfaize.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/guide")
public class GuideTouristiqueResource {
    @GET
    @Path("/lieu/{ville_ou_pays}")
    @Produces(MediaType.APPLICATION_JSON)
    public String[] getLieu(@PathParam("ville_ou_pays") String lieu) {
        // Pour le moment, on retourne juste la valeur reçue
        if (lieu.equalsIgnoreCase("Maroc")) {
            return new String[] {"Marrakech", "Chefchaouen"};
        } else if (lieu.equalsIgnoreCase("France")) {
            return new String[] {"Paris", "Nice"};
        } else if (lieu.equalsIgnoreCase("Espagne")) {
            return new String[] {"Barcelone", "Madrid"};
        } else if (lieu.equalsIgnoreCase("Italie")) {
            return new String[] {"Rome", "Venise"};
        } else {
            return new String[] {"Aucun lieu trouvé pour : " + lieu};
        }    }
}