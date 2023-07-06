/*
 Nombre completo: Steven Alejandro López del Cid
 Código Técnico: IN5AM
 Carnet: 2018151
 Fecha de creación: 21/3/2022
 Fecha de modificación: 28/3/2022
 */
package org.stevenlopez.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Calculadora.fxml"));
        
        Scene escena = new Scene(root);
        
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
