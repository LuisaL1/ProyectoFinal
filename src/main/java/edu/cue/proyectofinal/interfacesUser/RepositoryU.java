package edu.cue.proyectofinal.interfacesUser;

import edu.cue.proyectofinal.domainUser.Usuario;

import java.util.List;

public interface RepositoryU {
    List<Usuario> findAllUsuarios();
    Usuario findUsuarioById(String id);
    void saveUsuario(Usuario usuario);
    void updateUsuario(Usuario usuario);
    void deleteUsuario(String id);
}
