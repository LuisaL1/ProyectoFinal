package edu.cue.proyectofinal.app.serviceAdmin;

import edu.cue.proyectofinal.app.serviceAdmin.AdminService;
import edu.cue.proyectofinal.domainAdmin.*;
import edu.cue.proyectofinal.domainGame.Juegos;
import edu.cue.proyectofinal.domainUser.Transaccion;

import java.time.LocalDate;
import java.util.List;

public class AdminImpl implements AdminService {

    private List<Transaccion> listaTransacciones;
    private List<Juegos> listaJuegos;

    // Constructor que no requiere argumentos
    public AdminImpl() {
        this.listaTransacciones = null; // O podrías inicializarlo con una lista vacía: new ArrayList<>()
        this.listaJuegos = null; // Lo mismo aquí
    }

    public Ganancias obtenerGanancias() {
        double totalGanancias = 0.0;
        if (listaTransacciones != null) { // Verifica si la lista de transacciones no es nula
            for (Transaccion transaccion : listaTransacciones) {
                totalGanancias += transaccion.getAmount();
            }
        }
        return new Ganancias(totalGanancias);
    }

    public InversiónTotal obtenerInversion() {
        // Supongamos que cada juego tiene un campo que representa su costo de producción
        double totalInversion = 0.0;
        for (Juegos juego : listaJuegos) {
            totalInversion += juego.getCostoProduccion();
        }
        return new InversiónTotal(totalInversion);
    }

    public JuegosAgotados obtenerJuegosAgotados() {
        int juegosAgotados = 0;
        for (Juegos juego : listaJuegos) {
            if (juego.getStock() == 0) {
                juegosAgotados++;
            }
        }
        return new JuegosAgotados(juegosAgotados);
    }

    public JuegosEnStock obtenerJuegosEnStock() {
        int juegosEnStock = 0;
        for (Juegos juego : listaJuegos) {
            juegosEnStock += juego.getStock();
        }
        return new JuegosEnStock(juegosEnStock);
    }

    public JuegosNuevos obtenerJuegosNuevos() {
        // Supongamos que cada juego tiene una fecha de lanzamiento
        LocalDate fechaLimite = LocalDate.now().minusDays(30); // Por ejemplo, juegos lanzados en los últimos 30 días
        int juegosNuevos = 0;
        for (Juegos juego : listaJuegos) {
            if (juego.getFechaLanzamiento().isAfter(fechaLimite)) {
                juegosNuevos++;
            }
        }
        return new JuegosNuevos(juegosNuevos);
    }
}

