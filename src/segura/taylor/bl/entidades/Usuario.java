package segura.taylor.bl.entidades;

import java.util.Objects;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Usuario {
    public enum Rol{
        DOCTOR,
        SECRETARIA
    }
    public enum Estado{
        ACTIVO,
        INACTIVO
    }
    //Variables

    private String nombreCompleto;
    private String cedula;
    private String telefono;
    private String direccion;
    private Estado estado;
    private Rol rol;

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

    public Estado getEstado() { return estado; }

    public void setEstado(Estado estado) { this.estado = estado; }

    public Rol getRol() { return rol; }

    public void setRol(Rol rol) { this.rol = rol; }

    //Constructores
    public Usuario() {
    }

    /**
     * Metodo constructor para la clase Usuario
     * @param nombreCompleto String que define el nombre de este usuario
     * @param cedula String que define la cedula de este usuario
     * @param telefono String que define el telefono de este usuario
     * @param direccion String que define la direccion de este usuario
     * @param estado valor del enumerador Usuario.Estado que define el estado de este usuario
     * @param rol valor del enumerador Usuario.Rol que define el rol de este usuario
     */
    public Usuario(String nombreCompleto, String cedula, String telefono, String direccion, Estado estado, Rol rol) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
        this.rol = rol;
    }

    //Metodos
    @Override
    public String toString() {
        String resultado = "Usuario [Nombre: " + this.nombreCompleto + ", cedula: " + this.cedula + ", telefono: " + this.telefono + ", direccion: " + this.direccion + ", estado: " + this.estado + ", rol: " + this.rol + "]";
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombreCompleto, usuario.nombreCompleto) &&
                Objects.equals(cedula, usuario.cedula) &&
                Objects.equals(telefono, usuario.telefono) &&
                Objects.equals(direccion, usuario.direccion) &&
                estado == usuario.estado &&
                rol == usuario.rol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCompleto, cedula, telefono, direccion, estado, rol);
    }
}
