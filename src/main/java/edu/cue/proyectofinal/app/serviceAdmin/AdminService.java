package edu.cue.proyectofinal.app.serviceAdmin;

import edu.cue.proyectofinal.domainAdmin.*;

public interface AdminService {
    Ganancias obtenerGanancias();
    InversiónTotal obtenerInversion();
    JuegosAgotados obtenerJuegosAgotados();
    JuegosEnStock obtenerJuegosEnStock();
    JuegosNuevos obtenerJuegosNuevos();
}
