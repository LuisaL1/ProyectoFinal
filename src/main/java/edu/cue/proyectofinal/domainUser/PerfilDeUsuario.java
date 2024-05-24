package edu.cue.proyectofinal.domainUser;

import edu.cue.proyectofinal.domainGame.Juegos;

import java.util.List;

public class PerfilDeUsuario {
    private String name;
    private List<Juegos> ownedGames;

    // Constructor
    public void PerfilUsuario(String name) {
        this.name = name;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Juegos> getOwnedGames() {
        return ownedGames;
    }

    public void setOwnedGames(List<Juegos> ownedGames) {
        this.ownedGames = ownedGames;
    }
}
