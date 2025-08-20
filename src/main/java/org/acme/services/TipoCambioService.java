package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.acme.dtos.TipoCambioDto;
import org.acme.entities.TipoCambio;
import org.acme.mapper.TipoCambioMapper;
import org.acme.repository.TipoCambioEntity;
import org.acme.repository.TipoCambioRepository;

import java.util.List;

@ApplicationScoped
@AllArgsConstructor
public class TipoCambioService {

    private TipoCambioRepository tipoCambioRepository;

    public TipoCambioDto getTipoCambio(String fecha) {
        TipoCambioEntity postEntities = tipoCambioRepository.getTipoCambio(fecha);
        return TipoCambioMapper.INSTANCE.tipoCambioEntitiesToTipoCambioDtos(postEntities);
    }

    public List<TipoCambio> findAllTipoCambioPorDni (String dni){
        return tipoCambioRepository.findAllByDni(dni);
    }

    @Transactional
    public TipoCambio registrar(TipoCambio tipoCambio) {

        tipoCambioRepository.persist(tipoCambio);
        return tipoCambio;
    }

    public long countByDniAndFecha(String dni, String fecha){
        return tipoCambioRepository.countByDniAndFecha(dni, fecha);
    }



}
