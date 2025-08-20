package org.acme.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class TipoCambioEntity {

    private String fecha;
    private Double sunat;
    private Double compra;
    private Double venta;
}
