package segura.taylor.bl.entidades;

import java.util.Objects;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Cita {

    //Variables

    private String nombreMascota;
    private String fecha;
    private String hora;
    private String observaciones;

    //Propiedades
    public String getNombreMascota() {
        return this.nombreMascota;
    }

    public void setNombreMascota(String value) {
        this.nombreMascota = value;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String value) {
        this.fecha = value;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String value) {
        this.hora = value;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    //constructores
    public Cita() {
    }

    /**
     * Metodo constructor para la clase Cita
     * @param pNombreMascota String que contiene el nombre de la mascota
     * @param pFecha String que define la fecha de la cita
     * @param pHora String que define la hora de la cita
     * @param pObservaciones String que define las observaciones de la cita
     */
    public Cita(String pNombreMascota, String pFecha, String pHora, String pObservaciones) {
        this.nombreMascota = pNombreMascota;
        this.fecha = pFecha;
        this.hora = pHora;
        this.observaciones = pObservaciones;
    }

    //Metodos
    @Override
    public String toString() {
        String resultado = "Cita [Mascota: " + this.nombreMascota + ", fecha de la cita: " + this.fecha + ", hora de la cita: " + this.hora + ", observaciones: " + this.observaciones + "]";
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cita cita = (Cita) o;
        return Objects.equals(nombreMascota, cita.nombreMascota) &&
                Objects.equals(fecha, cita.fecha) &&
                Objects.equals(hora, cita.hora) &&
                Objects.equals(observaciones, cita.observaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreMascota, fecha, hora, observaciones);
    }
}
