package com.grupoasv.mulaka.rest;

import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Created by jaherrera on 28/11/14.
 */

//http://localhost:8080/miserviciorest/atenderPeticion?parametro=Hola%20pepe

//@Path("atenderPeticion")
//public class AtenderPeticion extends AbstractRestService {
//
//    //No usemos los parametros así si deseamos hacerlo un singlerton
//
//    @QueryParam("parametro")
//    protected String parametro;
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response atender() throws IOException {
//
//        String returnValue = "Esto es lo pasado " + this.parametro;
//
//        ObjectMapper mapper = new ObjectMapper();
//        String jsonResponse = mapper.writeValueAsString(returnValue);
//
//        return ok(jsonResponse);
//    }

    //http://localhost:8080/miserviciorest/atenderPeticion/pepe

    @Path("atenderPeticion/{parametro}")
    public class AtenderPeticion extends AbstractRestService {

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public Response atender(@PathParam("parametro") String parametro) throws IOException {

            String returnValue = "Esto es lo pasado " + parametro;

            ObjectMapper mapper = new ObjectMapper();
            String jsonResponse = mapper.writeValueAsString(returnValue);

            return ok(jsonResponse);
        }

    }
