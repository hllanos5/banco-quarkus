package org.acme.mapper;
import org.acme.dtos.TipoCambioDto;
import org.acme.proxy.TipoCambioProxyEntity;
import org.acme.repository.TipoCambioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TipoCambioMapper {
    TipoCambioMapper INSTANCE = Mappers.getMapper(TipoCambioMapper.class);

    TipoCambioDto tipoCambioEntitiesToTipoCambioDtos (TipoCambioEntity tipoCambio);
    TipoCambioEntity tipoCambioProxyEntitiesToTipoCambioDtos(TipoCambioProxyEntity tipoCambio);

}
