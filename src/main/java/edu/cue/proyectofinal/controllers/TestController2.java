package edu.cue.proyectofinal.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.control.Button;
import java.io.File;

public class TestController2 {

    @FXML
    private Label label;

    @FXML
    private MediaView mediaView;

    @FXML
    private MediaView mediaView2;

    @FXML
    private MediaView mediaView3;

    @FXML
    private MediaView mediaView4;

    @FXML
    private MediaView mediaView5;

    @FXML
    private MediaView mediaView6;

    @FXML
    private Button iniciarSesionButton;

    @FXML
    private Button registrarseButton;

    // Agregamos el nuevo botón
    @FXML
    private Button nuevoBoton;

    @FXML
    private void initialize() {
        // Inicialmente, los elementos de video y la barra de progreso son invisibles
        mediaView.setVisible(false);
        mediaView2.setVisible(false);
        mediaView3.setVisible(false);
        mediaView4.setVisible(false);
        mediaView5.setVisible(false);
        mediaView6.setVisible(false);

        // Configuración de la etiqueta
        label.setText("GAMEHAVEN");

        // Mostrar videos y barra de progreso
        mediaView.setVisible(true);
        mediaView2.setVisible(true);
        mediaView3.setVisible(true);
        mediaView4.setVisible(true);
        mediaView5.setVisible(true);
        mediaView6.setVisible(true);
        playMedia();

        // Configurar acciones de los botones
        iniciarSesionButton.setOnAction(event -> iniciarSesion());
        registrarseButton.setOnAction(event -> registrarse());
        // Configuramos la acción del nuevo botón
        nuevoBoton.setOnAction(event -> nuevoBotonAccion());
    }

    private void playMedia() {
        String path2 = new File("C:/Users/Luisa/Downloads/Y2meta.app-God of War Ragnarök - _Father and Son_ Cinematic Trailer _ PS5 & PS4 Games-(1080p) (online-video-cutter.com).mp4").getAbsolutePath();
        String path = new File("C:/Users/Luisa/Downloads/Y2meta.app-Shadow Of The Tomb Raider - Official Trailer-(1080p) (online-video-cutter.com).mp4").getAbsolutePath();
        String path3 = new File("C:/Users/Luisa/Downloads/Video3 (2).mp4").getAbsolutePath();
        String path4 = new File("C:/Users/Luisa/Downloads/Y2meta.app - Test Drive Unlimited Solar Crown - Release Date Trailer _ PS5 Games-(1080p60) (online-video-cutter.com).mp4").getAbsolutePath();
        String path5 = new File("C:/Users/Luisa/Downloads/Y2meta.app-Assassin's Creed Shadows - Cinematic World Premiere Trailer _ PS5 Games-(1080p) (online-video-cutter.com).mp4").getAbsolutePath();
        String path6 = new File("C:/Users/Luisa/Downloads/Y2meta.app-Destiny 2_ The Final Shape - Launch Trailer _ PS5, PS4 & PC Games-(1080p) (online-video-cutter.com).mp4").getAbsolutePath();

        Media media = new Media(new File(path).toURI().toString());
        Media media2 = new Media(new File(path2).toURI().toString());
        Media media3 = new Media(new File(path3).toURI().toString());
        Media media4 = new Media(new File(path4).toURI().toString());
        Media media5 = new Media(new File(path5).toURI().toString());
        Media media6 = new Media(new File(path6).toURI().toString());

        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
        MediaPlayer mediaPlayer3 = new MediaPlayer(media3);
        MediaPlayer mediaPlayer4 = new MediaPlayer(media4);
        MediaPlayer mediaPlayer5 = new MediaPlayer(media5);
        MediaPlayer mediaPlayer6 = new MediaPlayer(media6);

        mediaView.setMediaPlayer(mediaPlayer);
        mediaView2.setMediaPlayer(mediaPlayer2);
        mediaView3.setMediaPlayer(mediaPlayer3);
        mediaView4.setMediaPlayer(mediaPlayer4);
        mediaView5.setMediaPlayer(mediaPlayer5);
        mediaView6.setMediaPlayer(mediaPlayer6);

        // Muteamos los videos
        mediaPlayer.setMute(true);
        mediaPlayer2.setMute(true);
        mediaPlayer3.setMute(true);
        mediaPlayer4.setMute(true);
        mediaPlayer5.setMute(true);
        mediaPlayer6.setMute(true);

        mediaPlayer.play();
        mediaPlayer2.play();
        mediaPlayer3.play();
        mediaPlayer4.play();
        mediaPlayer5.play();
        mediaPlayer6.play();
    }

    @FXML
    private void iniciarSesion() {
        System.out.println("Iniciando sesión...");
    }

    @FXML
    private void registrarse() {
        System.out.println("Registrándose...");
    }

    // Método de acción para el nuevo botón
    @FXML
    private void nuevoBotonAccion() {
        System.out.println("¡Nuevo botón clickeado!");
    }
}

