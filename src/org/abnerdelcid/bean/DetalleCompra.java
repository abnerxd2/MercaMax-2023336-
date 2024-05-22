
package org.abnerdelcid.bean;


public class DetalleCompra {
    private int codigoDetalleCompra;
    private double costoUnitario;
    private int cantidad;
    private int codigoProducto;
    private int numeroDOcumentoC;

    public DetalleCompra() {
    }

    public DetalleCompra(int codigoDetalleCompra, double costoUnitario, int cantidad, int codigoProducto, int numeroDOcumentoC) {
        this.codigoDetalleCompra = codigoDetalleCompra;
        this.costoUnitario = costoUnitario;
        this.cantidad = cantidad;
        this.codigoProducto = codigoProducto;
        this.numeroDOcumentoC = numeroDOcumentoC;
    }

    public int getCodigoDetalleCompra() {
        return codigoDetalleCompra;
    }

    public void setCodigoDetalleCompra(int codigoDetalleCompra) {
        this.codigoDetalleCompra = codigoDetalleCompra;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getNumeroDOcumentoC() {
        return numeroDOcumentoC;
    }

    public void setNumeroDOcumentoC(int numeroDOcumentoC) {
        this.numeroDOcumentoC = numeroDOcumentoC;
    }
    
    
    
    
}
