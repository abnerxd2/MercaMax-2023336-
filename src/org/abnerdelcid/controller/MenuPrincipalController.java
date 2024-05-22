package org.abnerdelcid.controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import org.abnerdelcid.System.Principal;


public class MenuPrincipalController implements Initializable{
    private Principal escenarioPrincipal;
    @FXML MenuItem btnMenuclientes;
    @FXML MenuItem btnVistaProgramador;
    @FXML MenuItem btnVistaProveedores;
     @FXML MenuItem btnMenuProductos;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    public void click(ActionEvent event){
            if (event.getSource() == btnMenuclientes){ 
                escenarioPrincipal.menuClientesView();
            }else if(event.getSource() == btnVistaProgramador){
                escenarioPrincipal.vistaProgramador();
            }else if(event.getSource() == btnVistaProveedores){
                escenarioPrincipal.MenuProveedores();
            }else if (event.getSource() == btnMenuProductos){
                escenarioPrincipal.MenuProdutos();
            }
    }
}