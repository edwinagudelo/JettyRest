package co.sbi.jettyrest.rest;

import co.sbi.jettyrest.repositories.DbActions;
import java.util.HashMap;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author ICM7223A
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
