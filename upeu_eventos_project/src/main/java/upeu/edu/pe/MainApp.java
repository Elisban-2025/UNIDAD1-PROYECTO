package upeu.edu.pe;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class MainApp extends Application {

    private ConfigurableApplicationContext springContext;
    private FXMLLoader fxmlLoader;

    @Override
    public void init() throws Exception {
        springContext = new SpringApplicationBuilder(SpringBootApp.class).run();
        fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/main-view.fxml"));
        fxmlLoader.setControllerFactory(springContext::getBean);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Gestión de Eventos Universitarios");
        stage.setScene(scene);
        stage.setWidth(900);
        stage.setHeight(600);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        springContext.close();
        Platform.exit();
    }

    public static void main(String[] args) {
        launch();
    }
}
