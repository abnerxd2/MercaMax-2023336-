
package org.abnerdelcid.bean;



public class Factura {
    private int numerofactura;
    private String estadofactura;
    private double totalFactura;
    private String fechaFactura;
    private String codigoCliente;
    private int codigoEmpleado;

    public Factura() {
    }

    public Factura(int numerofactura, String estadofactura, double totalFactura, String fechaFactura, String codigoCliente, int codigoEmpleado) {
        this.numerofactura = numerofactura;
        this.estadofactura = estadofactura;
        this.totalFactura = totalFactura;
        this.fechaFactura = fechaFactura;
        this.codigoCliente = codigoCliente;
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getNumerofactura() {
        return numerofactura;
    }

    public void setNumerofactura(int numerofactura) {
        this.numerofactura = numerofactura;
    }

    public String getEstadofactura() {
        return estadofactura;
    }

    public void setEstadofactura(String estadofactura) {
        this.estadofactura = estadofactura;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
    
}
