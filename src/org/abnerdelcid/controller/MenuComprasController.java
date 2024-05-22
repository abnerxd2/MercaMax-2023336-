
package org.abnerdelcid.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class MenuComprasController implements Initializable {

    @FXML
    private TextField txtNumeroC;
    @FXML
    private TextField txtFechaC;
    @FXML
    private TextField txtDescripcionC;
    @FXML
    private TextField txtTotalC;
    @FXML
    private Button btnAgrgear;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnReporte;
    @FXML
    private TableView<?> tblCopras;
    @FXML
    private TableColumn<?, ?> colNumeroC;
    @FXML
    private TableColumn<?, ?> colFechaC;
    @FXML
    private TableColumn<?, ?> colDescripcionC;
    @FXML
    private TableColumn<?, ?> collTotal;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
