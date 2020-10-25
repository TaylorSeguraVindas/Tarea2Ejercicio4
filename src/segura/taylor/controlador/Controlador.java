package segura.taylor.controlador;

import segura.taylor.bl.entidades.*;
import segura.taylor.bl.gestor.Gestor;
import segura.taylor.ui.UI;

import java.util.ArrayList;

/**
 * La clase Controlador se usa para realizar la comunicación entre
 * el UI y el Gestor
 *
 * @author Taylor Segura Vindas
 * @version 1.0
 * @since 2020-10-24
 */
public class Controlador {
    private Gestor gestor = new Gestor();
    private UI ui = new UI();

    /**
     * Este método se usa para iniciar el comportamiento del controlador
     */
    public void iniciarPrograma() {
        int opcion = 0;

        do {
            ui.imprimirLinea("\n\n\n\n");
            ui.imprimirLinea("***Bienvenido a Veterinaria MOKA***");
            ui.imprimirLinea("1. Registrar cita");
            ui.imprimirLinea("2. Listar citas");
            ui.imprimirLinea("3. Registrar reservacion");
            ui.imprimirLinea("4. Listar reservaciones");
            ui.imprimirLinea("5. Registrar usuario");
            ui.imprimirLinea("6. Listar usuarios");
            ui.imprimirLinea("7. Registrar mascota");
            ui.imprimirLinea("8. Listar mascotas");
            ui.imprimirLinea("9. Salir");

            ui.imprimir("\nSu opcion: ");
            opcion = ui.leerEntero();
            procesarOpcion(opcion);
        } while (opcion != 9);
    }

