package segura.taylor.bl.entidades;

import java.util.Objects;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Reservacion {

    //Variables
    private Mascota mascota;
    private String fechaEntrada;
    private String fechaSalida;

    //Propiedades
    public Mascota getMascota() {
        return this.mascota;
    }

    public void setMascota(Mascota value) {
        this.mascota = value;
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
     * @param pMascota objeto de la clase Mascota que define la mascota que asiste a la reservacion
     * @param pFechaEntrada String que define la fecha de entrada para la reservacion
     * @param pFechaSalida String que define la fecha de salida para la reservacion
     */
    public Reservacion(Mascota pMascota, String pFechaEntrada, String pFechaSalida) {
        this.mascota = pMascota;
        this.fechaEntrada = pFechaEntrada;
        this.fechaSalida = pFechaSalida;
    }

    //Metodos
    @Override
    public String toString() {
        String resultado = "Reservacion [Mascota: " + this.mascota + ", fecha de entrada: " + this.fechaEntrada + ", fecha de salida: " + this.fechaSalida + "]";
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservacion that = (Reservacion) o;
        return Objects.equals(mascota, that.mascota) &&
                Objects.equals(fechaEntrada, that.fechaEntrada) &&
                Objects.equals(fechaSalida, that.fechaSalida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mascota, fechaEntrada, fechaSalida);
    }
}
