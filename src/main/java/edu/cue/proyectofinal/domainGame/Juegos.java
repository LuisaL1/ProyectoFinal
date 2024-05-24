package edu.cue.proyectofinal.domainGame;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Juegos {
    private String id;
    private String titulo;
    private String descripcion;
    private double precio;
    private int stock;
    private LocalDate fechaLanzamiento;
    private double costoProduccion; // Nuevo campo: costo de producción
    private String clasificacion; // Nuevo campo: clasificación del juego
    private List<Review> reseñas;

    public Juegos(String id, String titulo, String descripcion, double precio, int stock, LocalDate fechaLanzamiento) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.fechaLanzamiento = fechaLanzamiento;
        this.costoProduccion = 0.0; // Inicialmente establecemos el costo de producción como 0
        this.clasificacion = ""; // Inicialmente no hay clasificación asignada
        this.reseñas = new ArrayList<>();
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(double costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public List<Review> getReseñas() {
        return reseñas;
    }

    public void setReseñas(List<Review> reseñas) {
        this.reseñas = reseñas;
    }

    // Métodos adicionales
    public void agregarReseña(Review reseña) {
        reseñas.add(reseña);
    }

    public double calcularPromedioCalificaciones() {
        if (reseñas.isEmpty()) {
            return 0.0;
        }
        double sumaCalificaciones = 0.0;
        for (Review reseña : reseñas) {
            sumaCalificaciones += reseña.getCalificacion();
        }
        return sumaCalificaciones / reseñas.size();
    }
}



