
package Clases;

import java.util.Date;
//import java.time.LocalDate; <- En caso de que no usemos Date

public class Adopcion {
    private String idAdopcion;
    private String tipo;
    private Date fecha;
    //private LocalDate fecha;
    private String estado;

    public Adopcion(String tipo, Date fecha, String estado) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.estado = estado;
        //No se agrego idAdopcion porque falta ver la 
        //logica del autoincremento en los ID
    }
    
    public String obtenerInfoDeAdopcion(){
        return "Tipo de Adopcion: " + tipo + " - Fecha de Adopcion: " + fecha +
                " - Estado de Adopcion: " + estado;
    }
}
