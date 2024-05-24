package edu.cue.proyectofinal.interfacesGame;

import edu.cue.proyectofinal.domainGame.Juegos;
import edu.cue.proyectofinal.domainGame.Review;

import java.util.List;

public interface RepositoryG {
    List<Juegos> findAllJuegos();
    Juegos findJuegosById(String id);
    void saveJuegos(Juegos juegos);
    void updateJuegos(Juegos juegos);
    void deleteJuegos(String id);

    List<Review> findAllReviews();
    Review findReviewById(String id);
    void saveReview(Review review);
    void updateReview(Review review);
    void deleteReview(String id);
}
