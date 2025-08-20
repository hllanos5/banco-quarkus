package org.acme.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoCambioRequest {
    private String dni;
    private String fecha;
}
