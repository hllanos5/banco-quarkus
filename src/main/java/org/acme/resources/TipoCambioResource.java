package org.acme.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.acme.dtos.TipoCambioRequest;
import org.acme.dtos.TipoCambioResponse;
import org.acme.entities.TipoCambio;

import java.util.List;


@Path("/tipo-cambio")
public interface TipoCambioResource {

    @GET
    TipoCambioResponse getTipoCambio(TipoCambioRequest requestBody);

    @GET
    @Path("/dni")
    List<TipoCambio> getListadoConsultaPorDni(TipoCambioRequest requestBody);
}
