package segura.taylor.bl.entidades;

import java.util.Objects;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Reservacion {

    //Variables

    private String nombreMascota;
    private String fechaEntrada;
    private String fechaSalida;

    //Propiedades
    public String getNombreMascota() {
        return this.nombreMascota;
    }

    public void setNombreMascota(String value) {
        this.nombreMascota = value;
    }

    public String getFechaEntrada() {
        return this.fechaEntrada;
    }

    public void setFechaEntrada(String value) {
        this.fechaEntrada = value;
    }

    public String getFechaSalida() {
        return this.fechaSalida;
    }

    public void setFechaSalida(String value) {
        this.fechaSalida = value;
    }

    //Constructores
    public Reservacion() {
    }

    /**
     * Metodo constructor para la clase Reservacion
     * @param pNombreMascota String que define el nombre de la mascota
     * @param pFechaEntrada String que define la fecha de entrada para la reservacion
     * @param pFechaSalida String que define la fecha de salida para la reservacion
     */
    public Reservacion(String pNombreMascota, String pFechaEntrada, String pFechaSalida) {
        this.nombreMascota = pNombreMascota;
        this.fechaEntrada = pFechaEntrada;
        this.fechaSalida = pFechaSalida;
    }

    //Metodos
    @Override
    public String toString() {
        String resultado = "Reservacion [Mascota: " + this.nombreMascota + ", fecha de entrada: " + this.fechaEntrada + ", fecha de salida: " + this.fechaSalida + "]";
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservacion that = (Reservacion) o;
        return Objects.equals(nombreMascota, that.nombreMascota) &&
                Objects.equals(fechaEntrada, that.fechaEntrada) &&
                Objects.equals(fechaSalida, that.fechaSalida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreMascota, fechaEntrada, fechaSalida);
    }
}
