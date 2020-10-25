package segura.taylor.bl.entidades;

import java.util.Objects;

/**
 *
 * @author Taylor Segura Vindas
 */
public class Mascota {

    //Variables

    private String nombre;
    private Duenno duenno;
    private String foto;
    private String observaciones;
    private int ranking;

    //Propiedades
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String value) {
        this.nombre = value;
    }

    public Duenno getDuenno() {
        return this.duenno;
    }

    public void setDuenno(Duenno value) {
        this.duenno = value;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String value) {
        this.foto = value;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setRanking(int value) {
        this.ranking = value;
    }

    //Constructores
    public Mascota() {
    }

    /**
     * Metodo constructor para la clase Mascota
     * @param pNombre String que define el nombre de la mascota
     * @param pDuenno objeto de la clase Duenno que define al dueño de la mascota
     * @param pFoto String que define la foto de perfil de la mascota
     * @param pObservaciones String que define las observcaciones para la mascota
     * @param pRanking int que define el numero de estrellas para el ranking de la mascota
     */
    public Mascota(String pNombre, Duenno pDuenno, String pFoto, String pObservaciones, int pRanking) {
        this.nombre = pNombre;
        this.duenno = pDuenno;
        this.foto = pFoto;
        this.observaciones = pObservaciones;
        this.ranking = pRanking;
    }
    /**
     * Metodo constructor para la clase Mascota
     * @param pNombre String que define el nombre de la mascota
     * @param pFoto String que define la foto de perfil de la mascota
     * @param pObservaciones String que define las observcaciones para la mascota
     * @param pRanking int que define el numero de estrellas para el ranking de la mascota
     */
    public Mascota(String pNombre, String pFoto, String pObservaciones, int pRanking) {
        this.nombre = pNombre;
        this.duenno = new Duenno("Default", "1-2345-6789", "none", "none");
        this.foto = pFoto;
        this.observaciones = pObservaciones;
        this.ranking = pRanking;
    }

    //Metodos
    @Override
    public String toString() {
        String resultado = "Mascota [Nombre: " + this.nombre + ", foto: " + this.foto + ", ranking: " + this.ranking + ", observaciones: " + this.observaciones + "] " + this.duenno.toString();
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mascota mascota = (Mascota) o;
        return ranking == mascota.ranking &&
                Objects.equals(nombre, mascota.nombre) &&
                Objects.equals(duenno, mascota.duenno) &&
                Objects.equals(foto, mascota.foto) &&
                Objects.equals(observaciones, mascota.observaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, duenno, foto, observaciones, ranking);
    }
}
