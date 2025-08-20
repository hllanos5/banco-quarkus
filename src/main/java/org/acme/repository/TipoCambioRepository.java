package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.entities.TipoCambio;
import org.acme.mapper.TipoCambioMapper;
import org.acme.proxy.TipoCambioProxy;
import org.acme.proxy.TipoCambioProxyEntity;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;


@ApplicationScoped
public class TipoCambioRepository implements PanacheRepositoryBase<TipoCambio,Long> {

    private TipoCambioProxy tipoCambioProxy;

    public TipoCambioRepository(@RestClient TipoCambioProxy postProxy) {
        this.tipoCambioProxy = postProxy;
    }

    public TipoCambioEntity getTipoCambio(String fecha) {
        TipoCambioProxyEntity tipoCambioProxyEntities = tipoCambioProxy.getTipoCambio(fecha);
        return TipoCambioMapper.INSTANCE.tipoCambioProxyEntitiesToTipoCambioDtos(tipoCambioProxyEntities);
    }

    public List<TipoCambio> findAllByDni(String dni) {
        return find("dni", dni).list();
    }

    public long countByDniAndFecha(String dni, String fecha) {
        return count("dni = ?1 and fecha = ?2", dni, fecha);
    }
}
