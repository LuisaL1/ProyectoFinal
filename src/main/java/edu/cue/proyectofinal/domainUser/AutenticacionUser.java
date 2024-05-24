package edu.cue.proyectofinal.domainUser;

import java.util.HashMap;
import java.util.Map;

public class AutenticacionUser {
    private Map<String, String> userDatabase = new HashMap<>();

    public boolean login(String username, String password) {
        // Lógica de autenticación
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }

    public void logout(Usuario usuario) {
        // Lógica de cierre de sesión
    }

    public void register(String username, String password) {
        // Lógica de registro
        userDatabase.put(username, password);
    }
}
