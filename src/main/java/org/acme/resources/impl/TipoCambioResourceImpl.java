package org.acme.resources.impl;

import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.AllArgsConstructor;
import org.acme.dtos.TipoCambioDto;
import org.acme.dtos.TipoCambioRequest;
import org.acme.dtos.TipoCambioResponse;
import org.acme.entities.TipoCambio;
import org.acme.resources.TipoCambioResource;
import org.acme.services.TipoCambioService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


@ApplicationScoped
@AllArgsConstructor
public class TipoCambioResourceImpl implements TipoCambioResource {

    private TipoCambioService tipoCambioService;
    @Override
    public TipoCambioResponse getTipoCambio(TipoCambioRequest request) {

        TipoCambioResponse response = new TipoCambioResponse();

        long contador = tipoCambioService.countByDniAndFecha(request.getDni(), request.getFechaCustom());

        if(contador<10){

            TipoCambio data = new  TipoCambio();
            data.setFecha(request.getFechaCustom());
            data.setDni(request.getDni());

            tipoCambioService.registrar(data);

            response.setCodigo("001");
            response.setDescripcion("OK");
            response.setTipoCambio(tipoCambioService.getTipoCambio(request.getFecha()));

        }
        else{
            response.setCodigo("002");
            response.setDescripcion("NO-OK");
        }
        return response;

    }


}
