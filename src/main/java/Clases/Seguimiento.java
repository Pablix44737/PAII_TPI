
package Clases;
import java.util.Date;
//import java.time.LocalDate; <- En caso de que no usemos Date

public class Seguimiento{
    private String idSeguimiento;
    private Date fecha;
    //private LocalDate fecha;
    private String tipoDeContacto;
    private String observaciones;

    public Seguimiento(Date fecha, String tipoDeContacto, String observaciones) {
        this.fecha = fecha;
        this.tipoDeContacto = tipoDeContacto;
        this.observaciones = observaciones;
        //El metodo "registrarSeguimiento()" del UML era este metodo constructor, no?
        // ↳ Si es asi, ver la implementacion de idSeguimiento
    }
    
    public String obtenerInfoDeSeguimiento(){
        return "Fecha: " + fecha + " - Observaciones: " + observaciones;
        //↳ Algun otro dato relevante de Seguimiento?
    }
}
