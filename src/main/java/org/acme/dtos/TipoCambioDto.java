package org.acme.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class TipoCambioDto {
    private String fecha;
    private Double sunat;
    private Double compra;
    private Double venta;
}
