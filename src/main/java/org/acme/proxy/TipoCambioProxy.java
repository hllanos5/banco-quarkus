package org.acme.proxy;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(configKey = "api-proxy")
@Path("/tipo-cambio")
public interface TipoCambioProxy {

    @GET
    @Path("/{fecha}.json")
    @Produces(MediaType.APPLICATION_JSON)
    TipoCambioProxyEntity getTipoCambio(@PathParam("fecha") String fecha);
}
