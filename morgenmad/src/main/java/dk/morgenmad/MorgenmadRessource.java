/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.morgenmad;

import dk.morgenmad.service.HelloBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author JC
 */
@Path("/morgenmad")
public class MorgenmadRessource {
    @Inject 
    HelloBean hb;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        //return "Hello";
        return hb.hello();
        
    } 
}
