package edu.cue.proyectofinal.domainUser;

import edu.cue.proyectofinal.domainGame.Juegos;

public class Compra {
    private Usuario user;
    private Juegos game;
    private Transaccion transaction;

    // Constructor
    public Compra(Usuario user, Juegos game, Transaccion transaction) {
        this.user = user;
        this.game = game;
        this.transaction = transaction;
    }

    // Getters y Setters
    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Juegos getGame() {
        return game;
    }

    public void setGame(Juegos game) {
        this.game = game;
    }

    public Transaccion getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaccion transaction) {
        this.transaction = transaction;
    }
}
