package org.acme.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class TipoCambioRequest {
    private String dni;
    private String fecha;

    public String getFechaCustom(){
        if(fecha.equals("today")){
            LocalDate hoy = LocalDate.now();
            return hoy.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }
        return fecha;
    }
}
