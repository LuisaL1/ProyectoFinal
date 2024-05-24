package edu.cue.proyectofinal.repositoryGame;

import edu.cue.proyectofinal.domainGame.Juegos;
import edu.cue.proyectofinal.domainGame.Review;
import edu.cue.proyectofinal.interfacesGame.RepositoryG;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositoryImplG implements RepositoryG {
    private static final String RUTA_ARCHIVO = "src/main/resources/archivoGame.dat";

    // Simulación de una base de datos para juegos y reseñas
    private Map<String, Juegos> juegosMap;
    private Map<String, Review> reviewMap;

    public RepositoryImplG() {
        juegosMap = new HashMap<>();
        reviewMap = new HashMap<>();
    }

    @Override
    public List<Juegos> findAllJuegos() {
        return new ArrayList<>(juegosMap.values());
    }

    @Override
    public Juegos findJuegosById(String id) {
        return juegosMap.get(id);
    }

    @Override
    public void saveJuegos(Juegos juegos) {
        juegosMap.put(juegos.getId(), juegos);
    }

    @Override
    public void updateJuegos(Juegos juegos) {
        juegosMap.put(juegos.getId(), juegos);
    }

    @Override
    public void deleteJuegos(String id) {
        juegosMap.remove(id);
    }

    @Override
    public List<Review> findAllReviews() {
        return new ArrayList<>(reviewMap.values());
    }

    @Override
    public Review findReviewById(String id) {
        return reviewMap.get(id);
    }

    @Override
    public void saveReview(Review review) {
        reviewMap.put(review.getId(), review);
    }

    @Override
    public void updateReview(Review review) {
        reviewMap.put(review.getId(), review);
    }

    @Override
    public void deleteReview(String id) {
        reviewMap.remove(id);
    }
}

