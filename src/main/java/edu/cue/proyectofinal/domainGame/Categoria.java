package edu.cue.proyectofinal.domainGame;

import java.util.List;

public class Categoria {
    private String name;
    private List<Juegos> games;

    // Constructor
    public Categoria(String name, List<Juegos> games) {
        this.name = name;
        this.games = games;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Juegos> getGames() {
        return games;
    }

    public void setGames(List<Juegos> games) {
        this.games = games;
    }
}
