package viewmodel;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.util.Duration;

public class SpalshScreenController {
    @FXML
    private ProgressBar loadingBar;

    public void initialize() {
        // Create a timeline to update progress over 5 seconds
        Timeline timeline = new Timeline();

        // Add keyframes to increment progress
        for (int i = 0; i <= 100; i++) {
            final double progress = i / 100.0; // Calculate progress percentage
            KeyFrame keyFrame = new KeyFrame(
                    Duration.millis(i * 35),
                    event -> loadingBar.setProgress(progress)
            );
            timeline.getKeyFrames().add(keyFrame);
        }

        timeline.setCycleCount(1);
        timeline.play();

        // Transition to next screen when loading is complete
        timeline.setOnFinished(event -> loadNextScreen());
    }

    private void loadNextScreen() {
        System.out.println("Loading complete! Transitioning to the main application...");
        // Add logic to switch to the next screen, such as changing scenes
    }
}