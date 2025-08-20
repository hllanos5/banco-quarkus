package org.acme.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoCambioResponse {
    private String codigo;
    private String descripcion;
    private TipoCambioDto tipoCambio;
}
