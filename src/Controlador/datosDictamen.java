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
public class datosDictamen {
    
    private String m_Estacion;
    private String m_Folio;
    private String m_Fecha;
    private String m_TotalDispensarios;
    /**/
    private String m_ladoDispensario;
    private String m_MarcaGasolina;
    private String m_NoSerie;
    private String m_HologramaProfeco;
    private String m_HologramaUva;
    private String m_Cumple;

    public datosDictamen(String m_Estacion, String m_Folio, String m_Fecha, String m_TotalDispensarios, String m_ladoDispensario, String m_MarcaGasolina, String m_NoSerie, String m_HologramaProfeco, String m_HologramaUva, String m_Cumple) {
        this.m_Estacion = m_Estacion;
        this.m_Folio = m_Folio;
        this.m_Fecha = m_Fecha;
        this.m_TotalDispensarios = m_TotalDispensarios;
        this.m_ladoDispensario = m_ladoDispensario;
        this.m_MarcaGasolina = m_MarcaGasolina;
        this.m_NoSerie = m_NoSerie;
        this.m_HologramaProfeco = m_HologramaProfeco;
        this.m_HologramaUva = m_HologramaUva;
        this.m_Cumple = m_Cumple;
    }
    
    
    

    public String getM_Estacion() {
        return m_Estacion;
    }

    public String getM_Folio() {
        return m_Folio;
    }

    public String getM_Fecha() {
        return m_Fecha;
    }

    public String getM_TotalDispensarios() {
        return m_TotalDispensarios;
    }

    public String getM_ladoDispensario() {
        return m_ladoDispensario;
    }

    public String getM_MarcaGasolina() {
        return m_MarcaGasolina;
    }

    public String getM_NoSerie() {
        return m_NoSerie;
    }

    public String getM_HologramaProfeco() {
        return m_HologramaProfeco;
    }

    public String getM_HologramaUva() {
        return m_HologramaUva;
    }

    public String getM_Cumple() {
        return m_Cumple;
    }

    public void setM_Estacion(String m_Estacion) {
        this.m_Estacion = m_Estacion;
    }

    public void setM_Folio(String m_Folio) {
        this.m_Folio = m_Folio;
    }

    public void setM_Fecha(String m_Fecha) {
        this.m_Fecha = m_Fecha;
    }

    public void setM_TotalDispensarios(String m_TotalDispensarios) {
        this.m_TotalDispensarios = m_TotalDispensarios;
    }

    public void setM_ladoDispensario(String m_ladoDispensario) {
        this.m_ladoDispensario = m_ladoDispensario;
    }

    public void setM_MarcaGasolina(String m_MarcaGasolina) {
        this.m_MarcaGasolina = m_MarcaGasolina;
    }

    public void setM_NoSerie(String m_NoSerie) {
        this.m_NoSerie = m_NoSerie;
    }

    public void setM_HologramaProfeco(String m_HologramaProfeco) {
        this.m_HologramaProfeco = m_HologramaProfeco;
    }

    public void setM_HologramaUva(String m_HologramaUva) {
        this.m_HologramaUva = m_HologramaUva;
    }

    public void setM_Cumple(String m_Cumple) {
        this.m_Cumple = m_Cumple;
    }

    @Override
    public String toString() {
        return "" + "m_Estacion= " + m_Estacion + ", m_Folio=" + m_Folio + ", m_Fecha=" + m_Fecha + ", m_TotalDispensarios=" + m_TotalDispensarios + ", m_ladoDispensario=" + m_ladoDispensario + ", m_MarcaGasolina=" + m_MarcaGasolina + ", m_NoSerie=" + m_NoSerie + ", m_HologramaProfeco=" + m_HologramaProfeco + ", m_HologramaUva=" + m_HologramaUva + ", m_Cumple=" + m_Cumple + "/n";
    }
}
