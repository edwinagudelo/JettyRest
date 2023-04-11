/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.sbi.jettyrest.rest;

import co.sbi.jettyrest.model.DbActions;
import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
