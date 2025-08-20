package org.acme.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TipoCambioDto {
    private String fecha;
    private Double sunat;
    private Double compra;
    private Double venta;
}
