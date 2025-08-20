package org.acme.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.acme.dtos.TipoCambioDto;
import org.acme.dtos.TipoCambioRequest;


@Path("/tipo-cambio")
public interface TipoCambioResource {

    @GET
    TipoCambioDto getTipoCambio(TipoCambioRequest requestBody);
}
