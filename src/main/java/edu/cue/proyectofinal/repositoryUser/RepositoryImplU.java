package edu.cue.proyectofinal.repositoryUser;

import edu.cue.proyectofinal.domainUser.Usuario;
import edu.cue.proyectofinal.interfacesUser.RepositoryU;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositoryImplU implements RepositoryU {
    private static final String RUTA_ARCHIVO = "src/main/resources/archivoUser.dat";
    private Map<String, Usuario> usuariosMap;

    public RepositoryImplU() {
        this.usuariosMap = new HashMap<>();
    }

    @Override
    public List<Usuario> findAllUsuarios() {
        return new ArrayList<>(usuariosMap.values());
    }

    @Override
    public Usuario findUsuarioById(String id) {
        return usuariosMap.get(id);
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuariosMap.put(usuario.getId(), usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        usuariosMap.put(usuario.getId(), usuario);
    }

    @Override
    public void deleteUsuario(String id) {
        usuariosMap.remove(id);
    }
}

