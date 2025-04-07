package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculate/radius")
public class CalculateService {
    
    @GET
    @Path("{area}")
    @Produces(MediaType.APPLICATION_JSON)
    public Circulo calculaRaio(@PathParam("area")double area){
        double raio = Math.sqrt(area/Math.PI);
        Circulo circulo = new Circulo(area, raio);
        return circulo;
    }
}