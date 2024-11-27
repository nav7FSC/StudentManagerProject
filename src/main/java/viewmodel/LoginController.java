package viewmodel;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginController {

    @FXML
    private GridPane rootpane;

    @FXML
    private Button loginBtn;

    @FXML
    private Button signUpButton;

    public void initialize() {
        // Set the background image for the rootpane
        rootpane.setBackground(new Background(
                createImage("https://edencoding.com/wp-content/uploads/2021/03/layer_06_1920x1080.png"),
                null,
                null,
                null,
                null,
                null
        ));

        // Add the login.css stylesheet to the rootpane
        rootpane.getStylesheets().add(getClass().getResource("/css/login.css").toExternalForm());

        // Fade-in transition for the rootpane
        rootpane.setOpacity(0);
        FadeTransition fadeOut2 = new FadeTransition(Duration.seconds(10), rootpane);
        fadeOut2.setFromValue(0);
        fadeOut2.setToValue(1);
        fadeOut2.play();

        // Scale transition on hover for the Login button
        addHoverEffect(loginBtn);

        // Scale transition on hover for the Sign Up button
        addHoverEffect(signUpButton);
    }

    private static BackgroundImage createImage(String url) {
        return new BackgroundImage(
                new Image(url),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,
                new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true),
                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true));
    }

    private void addHoverEffect(Button button) {
        ScaleTransition scaleIn = new ScaleTransition(Duration.millis(200), button);
        scaleIn.setToX(1.1);
        scaleIn.setToY(1.1);

        ScaleTransition scaleOut = new ScaleTransition(Duration.millis(200), button);
        scaleOut.setToX(1.0);
        scaleOut.setToY(1.0);

        button.setOnMouseEntered(e -> scaleIn.play());
        button.setOnMouseExited(e -> scaleOut.play());
    }

    @FXML
    public void login(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/db_interface_gui.fxml"));
            Scene scene = new Scene(root, 900, 600);
            scene.getStylesheets().add(getClass().getResource("/css/lightTheme.css").toExternalForm());
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void signUp(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/signUp.fxml"));
            Scene scene = new Scene(root, 900, 600);
            scene.getStylesheets().add(getClass().getResource("/css/lightTheme.css").toExternalForm());
            Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
