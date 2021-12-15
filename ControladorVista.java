package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * Clase que controla la vista de la calculadora
 * @author Luis Eduardo Poot Poot
 * @version 1.0
 */
public class ControladorVista implements Initializable {
    /**
     * @serialField El numero que ingrese el usuario
     * */
    @FXML
    private TextField txtResultado;
    /**
     * @serialField El numero que se genera con la operación
     * */
    @FXML
    private TextField txtNumero;
    
    /**
     *  Método que muestra el resultado de elevar al cuadrado
     * @param event La acción del usuario 
     * */
    @FXML
    private void Cuadrado(ActionEvent event) {
        try{
            if(!txtNumero.getText().isEmpty()){
                txtResultado.setText("");
                txtResultado.setText(Potencia(Double.parseDouble(txtNumero.getText()),2)+"");
            }else{
                txtResultado.setText("");
            }
        }catch(NumberFormatException e){
            System.out.print(e);
        }
    }
    
    /**
     * Método que muestra el resultado de elevar al cubo
     * @param event La acción del usuario 
     * */
    @FXML
    private void Cubo(ActionEvent event) {
        try{
            if(!txtNumero.getText().isEmpty()){
                txtResultado.setText("");
                txtResultado.setText(Potencia(Double.parseDouble(txtNumero.getText()),3)+"");
            }else{
                txtResultado.setText("");
            }
        }catch(NumberFormatException e){
            System.out.print(e);
        }
    }
    
    /**
     * Método que calcula el valor de elevar un número a una potencia
     * @param numero Número que se desea elevar a una potencia
     * @param potencia La potencia que se usará
     * @return El resultado de elevar un número a cierta potencia
     */
    private double Potencia(double numero, int potencia){
        double resultado=Math.pow(numero,potencia);
        return resultado;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
