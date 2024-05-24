package edu.cue.proyectofinal.app.serviceUser;

import edu.cue.proyectofinal.domainUser.Usuario;

public interface UserService {
    public void registrarUsuario(Usuario usuario);
    public boolean iniciarSesion(String nombreUsuario, String contraseña);
    public Usuario obtenerUsuarioPorNombre(String nombreUsuario);
    public void actualizarPerfilUsuario(Usuario usuario);
    public void eliminarUsuario(String nombreUsuario);
    public void cambiarContraseña(String nombreUsuario, String nuevaContraseña);
    public boolean verificarExistenciaUsuario(String nombreUsuario);
}
