package edu.cue.proyectofinal.app.serviceUser;

import edu.cue.proyectofinal.domainUser.Usuario;

import java.util.HashMap;
import java.util.Map;

public class UserImpl implements UserService {

    // Simulación de una base de datos de usuarios
    private Map<String, Usuario> usuarios;

    public UserImpl() {
        usuarios = new HashMap<>();
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        if (!usuarios.containsKey(usuario.getNombreUsuario())) {
            usuarios.put(usuario.getNombreUsuario(), usuario);
        }
    }

    @Override
    public boolean iniciarSesion(String nombreUsuario, String contraseña) {
        if (usuarios.containsKey(nombreUsuario)) {
            Usuario usuario = usuarios.get(nombreUsuario);
            return usuario.getContraseña().equals(contraseña);
        }
        return false;
    }

    @Override
    public Usuario obtenerUsuarioPorNombre(String nombreUsuario) {
        return usuarios.get(nombreUsuario);
    }

    @Override
    public void actualizarPerfilUsuario(Usuario usuario) {
        if (usuarios.containsKey(usuario.getNombreUsuario())) {
            usuarios.put(usuario.getNombreUsuario(), usuario);
        }
    }

    @Override
    public void eliminarUsuario(String nombreUsuario) {
        usuarios.remove(nombreUsuario);
    }

    @Override
    public void cambiarContraseña(String nombreUsuario, String nuevaContraseña) {
        if (usuarios.containsKey(nombreUsuario)) {
            Usuario usuario = usuarios.get(nombreUsuario);
            usuario.setContraseña(nuevaContraseña);
            usuarios.put(nombreUsuario, usuario);
        }
    }

    @Override
    public boolean verificarExistenciaUsuario(String nombreUsuario) {
        return usuarios.containsKey(nombreUsuario);
    }
}

