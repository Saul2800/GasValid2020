/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author joseluis.caamal
 * @since 27/06/2020
 */
public class modeloTablaUsuario {
    
    //Inician Campos de Tabla Usuario
    private int idActual;

    private String nombreUsuario;

    private String nombreCompleto;
    
    private String password;
    
    private String fechaInicio;
    
    private String fechaFin;
    
    private int tipoUsuario;
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    public int getIdActual() {
        return idActual;
    }

    public void setIdActual(int idActual) {
        this.idActual = idActual;
    }
    
    @Override
    public String toString() {
        return "modeloTablas{" + "idActual=" + idActual + ", nombreUsuario=" + nombreUsuario + ", nombreCompleto=" + nombreCompleto + ", password=" + password + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", tipoUsuario=" + tipoUsuario + '}';
    }
    //Terminan Campos de Tabla Usuario

    
}
