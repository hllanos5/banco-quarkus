package org.acme.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.acme.dtos.TipoCambioDto;


@Path("/tipo-cambio")
public interface TipoCambioResource {

    @GET
    @Path("/{fecha}")
    TipoCambioDto getTipoCambio(@PathParam("fecha") String fecha);
}
