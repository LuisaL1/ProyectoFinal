package edu.cue.proyectofinal.domainGame;

import edu.cue.proyectofinal.domainUser.Usuario;

public class Review {
    private static int contadorId = 0;
    private String id;
    private Usuario usuario;
    private Juegos juego;
    private String textoReseña;
    private int calificacion; // Suponemos que la calificación es un valor entre 1 y 5

    // Constructor
    public Review(Usuario usuario, Juegos juego, String textoReseña, int calificacion) {
        this.id = String.valueOf(++contadorId);
        this.usuario = usuario;
        this.juego = juego;
        this.textoReseña = textoReseña;
        this.calificacion = calificacion;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Juegos getJuego() {
        return juego;
    }

    public void setJuego(Juegos juego) {
        this.juego = juego;
    }

    public String getTextoReseña() {
        return textoReseña;
    }

    public void setTextoReseña(String textoReseña) {
        this.textoReseña = textoReseña;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    // Método para verificar si la reseña está vacía
    public boolean isEmpty() {
        return textoReseña == null || textoReseña.isEmpty();
    }

    // Método para obtener la longitud de la reseña
    public int size() {
        return textoReseña.length();
    }
}