
package org.abnerdelcid.bean;


public class Proveedores {
    
    private int codigoProveedor;
    private String NITproveedor;
    private String nombreProveedor;
    private String apellidoProveedor;
    private String direccionProveedor;
    private String razonSocial;
    private String contactoPrincipal;
    private String paginaWeb;
    
    public Proveedores() {
    }

    public Proveedores(int codigoProveedor, String NITProveedor, String nombreProveedor, String apellidoProveedor, String direccionProveedor, String rvazonSocial, String contactoPrincipal, String paginaWebProveedor) {
        this.codigoProveedor = codigoProveedor;
        this.NITproveedor = NITProveedor;
        this.nombreProveedor = nombreProveedor;
        this.apellidoProveedor = apellidoProveedor;
        this.direccionProveedor = direccionProveedor;
        this.razonSocial = rvazonSocial;
        this.contactoPrincipal = contactoPrincipal;
        this.paginaWeb = paginaWebProveedor;
    }

    
    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNITproveedor() {
        return NITproveedor;
    }

    public void setNITproveedor(String NITproveedor) {
        this.NITproveedor = NITproveedor;
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

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }
    
    
    
}
