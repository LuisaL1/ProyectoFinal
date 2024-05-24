package edu.cue.proyectofinal.app;

import edu.cue.proyectofinal.app.serviceAdmin.AdminImpl;
import edu.cue.proyectofinal.app.serviceAdmin.AdminService;
import edu.cue.proyectofinal.app.serviceGame.GameImpl;
import edu.cue.proyectofinal.app.serviceGame.GameService;
import edu.cue.proyectofinal.app.serviceUser.UserImpl;
import edu.cue.proyectofinal.app.serviceUser.UserService;
import edu.cue.proyectofinal.domainAdmin.*;
import edu.cue.proyectofinal.domainGame.Juegos;
import edu.cue.proyectofinal.domainGame.Review;
import edu.cue.proyectofinal.domainUser.Usuario;

import java.time.LocalDate;
import java.util.List;

public class GameHaven {

    public static void main(String[] args) {
        // Ejemplo de uso de los servicios de administrador
        AdminService adminService = new AdminImpl();

        // Obtener ganancias
        Ganancias ganancias = adminService.obtenerGanancias();
        System.out.println("Ganancias totales: $" + ganancias.getCantidad());

        // Ejemplo de uso de los servicios de juegos
        GameService gameService = new GameImpl();

        // Obtener un juego por título
        String tituloJuego = "Nombre del juego";
        Juegos juego = gameService.obtenerJuegoPorTitulo(tituloJuego);
        if (juego != null) {
            System.out.println("Juego encontrado: " + juego.getTitulo());
        } else {
            System.out.println("No se encontró ningún juego con el título: " + tituloJuego);
        }

        // Ejemplo de uso de los servicios de usuario
        UserService userService = new UserImpl();

        // Registrar un nuevo usuario
        Usuario nuevoUsuario = new Usuario("NombreUsuario", "contraseña123", "Correo@example.com");
        userService.registrarUsuario(nuevoUsuario);
        System.out.println("Usuario registrado: " + nuevoUsuario.getNombreUsuario());
    }
}
