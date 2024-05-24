package edu.cue.proyectofinal.app.serviceGame;

import edu.cue.proyectofinal.domainGame.Juegos;
import edu.cue.proyectofinal.domainGame.Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GameImpl implements GameService {

    private Map<String, Juegos> juegosMap; // Mapa para almacenar los juegos por título
    private Map<String, List<Review>> reseñasPorJuego; // Mapa para almacenar las reseñas por título de juego

    public GameImpl() {
        juegosMap = new HashMap<>();
        reseñasPorJuego = new HashMap<>();
    }

    @Override
    public Juegos obtenerJuegoPorTitulo(String titulo) {
        return juegosMap.get(titulo);
    }

    @Override
    public void agregarReseñaAJuego(Review reseña, String tituloJuego) {
        if (juegosMap.containsKey(tituloJuego)) {
            List<Review> reseñas = reseñasPorJuego.getOrDefault(tituloJuego, new ArrayList<>());
            reseñas.add(reseña);
            reseñasPorJuego.put(tituloJuego, reseñas);
        }
    }

    @Override
    public double obtenerPromedioCalificacionesJuego(String tituloJuego) {
        if (reseñasPorJuego.containsKey(tituloJuego)) {
            List<Review> reseñas = reseñasPorJuego.get(tituloJuego);
            if (!reseñas.isEmpty()) {
                double sumaCalificaciones = reseñas.stream().mapToInt(Review::getCalificacion).sum();
                return sumaCalificaciones / reseñas.size();
            }
        }
        return 0.0;
    }

    @Override
    public List<Juegos> obtenerJuegosNuevos(int dias) {
        return juegosMap.values().stream()
                .filter(juego -> juego.getFechaLanzamiento().isAfter(juego.getFechaLanzamiento().minusDays(dias)))
                .collect(Collectors.toList());
    }

    @Override
    public List<Juegos> buscarJuegosPorClasificacion(String clasificacion) {
        return juegosMap.values().stream()
                .filter(juego -> juego.getClasificacion().equals(clasificacion))
                .collect(Collectors.toList());
    }

    @Override
    public void eliminarReseñaDeJuego(String tituloJuego, int idReseña) {
        if (reseñasPorJuego.containsKey(tituloJuego)) {
            List<Review> reseñas = reseñasPorJuego.get(tituloJuego);
            reseñas.removeIf(reseña -> reseña.getId().equals(idReseña)); // Corrección aquí
            reseñasPorJuego.put(tituloJuego, reseñas);
        }
    }
}

