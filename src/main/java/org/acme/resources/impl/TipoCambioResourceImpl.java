package org.acme.resources.impl;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import org.acme.dtos.TipoCambioDto;
import org.acme.resources.TipoCambioResource;
import org.acme.services.TipoCambioService;


@ApplicationScoped
@AllArgsConstructor
public class TipoCambioResourceImpl implements TipoCambioResource {

    private TipoCambioService tipoCambioService;

    @Override
    public TipoCambioDto getTipoCambio(String fecha) {
        return tipoCambioService.getTipoCambio(fecha);
    }
}
