/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author joseluis.caamal
 */
public class baseUserHorario {
    private String periodo;
    private String HoraInicio;
    private String HoraFin;

    public baseUserHorario(String periodo, String HoraInicio, String HoraFin) {
        this.periodo = periodo;
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setHoraInicio(String HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public void setHoraFin(String HoraFin) {
        this.HoraFin = HoraFin;
    }
    
    
}
