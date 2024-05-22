
package org.abnerdelcid.bean;


public class Compras {
    
    
    private int numeroDOcumentoC;
    private String FechaDocumento;
    private String Descripcion;
    private  double totalDocumento;

    public Compras() {
    }

    public Compras(int numeroDOcumentoC, String FechaDocumento, String Descripcion, double totalDocumento) {
        this.numeroDOcumentoC = numeroDOcumentoC;
        this.FechaDocumento = FechaDocumento;
        this.Descripcion = Descripcion;
        this.totalDocumento = totalDocumento;
    }

    public int getNumeroDOcumentoC() {
        return numeroDOcumentoC;
    }

    public void setNumeroDOcumentoC(int numeroDOcumentoC) {
        this.numeroDOcumentoC = numeroDOcumentoC;
    }

    public String getFechaDocumento() {
        return FechaDocumento;
    }

    public void setFechaDocumento(String FechaDocumento) {
        this.FechaDocumento = FechaDocumento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getTotalDocumento() {
        return totalDocumento;
    }

    public void setTotalDocumento(double totalDocumento) {
        this.totalDocumento = totalDocumento;
    }
    
    
}
