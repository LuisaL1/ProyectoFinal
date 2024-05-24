package edu.cue.proyectofinal.interfacesAdmin;

import edu.cue.proyectofinal.domainAdmin.*;

import java.util.List;

public interface RepositoryA {
    List<Ganancias> findAllGanancias();
    Ganancias findByIdGanancias(String id);
    void saveGanancias(Ganancias ganancias);
    void updateGanancias(Ganancias ganancias);
    void deleteGanancias(String id);

    List<InversiónTotal> findAllInversionTotal();
    InversiónTotal findByIdInversionTotal(String id);
    void saveInversionTotal(InversiónTotal inversionTotal);
    void updateInversionTotal(InversiónTotal inversionTotal);
    void deleteInversionTotal(String id);

    List<JuegosAgotados> findAllJuegosAgotados();
    JuegosAgotados findByIdJuegosAgotados(String id);
    void saveJuegosAgotados(JuegosAgotados juegosAgotados);
    void updateJuegosAgotados(JuegosAgotados juegosAgotados);
    void deleteJuegosAgotados(String id);

    List<JuegosEnStock> findAllJuegosEnStock();
    JuegosEnStock findByIdJuegosEnStock(String id);
    void saveJuegosEnStock(JuegosEnStock juegosEnStock);
    void updateJuegosEnStock(JuegosEnStock juegosEnStock);
    void deleteJuegosEnStock(String id);

    List<JuegosNuevos> findAllJuegosNuevos();
    JuegosNuevos findByIdJuegosNuevos(String id);
    void saveJuegosNuevos(JuegosNuevos juegosNuevos);
    void updateJuegosNuevos(JuegosNuevos juegosNuevos);
    void deleteJuegosNuevos(String id);
}
