package edu.cue.proyectofinal.domainAdmin;

public class JuegosAgotados {
    private String id;
    private int cantidad;

    public JuegosAgotados(int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

