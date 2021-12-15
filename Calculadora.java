package calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase que inicia el programa
 * @author Lui Eduardo Poot Poot
 * @version 1.0
 */
public class Calculadora extends Application {
    /**
     * Método que lanza una vista
     * @param stage El medio en el que estará la vista
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Vista.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método que lanza el programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
