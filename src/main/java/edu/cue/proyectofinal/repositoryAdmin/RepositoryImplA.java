package edu.cue.proyectofinal.repositoryAdmin;

import edu.cue.proyectofinal.domainAdmin.*;
import edu.cue.proyectofinal.interfacesAdmin.RepositoryA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositoryImplA implements RepositoryA {
    private static final String RUTA_ARCHIVO = "src/main/resources/archivoAdmin.dat";

    // Simulación de una base de datos para cada métrica
    private Map<String, Ganancias> gananciasMap;
    private Map<String, InversiónTotal> inversionTotalMap;
    private Map<String, JuegosAgotados> juegosAgotadosMap;
    private Map<String, JuegosEnStock> juegosEnStockMap;
    private Map<String, JuegosNuevos> juegosNuevosMap;

    public RepositoryImplA() {
        gananciasMap = new HashMap<>();
        inversionTotalMap = new HashMap<>();
        juegosAgotadosMap = new HashMap<>();
        juegosEnStockMap = new HashMap<>();
        juegosNuevosMap = new HashMap<>();
    }

    @Override
    public List<Ganancias> findAllGanancias() {
        return new ArrayList<>(gananciasMap.values());
    }

    @Override
    public Ganancias findByIdGanancias(String id) {
        return gananciasMap.get(id);
    }

    @Override
    public void saveGanancias(Ganancias ganancias) {
        gananciasMap.put(ganancias.getId(), ganancias);
    }

    @Override
    public void updateGanancias(Ganancias ganancias) {
        gananciasMap.put(ganancias.getId(), ganancias);
    }

    @Override
    public void deleteGanancias(String id) {
        gananciasMap.remove(id);
    }

    @Override
    public List<InversiónTotal> findAllInversionTotal() {
        return new ArrayList<>(inversionTotalMap.values());
    }

    @Override
    public InversiónTotal findByIdInversionTotal(String id) {
        return inversionTotalMap.get(id);
    }

    @Override
    public void saveInversionTotal(InversiónTotal inversionTotal) {
        inversionTotalMap.put(inversionTotal.getId(), inversionTotal);
    }

    @Override
    public void updateInversionTotal(InversiónTotal inversionTotal) {
        inversionTotalMap.put(inversionTotal.getId(), inversionTotal);
    }

    @Override
    public void deleteInversionTotal(String id) {
        inversionTotalMap.remove(id);
    }

    @Override
    public List<JuegosAgotados> findAllJuegosAgotados() {
        return new ArrayList<>(juegosAgotadosMap.values());
    }

    @Override
    public JuegosAgotados findByIdJuegosAgotados(String id) {
        return juegosAgotadosMap.get(id);
    }

    @Override
    public void saveJuegosAgotados(JuegosAgotados juegosAgotados) {
        juegosAgotadosMap.put(juegosAgotados.getId(), juegosAgotados);
    }

    @Override
    public void updateJuegosAgotados(JuegosAgotados juegosAgotados) {
        juegosAgotadosMap.put(juegosAgotados.getId(), juegosAgotados);
    }

    @Override
    public void deleteJuegosAgotados(String id) {
        juegosAgotadosMap.remove(id);
    }

    @Override
    public List<JuegosEnStock> findAllJuegosEnStock() {
        return new ArrayList<>(juegosEnStockMap.values());
    }

    @Override
    public JuegosEnStock findByIdJuegosEnStock(String id) {
        return juegosEnStockMap.get(id);
    }

    @Override
    public void saveJuegosEnStock(JuegosEnStock juegosEnStock) {
        juegosEnStockMap.put(juegosEnStock.getId(), juegosEnStock);
    }

    @Override
    public void updateJuegosEnStock(JuegosEnStock juegosEnStock) {
        juegosEnStockMap.put(juegosEnStock.getId(), juegosEnStock);
    }

    @Override
    public void deleteJuegosEnStock(String id) {
        juegosEnStockMap.remove(id);
    }

    @Override
    public List<JuegosNuevos> findAllJuegosNuevos() {
        return new ArrayList<>(juegosNuevosMap.values());
    }

    @Override
    public JuegosNuevos findByIdJuegosNuevos(String id) {
        return juegosNuevosMap.get(id);
    }

    @Override
    public void saveJuegosNuevos(JuegosNuevos juegosNuevos) {
        juegosNuevosMap.put(juegosNuevos.getId(), juegosNuevos);
    }

    @Override
    public void updateJuegosNuevos(JuegosNuevos juegosNuevos) {
        juegosNuevosMap.put(juegosNuevos.getId(), juegosNuevos);
    }

    @Override
    public void deleteJuegosNuevos(String id) {
        juegosNuevosMap.remove(id);
    }
}
