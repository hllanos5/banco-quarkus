package org.acme.proxy;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class TipoCambioProxyEntity {
    private String fecha;
    private Double sunat;
    private Double compra;
    private Double venta;
}