    /**
     * Este método se usa para procesar la opción recibida por el usuario
     * y realizar una acción basada en esta
     * @param  opcion  el entero que el usuario ingresó
     */
    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarCita();
                break;
            case 2:
                listarCitas();
                break;
            case 3:
                registrarReservacion();
                break;
            case 4:
                listarReservaciones();
                break;
            case 5:
                registrarUsuario();
                break;
            case 6:
                listarUsuarios();
                break;
            case 7:
                registrarMascota();
                break;
            case 8:
                listarMascotas();
                break;
            case 9:
                ui.imprimirLinea("Adios");
                break;
            default:
                ui.imprimirLinea("Opcion invalida");
                break;
        }
    }

    //Citas
    /**
     * Este método se usa para llevar a cabo el registro de una cita
     * @return true si el registro es exitoso, false si la cita ya existe
     */
    private boolean registrarCita() {
        ui.imprimirLinea("\n\nBienvenido al registro de citas");
        ui.imprimir("Ingrese el nombre de la mascota: ");
        String nombre = ui.leerLinea();

        ui.imprimir("Ingrese la fecha de la cita: ");
        String fecha = ui.leerLinea();

        ui.imprimir("Ingrese la hora de la cita: ");
        String hora = ui.leerLinea();

        ui.imprimir("Ingrese las observaciones: ");
        String observaciones = ui.leerLinea();

        boolean resultado = gestor.registrarCita(nombre, fecha,  hora, observaciones);
        if(resultado){
            ui.imprimirLinea("Registro realizado correctamente");
        } else {
            ui.imprimirLinea("La cita ya existe :(");
        }

        return resultado;
    }

    /**
     * Este método se usa mostrar en el UI todas las citas que se han registrado
     */
    private void listarCitas() {
        ui.imprimirLinea("\n\nListado de citas");
        ArrayList<Cita> citas = gestor.listarCitas();
        for (Cita objCita: citas) {
            ui.imprimirLinea(objCita.toString());
        }
    }

    //Reservaciones
    /**
     * Este método se usa para llevar a cabo el registro de una reservacion
     * @return true si el registro es exitoso, false si la reservacion ya existe
     */
    private boolean registrarReservacion() {
        ui.imprimirLinea("\n\nBienvenido al registro de reservaciones");
        ui.imprimir("Ingrese el nombre de la mascota: ");
        String nombre = ui.leerLinea();

        ui.imprimir("Ingrese la fecha de entrada: ");
        String fechaEntrada = ui.leerLinea();

        ui.imprimir("Ingrese la fecha de salida: ");
        String fechaSalida = ui.leerLinea();

        boolean resultado = gestor.registrarReservacion(nombre, fechaEntrada, fechaSalida);
        if(resultado){
            ui.imprimirLinea("Registro realizado correctamente");
        } else {
            ui.imprimirLinea("La reservacion ya existe :(");
        }

        return resultado;
    }
    /**
     * Este método se usa mostrar en el UI todas las reservaciones que se han registrado
     */
    private void listarReservaciones() {
        ui.imprimirLinea("\n\nListado de reservaciones");
        ArrayList<Reservacion> reservaciones = gestor.listarReservaciones();
        for (Reservacion objReservacion: reservaciones) {
            ui.imprimirLinea(objReservacion.toString());
        }
    }

    //Usuarios
    /**
     * Este método se usa para llevar a cabo el registro de un usuario
     * @return true si el registro es exitoso, false si el usuario ya existe
     */
    private boolean registrarUsuario() {
        ui.imprimirLinea("\n\nBienvenido al registro de usuarios");
        ui.imprimir("Ingrese el nombre del usuario: ");
        String nombre = ui.leerLinea();

        ui.imprimir("Ingrese la cedula: ");
        String cedula = ui.leerLinea();

        ui.imprimir("Ingrese el numero de telefono: ");
        String telefono = ui.leerLinea();

        ui.imprimir("Ingrese la direccion: ");
        String direccion = ui.leerLinea();

        ui.imprimirLinea("Ingrese el estado: ");
        ui.imprimirLinea("1. ACTIVO: ");
        ui.imprimirLinea("2. INACTIVO: ");
        int indiceEstado = ui.leerEntero();
        Usuario.Estado estado = (indiceEstado == 1) ? Usuario.Estado.ACTIVO : Usuario.Estado.INACTIVO;

        ui.imprimirLinea("Ingrese el rol: ");
        ui.imprimirLinea("1. DOCTOR: ");
        ui.imprimirLinea("2. SECRETARIA: ");
        int indiceRol = ui.leerEntero();
        Usuario.Rol rol = (indiceRol == 1) ? Usuario.Rol.DOCTOR : Usuario.Rol.SECRETARIA;

        boolean resultado = gestor.registrarUsuario(nombre, cedula, telefono, direccion, estado, rol);
        if(resultado){
            ui.imprimirLinea("Registro realizado correctamente");
        } else {
            ui.imprimirLinea("El usuario ya existe :(");
        }

        return resultado;
    }
    /**
     * Este método se usa mostrar en el UI todos los motores que se han registrado
     */
    private void listarUsuarios() {
        ui.imprimirLinea("\n\nListado de usuarios");
        ArrayList<Usuario> usuarios = gestor.listarUsuarios();
        for (Usuario objUsuario: usuarios) {
            ui.imprimirLinea(objUsuario.toString());
        }
    }

    //Mascotas
    /**
     * Este método se usa para llevar a cabo el registro de una mascota
     * @return true si el registro es exitoso, false si la mascota ya existe
     */
    private boolean registrarMascota() {
        ui.imprimirLinea("\n\nBienvenido al registro de mascotas");
        ui.imprimirLinea("DATOS DE LA MASCOTA");
        ui.imprimir("Ingrese el nombre de la mascota: ");
        String nombreMascota = ui.leerLinea();

        ui.imprimir("Ingrese la foto: ");
        String foto = ui.leerLinea();

        ui.imprimir("Ingrese las observaciones: ");
        String observaciones = ui.leerLinea();

        ui.imprimir("Ingrese el ranking: ");
        int ranking = ui.leerEntero();

        ui.imprimirLinea("DATOS DEL DUEÑO");
        ui.imprimir("Ingrese el nombre del dueño: ");
        String nombreDuenno = ui.leerLinea();

        ui.imprimir("Ingrese la cedula del dueño: ");
        String cedula = ui.leerLinea();

        ui.imprimir("Ingrese el telefono del dueño: ");
        String telefono = ui.leerLinea();

        ui.imprimir("Ingrese la direccion del dueño: ");
        String direccion = ui.leerLinea();

        Duenno duennoMascota = new Duenno(nombreDuenno, cedula, telefono, direccion);
        boolean resultado = gestor.registrarMascota(nombreMascota, duennoMascota, foto, observaciones, ranking);
        if(resultado){
            ui.imprimirLinea("Registro realizado correctamente");
        } else {
            ui.imprimirLinea("La mascota ya existe :(");
        }

        return resultado;
    }
    /**
     * Este método se usa mostrar en el UI todas las mascotas que se han registrado
     */
    private void listarMascotas() {
        ArrayList<Mascota> mascotas = gestor.listarMascotas();
        for (Mascota objMascota: mascotas) {
            ui.imprimirLinea(objMascota.toString());
        }
    }
}
