import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    /**
     *  编写一个简单的图形化界面的Java应用程序
     */
    public void start(Stage stage) {
        stage.setTitle("JavaFX程序");

        Label label = new Label("这是我的第一个JavaFX程序");
        StackPane root = new StackPane();   // StackPane 默认居中对齐
        root.getChildren().add(label);
        Scene scene = new Scene(root, 415, 411);
        stage.setScene(scene);

        stage.show();
    }
}
