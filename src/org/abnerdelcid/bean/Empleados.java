
package org.abnerdelcid.bean;


public class Empleados {
    
    
    private int codigoEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private double sueldoEmpleado;
    private String direccionEmpleado;
    private  String turnoEmpleado;
    private int codigoCargoEmpleado;

    public Empleados() {
    }

    public Empleados(int codigoEmpleado, String nombreEmpleado, String apellidoEmpleado, double sueldoEmpleado, String direccionEmpleado, String turnoEmpleado, int codigoCargoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.sueldoEmpleado = sueldoEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.turnoEmpleado = turnoEmpleado;
        this.codigoCargoEmpleado = codigoCargoEmpleado;
    }
    
    
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(double sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getTurnoEmpleado() {
        return turnoEmpleado;
    }

    public void setTurnoEmpleado(String turnoEmpleado) {
        this.turnoEmpleado = turnoEmpleado;
    }

    public int getCodigoCargoEmpleado() {
        return codigoCargoEmpleado;
    }

    public void setCodigoCargoEmpleado(int codigoCargoEmpleado) {
        this.codigoCargoEmpleado = codigoCargoEmpleado;
    }
    
    
}
