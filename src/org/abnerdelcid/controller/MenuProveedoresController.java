
package org.abnerdelcid.controller;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javax.swing.JOptionPane;
import org.abnerdelcid.System.Principal;
import org.abnerdelcid.bean.Proveedores;
import org.abnerdelcid.db.Conection;


public class MenuProveedoresController implements Initializable {
 private ObservableList<Proveedores> listaProveedores;
    private Principal escenarioPrincipal;
     private enum operador {
        AGREGRAR, ELIMINAR, EDITAR, ACTUALIZAR, CANCELAR, NINGUNO
    }
    private operador tipoDeOperador = operador.NINGUNO;
    @FXML
    private TableView tvPoveedores;
    @FXML
    private TableColumn colCodP;
    @FXML
    private TableColumn colNITP;
    @FXML
    private TableColumn colNomP;
    @FXML
    private TableColumn colApeP;
    @FXML
    private TableColumn colDireP;
    @FXML
    private TableColumn colRazonS;
    @FXML
    private TableColumn colContactoP;
    @FXML
    private TableColumn colSitioWeb;
    @FXML
    private TableColumn colTelP;
    @FXML
    private TableColumn colEmailP;
    @FXML
    private Button btnAgregarP;
    @FXML
    private Button btnEditarP;
    @FXML
    private Button btnEliminarP;
    @FXML
    private Button btnReportesP;
    @FXML
    private TextField txtCodigoP;
    @FXML
    private TextField txtNITP;
    @FXML
    private TextField txtNombresP;
    @FXML
    private TextField txtApellidosP;
    @FXML
    private TextField txtDireccionP;
    @FXML
    private TextField txtRazonSocial;
    @FXML
    private TextField txtContactoP;
    @FXML
    private TextField txtSitioWeb;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtEmailP;
    @FXML
    private Button btnRegresarP;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         cargarDatos();
       desactivarControles();
    }    

    
    public void cargarDatos() {
        tvPoveedores.setItems(getProveedores());
        colCodP.setCellValueFactory(new PropertyValueFactory<Proveedores, Integer>("codigoProveedor"));
        colNITP.setCellValueFactory(new PropertyValueFactory<Proveedores, String>("NITProveedor"));

        colDireP.setCellValueFactory(new PropertyValueFactory<Proveedores, String>("direccionProveedor"));
        colRazonS.setCellValueFactory(new PropertyValueFactory<Proveedores, String>("razonSocial"));
        colContactoP.setCellValueFactory(new PropertyValueFactory<Proveedores, String>("contactoPrincipal"));
        colSitioWeb.setCellValueFactory(new PropertyValueFactory<Proveedores, String>("paginaWeb"));

    }

    public void seleccionarElemento() {
        txtCodigoP.setText(String.valueOf(((Proveedores) tvPoveedores.getSelectionModel().getSelectedItem()).getCodigoProveedor()));
        txtNITP.setText((((Proveedores)tvPoveedores.getSelectionModel().getSelectedItem()).getNITProveedor()));
        txtNombresP.setText((((Proveedores) tvPoveedores.getSelectionModel().getSelectedItem()).getNombreProveedor()));
        txtApellidosP.setText((((Proveedores) tvPoveedores.getSelectionModel().getSelectedItem()).getApellidoProveedor()));
        txtDireccionP.setText((((Proveedores) tvPoveedores.getSelectionModel().getSelectedItem()).getDireccionProveedor()));
        txtRazonSocial.setText((((Proveedores) tvPoveedores.getSelectionModel().getSelectedItem()).getRvazonSocial()));
        txtContactoP.setText((((Proveedores) tvPoveedores.getSelectionModel().getSelectedItem()).getContactoPrincipal()));
        txtSitioWeb.setText((((Proveedores) tvPoveedores.getSelectionModel().getSelectedItem()).getPaginaWebProveedor()));
        txtTelefono.setText((((Proveedores) tvPoveedores.getSelectionModel().getSelectedItem()).getContactoPrincipal()));
    }

    public ObservableList<Proveedores> getProveedores() {
        ArrayList<Proveedores> listaPro = new ArrayList<>();
        try {
            PreparedStatement procedimiento = Conection.getInstance().getConexion().prepareCall("{call sp_mostrarproveedor()}");
            ResultSet resultado = procedimiento.executeQuery();
            while (resultado.next()) {
                listaPro.add(new Proveedores(resultado.getInt("codigoProveedor"),
                        resultado.getString("NITProveedor"),
                        resultado.getString("nombresProveedor"),
                        resultado.getString("apellidosProveedor"),
                        resultado.getString("direccionProveedor"),
                        resultado.getString("razonSocial"),
                        resultado.getString("contactoPrincipal"),
                        resultado.getString("paginaWeb"),
                        resultado.getString("telefonoProveedor")
          
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaProveedores = FXCollections.observableList(listaPro);
    }

    public void Agregar() {
        switch (tipoDeOperador) {
            case NINGUNO:
                activarControles();
                btnAgregarP.setText("Guardar");
                btnEliminarP.setText("Cancelar");
                btnEditarP.setDisable(true);
                btnReportesP.setDisable(true);
         
                tipoDeOperador = operador.ACTUALIZAR;
                break;
            case ACTUALIZAR:
                guardar();
                limpiarControles();

                desactivarControles();
                btnAgregarP.setText("Agregar");
                btnEliminarP.setText("Eliminar");
                btnEditarP.setDisable(false);
                btnReportesP.setDisable(false);

                tipoDeOperador = operador.NINGUNO;
          
                break;
        }
    }

    public void guardar() {
        Proveedores registro = new Proveedores();
        registro.setCodigoProveedor(Integer.parseInt(txtCodigoP.getText()));
        registro.setNITProveedor(txtNITP.getText());
        registro.setNombreProveedor(txtNombresP.getText());
        registro.setApellidoProveedor(txtApellidosP.getText());
        registro.setDireccionProveedor(txtDireccionP.getText());
        registro.setRvazonSocial(txtRazonSocial.getText());
        registro.setContactoPrincipal(txtContactoP.getText());
        registro.setPaginaWebProveedor(txtSitioWeb.getText());
        registro.setContactoPrincipal(txtTelefono.getText());

        try {
            PreparedStatement procedimiento = Conection.getInstance().getConexion().prepareCall("{call sp_agregarproveedor(?,?,?,?,?,?,?,?,?,?)}");
            procedimiento.setInt(1, registro.getCodigoProveedor());
            procedimiento.setString(2, registro.getNITProveedor());
            procedimiento.setString(3, registro.getNombreProveedor());
            procedimiento.setString(4, registro.getApellidoProveedor());
            procedimiento.setString(5, registro.getDireccionProveedor());
            procedimiento.setString(6, registro.getRvazonSocial());
            procedimiento.setString(7, registro.getContactoPrincipal());
            procedimiento.setString(8, registro.getPaginaWebProveedor());
            procedimiento.setString(9, registro.getContactoPrincipal());
            listaProveedores.add(registro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void eliminar() {
        switch (tipoDeOperador) {
            case ACTUALIZAR:
                desactivarControles();
                limpiarControles();
                btnAgregarP.setText("Agregar");
                btnEliminarP.setText("Eliminar");
                btnEditarP.setDisable(false);
                btnReportesP.setDisable(false);
                tipoDeOperador = operador.NINGUNO;
                break;
            default:
                if (tvPoveedores.getSelectionModel().getSelectedItem() != null) {
                    int respuesta = JOptionPane.showConfirmDialog(null, "Confirmas la eliminacion del registro?", "Eliminar Proveedores", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                    if (respuesta == JOptionPane.YES_NO_OPTION) {
                        try {
                            PreparedStatement procedimiento = Conection.getInstance().getConexion().prepareCall("{call sp_eliminarClientes(?)}");
                            procedimiento.setInt(1, ((Proveedores) tvPoveedores.getSelectionModel().getSelectedItem()).getCodigoProveedor());
                            procedimiento.execute();
                            listaProveedores.remove(tvPoveedores.getSelectionModel().getSelectedItem());
                            limpiarControles();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe de seleccionar un cliente para eliminar");
                }

                break;
        }
    }

    public void editar() {
        switch (tipoDeOperador) {
            case NINGUNO:
                if (tvPoveedores.getSelectionModel().getSelectedItem() != null) {
                    btnEditarP.setText("Actualizar");
                    btnReportesP.setText("Cancelar");
                    btnEliminarP.setDisable(true);
                    btnAgregarP.setDisable(true);
                    activarControles();
                    txtCodigoP.setEditable(false);
                    tipoDeOperador = operador.ACTUALIZAR;
                } else {
                    JOptionPane.showMessageDialog(null, "Debe de seleccionar un cliente para editar");
                }
                break;
            case ACTUALIZAR:
                actualizar();
                btnEditarP.setText("Editar");
                btnReportesP.setText("Reportes");
                btnAgregarP.setDisable(false);
                btnEliminarP.setDisable(false);
                desactivarControles();
                limpiarControles();
                tipoDeOperador = operador.NINGUNO;
                cargarDatos();
                break;
        }
    }

    public void reportes() {
        switch (tipoDeOperador) {
            case ACTUALIZAR:
                desactivarControles();
                limpiarControles();
                btnEditarP.setText("Editar");
                btnReportesP.setText("Reportes");
                btnAgregarP.setDisable(false);
                btnEliminarP.setDisable(false);
                tipoDeOperador = operador.NINGUNO;

        }
    }

    public void actualizar() {
        try {
            PreparedStatement procedimiento = Conection.getInstance().getConexion().prepareCall("{call sp_editarproveedor(?,?,?,?,?,?,?,?,?,?)}");
            Proveedores registro = (Proveedores) tvPoveedores.getSelectionModel().getSelectedItem();
            registro.setCodigoProveedor(Integer.parseInt(txtCodigoP.getText()));
            registro.setNITProveedor(txtNITP.getText());
            registro.setNombreProveedor(txtNombresP.getText());
            registro.setApellidoProveedor(txtApellidosP.getText());
            registro.setDireccionProveedor(txtDireccionP.getText());
            registro.setRvazonSocial(txtRazonSocial.getText());
            registro.setContactoPrincipal(txtContactoP.getText());
            registro.setPaginaWebProveedor(txtSitioWeb.getText());
            registro.setContactoPrincipal(txtTelefono.getText());
            procedimiento.setInt(1, registro.getCodigoProveedor());
            procedimiento.setString(2, registro.getNITProveedor());
            procedimiento.setString(3, registro.getNombreProveedor());
            procedimiento.setString(4, registro.getApellidoProveedor());
            procedimiento.setString(5, registro.getDireccionProveedor());
            procedimiento.setString(6, registro.getRvazonSocial());
            procedimiento.setString(7, registro.getContactoPrincipal());
            procedimiento.setString(8, registro.getPaginaWebProveedor());
            procedimiento.setString(9, registro.getPaginaWebProveedor());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void desactivarControles() {
        txtCodigoP.setEditable(false);
        txtNITP.setEditable(false);

        txtDireccionP.setEditable(false);
        txtRazonSocial.setEditable(false);
        txtContactoP.setEditable(false);
        txtSitioWeb.setEditable(false);
 
    }

    public void activarControles() {
        txtCodigoP.setEditable(true);
        txtNITP.setEditable(true);
        txtNombresP.setEditable(true);
        txtApellidosP.setEditable(true);
        txtDireccionP.setEditable(true);
        txtRazonSocial.setEditable(true);
        txtContactoP.setEditable(true);
        txtSitioWeb.setEditable(true);
        txtTelefono.setEditable(true);
        txtEmailP.setEditable(true);
    }

    public void limpiarControles() {
        txtCodigoP.clear();
        txtNITP.clear();
        txtNombresP.clear();
        txtApellidosP.clear();
        txtDireccionP.clear();
        txtRazonSocial.clear();
        txtContactoP.clear();
        txtSitioWeb.clear();
        txtTelefono.clear();
        txtEmailP.clear();
    }

    public void MenuPrincipalView() {
        escenarioPrincipal.menuPrincipalView();
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnRegresarP) {
            escenarioPrincipal.menuPrincipalView();
        }
    }
    
    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    
}
