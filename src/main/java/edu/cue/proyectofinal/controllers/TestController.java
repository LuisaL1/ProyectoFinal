package edu.cue.proyectofinal.controllers;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;

public class TestController {

    @FXML
    private Label label;

    @FXML
    private ProgressBar cargar;

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
    private Pane rootPane;

    public void initialize() {
        // Inicialmente, los elementos de video y la barra de progreso son invisibles
        mediaView.setVisible(false);
        mediaView2.setVisible(false);
        mediaView3.setVisible(false);
        mediaView4.setVisible(false);
        mediaView5.setVisible(false);
        mediaView6.setVisible(false);
        cargar.setVisible(false);

        // Configuración de la etiqueta
        label.setText("GAMEHAVEN");

        // Simulación de carga en la barra de progreso
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                for (double progress = 0.0; progress <= 1.0; progress += 0.01) {
                    final double finalProgress = progress;
                    // Actualizar el progreso en el hilo de la aplicación de JavaFX
                    Platform.runLater(() -> cargar.setProgress(finalProgress));
                    try {
                        // Simular el tiempo de espera entre actualizaciones
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Alcanzado el 100% de carga, abrir nueva ventana
                Platform.runLater(() -> openNewWindow());
                return null;
            }
        };

        // Añadir el efecto de partículas y establecer su duración
        addParticleEffect(label, 2000); // Efecto de partículas durante 2 segundos

        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start();
    }

    private void addParticleEffect(Label label, int duration) {
        // Crear un nodo de texto con las mismas propiedades que la etiqueta
        Text text = new Text(label.getText());
        text.setFont(label.getFont());
        text.setFill(label.getTextFill());
        text.setX(label.getLayoutX());
        text.setY(label.getLayoutY() + label.getFont().getSize());

        Group particleGroup = new Group();

        // Crear partículas
        for (int i = 0; i < 100; i++) {
            Circle particle = new Circle(2, Color.WHITE); // Puedes personalizar la apariencia de las partículas
            particle.setOpacity(0); // Inicialmente invisibles
            particleGroup.getChildren().add(particle);
        }

        rootPane.getChildren().add(particleGroup);

        Timeline timeline = new Timeline();

        // Animación para cada partícula
        for (var node : particleGroup.getChildren()) {
            Circle particle = (Circle) node;
            double startX = text.getX() + Math.random() * text.getLayoutBounds().getWidth();
            double startY = text.getY() - Math.random() * text.getLayoutBounds().getHeight();

            KeyValue kvXStart = new KeyValue(particle.centerXProperty(), startX);
            KeyValue kvYStart = new KeyValue(particle.centerYProperty(), startY);
            KeyValue kvXEnd = new KeyValue(particle.centerXProperty(), startX + (Math.random() - 0.5) * 200);
            KeyValue kvYEnd = new KeyValue(particle.centerYProperty(), startY + (Math.random() - 0.5) * 200);
            KeyValue kvOpacityStart = new KeyValue(particle.opacityProperty(), 1);
            KeyValue kvOpacityEnd = new KeyValue(particle.opacityProperty(), 0);

            KeyFrame kfStart = new KeyFrame(Duration.ZERO, kvXStart, kvYStart, kvOpacityStart);
            KeyFrame kfEnd = new KeyFrame(Duration.millis(duration), kvXEnd, kvYEnd, kvOpacityEnd);

            timeline.getKeyFrames().addAll(kfStart, kfEnd);
        }

        // Al terminar la animación de partículas, mostrar los videos y la barra de progreso
        timeline.setOnFinished(event -> {
            rootPane.getChildren().remove(particleGroup);

            // Mostrar videos y barra de progreso
            mediaView.setVisible(true);
            mediaView2.setVisible(true);
            mediaView3.setVisible(true);
            mediaView4.setVisible(true);
            mediaView5.setVisible(true);
            mediaView6.setVisible(true);
            cargar.setVisible(true);

            // Configurar y reproducir los videos
            playMedia();
        });

        timeline.play();
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
    private void openNewWindow() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/edu/cue/proyectofinal/hola.fxml"));
            Parent root = fxmlLoader.load();
            Stage currentStage = (Stage) rootPane.getScene().getWindow(); // Obtener la referencia al Stage actual
            currentStage.close(); // Cerrar la ventana actual

            Stage stage = new Stage();
            stage.setScene(new Scene(root));

            // Establecer pantalla completa
            stage.setFullScreen(true);

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}