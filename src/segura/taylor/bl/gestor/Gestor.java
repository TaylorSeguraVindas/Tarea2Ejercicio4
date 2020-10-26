package segura.taylor.bl.gestor;

import segura.taylor.bl.entidades.*;
import java.util.ArrayList;

/**
 * La clase Gestor se encarga de toda la lógica base de la aplicación
 * es donde se interactúa directamente con los objetos que se almacenan
 *
 * @author Taylor Segura Vindas
 * @version 1.0
 * @since 2020-10-24
 */
public class Gestor {
    //Variables
    private ArrayList<Cita> citas = new ArrayList<Cita>();
    private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
    private ArrayList<Reservacion> reservaciones = new ArrayList<Reservacion>();
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    //Propiedades
    //Constructores
    public Gestor() {
    }

    //Metodos
    /**
     * Este método se usa para registrar una nueva cita
     * @param pMascota un objeto de la clase Mascota que contiene la mascota que asiste a la cita
     * @param pFecha un String que contiene la fecha de la reservacion
     * @param pHora un String que contiene la hora de la reservación
     * @param pObservaciones un String que contiene las observaciones
     * @return true si el registro es exitoso, false si la cita ya existe
     * @see Cita
     */
    public boolean registrarCita(Mascota pMascota, String pFecha, String pHora, String pObservaciones){
        Cita nuevaCita = new Cita(pMascota, pFecha, pHora, pObservaciones);
        if(!citas.contains(nuevaCita)){
            citas.add(nuevaCita);
            return true;
        }

        return false;
    }
    /**
     * Este método se usa para listar todas las citas que se han creado
     * @return una lista con todas las citas creadas
     * @see Cita
     * @see ArrayList
     */
    public ArrayList<Cita> listarCitas(){
        return this.citas;
    }

    /**
     * Este método se usa para registrar una nueva mascota
     * @param pNombre un String que contiene el nombre de la mascota
     * @param pDuenno un objeto de la clase Duenno que hace referencia al dueño de la mascota
     * @param pFoto un String que contiene el directorio de la foto de perfil
     * @param pObservaciones un String que contiene observaciones sobre la mascota
     * @param pRanking un entero que va del 1 al 5 para representar el ranking de la mascota
     * @return true si el registro es exitoso, false si la mascota ya existe
     * @see Mascota
     */
    public boolean registrarMascota(String pNombre, Duenno pDuenno, String pFoto, String pObservaciones, int pRanking){
        Mascota nuevaMascota;
        if(pDuenno == null){
            nuevaMascota = new Mascota(pNombre, pFoto, pObservaciones, pRanking);
        } else {
            nuevaMascota = new Mascota(pNombre, pDuenno, pFoto, pObservaciones, pRanking);
        }
        if(!mascotas.contains(nuevaMascota)){
            mascotas.add(nuevaMascota);
            return true;
        }

        return false;
    }
    /**
     * Este método se usa para listar todas las mascotas que se han creado
     * @return una lista con todas las mascotas creadas
     * @see Mascota
     * @see ArrayList
     */
    public ArrayList<Mascota> listarMascotas(){
        return this.mascotas;
    }
    /**
     * Este método se usa para buscar una mascota usando como filtro el nombre
     * @param pNombre el nombre de la mascota que se busca
     * @return un objeto de la clase Mascota si se encuentra, null si no se encuentra
     * @see Mascota
     */
    public Mascota buscarMascota(String pNombre){
        for(Mascota objMascota: mascotas){
            if(objMascota.getNombre().equals(pNombre)){
                return objMascota;
            }
        }

        return null;
    }
    /**
     * Este método se usa para registrar una nueva reservacion
     * @param  pMascota un objeto de la clase Mascota que contiene la mascota que asiste a la reservacion
     * @param pFechaEntrada un String que contiene la fecha de entrada
     * @param pFechaSalida un String que contiene la fecha de salida
     * @return true si el registro es exitoso, false si la reservacion ya existe
     * @see Reservacion
     */
    public boolean registrarReservacion(Mascota pMascota, String pFechaEntrada, String pFechaSalida){
        Reservacion nuevaReservacion = new Reservacion(pMascota, pFechaEntrada, pFechaSalida);
        if(!reservaciones.contains(nuevaReservacion)){
            reservaciones.add(nuevaReservacion);
            return true;
        }

        return false;
    }
    /**
     * Este método se usa listar todas las reservaciones que se han creado
     * @return una lista con todas las reservaciones creadas
     * @see Reservacion
     * @see ArrayList
     */
    public ArrayList<Reservacion> listarReservaciones(){
        return this.reservaciones;
    }

    /**
     * Este método se usa para registrar un nuevo usuario
     * @param nombreCompleto un String que contiene el nombre completo del usuario
     * @param cedula un String que contiene la cedula del usuario
     * @param telefono un String que contiene el numero de telefono del usuario
     * @param direccion un String que contiene la direccion del usuario
     * @param estado un valor del enumerador que define el estado del usuario(ACTIVO/INACTIVO)
     * @param rol un valor del enumerador que define el rol del usuario(DOCTOR/SECRETARIA)
     * @return true si el registro es exitoso, false si el usuario ya existe
     * @see Usuario
     */
    public boolean registrarUsuario(String nombreCompleto, String cedula, String telefono, String direccion, Usuario.Estado estado, Usuario.Rol rol){
        Usuario nuevoUsuario = new Usuario(nombreCompleto, cedula, telefono, direccion, estado, rol);
        if(!usuarios.contains(nuevoUsuario)){
            usuarios.add(nuevoUsuario);
            return true;
        }

        return false;
    }
    /**
     * Este método se usa para listar todos los usuarios que se han creado
     * @return una lista con todos los usuarios creados
     * @see Usuario
     * @see ArrayList
     */
    public ArrayList<Usuario> listarUsuarios(){
        return this.usuarios;
    }
}
