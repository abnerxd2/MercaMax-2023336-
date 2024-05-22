
package org.abnerdelcid.bean;


public class Proveedores {
    
    private int codigoProveedor;
    private String NITProveedor;
    private String nombreProveedor;
    private String apellidoProveedor;
    private String direccionProveedor;
    private String razonSocial;
    private String contactoPrincipal;
    private String paginaWebProveedor;
    
    public Proveedores() {
    }

    public Proveedores(int codigoProveedor, String NITProveedor, String nombreProveedor, String apellidoProveedor, String direccionProveedor, String rvazonSocial, String contactoPrincipal, String paginaWebProveedor) {
        this.codigoProveedor = codigoProveedor;
        this.NITProveedor = NITProveedor;
        this.nombreProveedor = nombreProveedor;
        this.apellidoProveedor = apellidoProveedor;
        this.direccionProveedor = direccionProveedor;
        this.razonSocial = rvazonSocial;
        this.contactoPrincipal = contactoPrincipal;
        this.paginaWebProveedor = paginaWebProveedor;
    }

    public Proveedores(int aInt, String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNITProveedor() {
        return NITProveedor;
    }

    public void setNITProveedor(String NITProveedor) {
        this.NITProveedor = NITProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getApellidoProveedor() {
        return apellidoProveedor;
    }

    public void setApellidoProveedor(String apellidoProveedor) {
        this.apellidoProveedor = apellidoProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getRvazonSocial() {
        return razonSocial;
    }

    public void setRvazonSocial(String rvazonSocial) {
        this.razonSocial = rvazonSocial;
    }

    public String getContactoPrincipal() {
        return contactoPrincipal;
    }

    public void setContactoPrincipal(String contactoPrincipal) {
        this.contactoPrincipal = contactoPrincipal;
    }

    public String getPaginaWebProveedor() {
        return paginaWebProveedor;
    }

    public void setPaginaWebProveedor(String paginaWebProveedor) {
        this.paginaWebProveedor = paginaWebProveedor;
    }
    
    
    
}
