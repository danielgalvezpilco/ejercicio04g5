package sunat.gop.pe.ejercicio04g5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
	
	private TextField txtUsuario;
	
	private PasswordField txtPassword;
	
 
    @Override
    public void start(Stage stage) {
    	
    	Label lblUsuario = new Label("Usuario");
    	lblUsuario.setAlignment(Pos.BASELINE_CENTER);
    	txtUsuario = new TextField();
    	
    	Label lblPassword = new Label("Password");    	
    	lblPassword.setAlignment(Pos.BASELINE_CENTER);
    	txtPassword = new PasswordField();
    	
    	Button btnLogin = new Button("Login");
    	btnLogin.setPrefSize(70, 25);
    	Button btnCancelar = new Button("Cancelar");
    	btnCancelar.setPrefSize(70, 25);
        
    	GridPane gridPane = new GridPane();
    	gridPane.setHgap(10);
    	gridPane.setVgap(10);
    	gridPane.add(lblUsuario, 0, 0);
    	gridPane.add(txtUsuario, 1, 0);
    	
    	gridPane.add(lblPassword, 0, 1);
    	gridPane.add(txtPassword, 1, 1);
    	
    	gridPane.add(btnLogin, 0, 2);
    	gridPane.add(btnCancelar, 1, 2);
    	gridPane.setAlignment(Pos.CENTER);
    	
    	
    	btnLogin.setOnAction(p -> ejecutarLogin());    	
    	btnCancelar.setOnAction(p -> cancelarLogin());
    	
        var scene = new Scene(gridPane, 300, 140);
        stage.setScene(scene);
        stage.show();
    }
    
    private void ejecutarLogin() {
    	Alert alerta = new Alert(AlertType.INFORMATION);
		alerta.setContentText("Ingreso al sistema");
		alerta.show();
    }
    
    private void cancelarLogin() {
    	txtUsuario.setText("");
		txtPassword.setText("");
    }
 
    public static void main(String[] args) {
        launch();
    }
 
}