package org.acme.resources.impl;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import org.acme.dtos.TipoCambioDto;
import org.acme.dtos.TipoCambioRequest;
import org.acme.repository.TipoCambioRepository;
import org.acme.resources.TipoCambioResource;
import org.acme.services.TipoCambioService;


@ApplicationScoped
@AllArgsConstructor
public class TipoCambioResourceImpl implements TipoCambioResource {

    private TipoCambioService tipoCambioService;
    private TipoCambioRepository tipoCambioRepository;
    @Override
    public TipoCambioDto getTipoCambio(TipoCambioRequest request) {

        return tipoCambioService.getTipoCambio(request.getFecha());
    }
}
