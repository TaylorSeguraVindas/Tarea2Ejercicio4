package segura.taylor.bl.entidades;

import java.util.Objects;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Duenno {

    //Variables

    private String nombreCompleto;
    private String cedula;
    private String telefono;
    private String direccion;

    //Propiedades
    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String value) {
        this.nombreCompleto = value;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String value) {
        this.cedula = value;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String value) {
        this.telefono = value;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String value) {
        this.direccion = value;
    }

    //Constructores
    public Duenno() {
    }

    /**
     * Metodo constructor para la clase Duenno
     * @param pNombre String que define el nombre del dueño
     * @param pCedula String que define la cedula del dueño
     * @param pTelefono String que define el numero de telefono del dueño
     * @param pDireccion String que define la direccion del dueño
     */
    public Duenno(String pNombre, String pCedula, String pTelefono, String pDireccion) {
        this.nombreCompleto = pNombre;
        this.cedula = pCedula;
        this.telefono = pTelefono;
        this.direccion = pDireccion;
    }

    //Metodos
    @Override
    public String toString() {
        String resultado = "Dueño [Nombre: " + this.nombreCompleto + ", cedula: " + this.cedula + ", telefono: " + this.telefono + ", direccion: " + this.direccion + "]";
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duenno duenno = (Duenno) o;
        return Objects.equals(nombreCompleto, duenno.nombreCompleto) &&
                Objects.equals(cedula, duenno.cedula) &&
                Objects.equals(telefono, duenno.telefono) &&
                Objects.equals(direccion, duenno.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCompleto, cedula, telefono, direccion);
    }
}
