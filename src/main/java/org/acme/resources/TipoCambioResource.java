package org.acme.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.acme.dtos.TipoCambioRequest;
import org.acme.dtos.TipoCambioResponse;


@Path("/tipo-cambio")
public interface TipoCambioResource {

    @GET
    TipoCambioResponse getTipoCambio(TipoCambioRequest requestBody);
}
