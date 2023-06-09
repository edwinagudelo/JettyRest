package co.sbi.jettyrest.web.rest;

import co.sbi.jettyrest.infrastructure.repositories.DbActions;
import java.util.HashMap;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author Edwin Agudelo (edwin.agudelo@gmail.com)
 */
@Path("api")
public class MyController {
    
    @GET
    @Path("mypgversion")
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<String,String> getVersion(){
        HashMap<String,String> retorno = new HashMap();
        retorno.put("version", DbActions.getVersion());
        return retorno;
    }
    
}
