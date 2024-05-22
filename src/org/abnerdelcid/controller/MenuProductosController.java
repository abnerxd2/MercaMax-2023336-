/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.abnerdelcid.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.abnerdelcid.System.Principal;

/**
 * FXML Controller class
 *
 * @author abner
 */
public class MenuProductosController implements Initializable {

    @FXML
    private TextField txtCodigoP;
    @FXML
    private TextField txtDescripcionP;
    @FXML
    private TextField txtPrecioDocenaP;
    @FXML
    private TextField txtPrecioUnitarioP;
    @FXML
    private TextField txtExistencia;
    @FXML
    private TextField txtPrecioMayorP;
    @FXML
    private TableView<?> tblProductos;
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnReporte;

 
           @FXML Button btnRegresar;
    private Principal escenarioPrincipal; 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
 

 
    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    @FXML
    public void clicRegresar (ActionEvent event){
         if (event.getSource() == btnRegresar){
        escenarioPrincipal.menuPrincipalView();
    }
    }
    
}
