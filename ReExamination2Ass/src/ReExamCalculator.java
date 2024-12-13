import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ReExamCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Re-exam calc 1.0");
        primaryStage.setScene(new Scene(new javafx.scene.layout.StackPane(), 400, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
