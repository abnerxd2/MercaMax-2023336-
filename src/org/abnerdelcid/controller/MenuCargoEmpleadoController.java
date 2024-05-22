
package org.abnerdelcid.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MenuCargoEmpleadoController implements Initializable {

    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnReporte;
    @FXML
    private TextField txtCodigoCP;
    @FXML
    private TextField txtNombreCP;
    @FXML
    private TextField txtDescrimpcionCP;
    @FXML
    private TableView<?> tblCargoEmpleado;
    @FXML
    private TableColumn<?, ?> colCodigoCP;
    @FXML
    private TableColumn<?, ?> colNombreCP;
    @FXML
    private TableColumn<?, ?> colDescripcionCp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
