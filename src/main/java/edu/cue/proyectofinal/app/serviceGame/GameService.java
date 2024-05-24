package edu.cue.proyectofinal.app.serviceGame;

import edu.cue.proyectofinal.domainGame.Juegos;
import edu.cue.proyectofinal.domainGame.Review;

import java.util.List;

public interface GameService {
    public Juegos obtenerJuegoPorTitulo(String titulo);
    public void agregarReseñaAJuego(Review reseña, String tituloJuego);
    public double obtenerPromedioCalificacionesJuego(String tituloJuego);
    public List<Juegos> obtenerJuegosNuevos(int dias);
    public List<Juegos> buscarJuegosPorClasificacion(String clasificacion);
    public void eliminarReseñaDeJuego(String tituloJuego, int idReseña);
}
