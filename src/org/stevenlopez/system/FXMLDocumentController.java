
package org.stevenlopez.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    double dato1, dato2, ciclo, result=0;
    int op;
    String pantalla;

    @FXML
    private Button btnUno;   
    @FXML
    private Button btnDos;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnCuatro;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnSeis;
    @FXML
    private Button btnSiete;
    @FXML
    private Button btnOcho;
    @FXML
    private Button btnNueve;
    @FXML
    private Button btnCero;
    @FXML
    private Button btnMasMenos;
    @FXML
    private Button btnPunto;
    @FXML
    private Button btnIgual;
    @FXML
    private Button btnMas;
    @FXML
    private Button btnMenos;
    @FXML
    private Button btnMulti;
    @FXML
    private Button btnUnoX;
    @FXML
    private Button btnCuadrado;
    @FXML
    private Button btnRaiz;
    @FXML
    private Button btnDivi;
    @FXML
    private Button btnPorcentaje;
    @FXML
    private Button btnCE;
    @FXML
    private Button btnC;
    @FXML
    private Button btnBorrar;
    @FXML
    private TextField txtPantalla;
        
    
  
    @FXML
    private void handleButtonAction(ActionEvent event) {        
        if(event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        else if(event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText()+"2");
        else if(event.getSource() == btnTres)
            txtPantalla.setText(txtPantalla.getText()+"3");
        else if(event.getSource() == btnCuatro)
            txtPantalla.setText(txtPantalla.getText()+"4");
        else if(event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText()+"5");
        else if(event.getSource() == btnSeis)
            txtPantalla.setText(txtPantalla.getText()+"6");
        else if(event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText()+"7");
        else if(event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText()+"8");
        else if(event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText()+"9");
        else if(event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText()+"0");
        
        
        else if(event.getSource() == btnMas){
            do{
                ciclo = Double.parseDouble(txtPantalla.getText());
                txtPantalla.clear();
                dato1 = dato1 + ciclo;
                btnPunto.setDisable(false);
                op = 1;                
            }while (event.getSource() != btnMas);
           
        }
        else if(event.getSource() == btnMenos){
            do{
                ciclo = Double.parseDouble(txtPantalla.getText());
                    if(dato1 != 0){
                        dato1 = dato1 - ciclo;
                    }else dato1 = ciclo;
                txtPantalla.clear();            
                btnPunto.setDisable(false);
                op = 2;
            }while(event.getSource() != btnMenos);                        
        }
        else if(event.getSource() == btnMulti){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 3;
            btnPunto.setDisable(false);
        }
        else if(event.getSource() == btnDivi){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 4;
            btnPunto.setDisable(false);
        }
        else if(event.getSource() == btnRaiz){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = Math.sqrt(dato1);
            txtPantalla.setText(String.valueOf(result));            
        }
        else if(event.getSource() == btnCuadrado){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = Math.pow(dato1,2);
            txtPantalla.setText(String.valueOf(result));               
        }
        else if(event.getSource() == btnUnoX){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            result = 1/dato1;
            txtPantalla.setText(String.valueOf(result));               
        }
        else if(event.getSource() == btnPorcentaje){
            dato2 = Double.parseDouble(txtPantalla.getText());
            dato2 = dato1*dato2/100 ;
            txtPantalla.clear();
            txtPantalla.setText(String.valueOf(dato2));               
        }
        else if(event.getSource() == btnC){            
            txtPantalla.clear();                   
        }
        else if(event.getSource() == btnCE){            
            txtPantalla.setText(" ");
        }
        else if(event.getSource() == btnMasMenos){
            dato1 =  -1 * Double.parseDouble(txtPantalla.getText());

              txtPantalla.setText(String.valueOf((int)dato1));             
        }
        else if (event.getSource() == btnPunto){
            if(txtPantalla.getText().length() == 0){
                txtPantalla.setText("0.");
                btnPunto.setDisable(true);
        }
            else{
                txtPantalla.setText(txtPantalla.getText()+".");
                 btnPunto.setDisable(true);
            }                            
        }
        else if(event.getSource() == btnBorrar){
            pantalla=txtPantalla.getText();
            if(pantalla.length()>0){
                pantalla=pantalla.substring(0, pantalla.length()-1);                
                txtPantalla.setText(pantalla);
            }
        }        
        
        else if (event.getSource() == btnIgual){
            dato2 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            btnPunto.setDisable(false);            
            switch(op){
                case 1:
                    result = dato1 + dato2;                                                 
                    txtPantalla.setText(String.valueOf(result));
                    System.out.println(dato1);
                    dato1 = 0;
                    break;
                case 2:
                    result = dato1 - dato2;                    
                    txtPantalla.setText(String.valueOf(result));
                    System.out.println(dato1);
                    dato1 = 0;
                    break;
                case 3:
                    result = dato1 * dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;
                case 4:
                    result = dato1 / dato2;
                    txtPantalla.setText(String.valueOf(result));
                    break;                                                    
            }                                          
        }                
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
