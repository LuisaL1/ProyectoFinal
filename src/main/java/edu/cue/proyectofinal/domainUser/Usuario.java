package edu.cue.proyectofinal.domainUser;

public class Usuario {
    private String email;
    private String id;
    private String nombreUsuario;
    private String contraseña;
    private String correoElectronico;
    private String nombreCompleto;
    private String edad;
    private String direccion;
    private String telefono;
    private boolean administrador; // Nuevo campo: indica si el usuario es administrador o no

    public Usuario(String id, String nombreUsuario, String contraseña, String correoElectronico, String nombreCompleto, String edad, String direccion, String telefono, boolean administrador) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.correoElectronico = correoElectronico;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.administrador = administrador;
    }

    public Usuario(String nombreUsuario, String contraseña, String email) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.email = email;

    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}


