package segura.taylor.bl.entidades;

import java.util.Objects;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Cita {

    //Variables

    private Mascota mascota;
    private String fecha;
    private String hora;
    private String observaciones;

    //Propiedades
    public Mascota getMascota() {
        return this.mascota;
    }

    public void setMascota(Mascota value) {
        this.mascota = value;
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
     * @param pMascota objeto de la clase Mascota que contiene la mascota que asiste a la cita
     * @param pFecha String que define la fecha de la cita
     * @param pHora String que define la hora de la cita
     * @param pObservaciones String que define las observaciones de la cita
     */
    public Cita(Mascota pMascota, String pFecha, String pHora, String pObservaciones) {
        this.mascota = pMascota;
        this.fecha = pFecha;
        this.hora = pHora;
        this.observaciones = pObservaciones;
    }

    //Metodos
    @Override
    public String toString() {
        String resultado = "Cita [Mascota: " + this.mascota + ", fecha de la cita: " + this.fecha + ", hora de la cita: " + this.hora + ", observaciones: " + this.observaciones + "]";
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cita cita = (Cita) o;
        return Objects.equals(mascota, cita.mascota) &&
                Objects.equals(fecha, cita.fecha) &&
                Objects.equals(hora, cita.hora) &&
                Objects.equals(observaciones, cita.observaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mascota, fecha, hora, observaciones);
    }
}
