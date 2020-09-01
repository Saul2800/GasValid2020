/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package mx.com.hash.tablacolor;
package Controlador;
/**
 *
 * @author David
 */
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class colorTabla implements TableCellRenderer {

    private Integer fila;
     private Integer columna;
    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

    /**
     * Creamos el resaltador indicando que fila se coloreara por defecto
     *
     * @param row
     */
    public colorTabla(Integer row,Integer col) {
        fila = row;
        columna = col;
    }

    public Integer getColumna() {
        return columna;
    }

    public void setColumna(Integer columna) {
        this.columna = columna;
    }
    

    /**
     * Colorea la celda si pertenece a la fila indicada, esta funcion es llamada
     * internamente por la tabla que use esta clase como renderizados
     *
     * @param table Tabla
     * @param value Valor de la celda
     * @param isSelected Celda selecionada
     * @param hasFocus Celta tiene el foco
     * @param row Fila de la celda
     * @param column Columna de la celda
     * @return Celda de la tabla
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Obtenemos la celda que se esta renderizando
        Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//Para Filas
//        // Si la celda esta en la fila indicada y no esta seleccionada se coloreara de este modo        
//        if (fila.compareTo(row) == 0 && isSelected == false) {
//            c.setBackground(Color.decode("#FF88FF"));
//            c.setForeground(Color.BLACK);
//            // Si la celda esta en la fila indicada y esta seleccionada se coloreara de este modo
//        } else if (fila.compareTo(row) == 0 && isSelected == true) {
//            c.setBackground(Color.RED);
//            c.setForeground(Color.WHITE);
//            // Si la celda no esta en la fila indicada y esta seleccionada se coloreara de este modo
//        } else if (fila.compareTo(row) != 0 && isSelected == true) {
//            c.setBackground(Color.BLUE);
//            c.setForeground(Color.WHITE);
//            // En los demas casos se coloreara de este modo
//        } else {
//            c.setBackground(Color.WHITE);
//            c.setForeground(Color.BLACK);
//        }
//Para columnas
        // Si la celda esta en la fila indicada y no esta seleccionada se coloreara de este modo        
        if (columna.compareTo(column) == 0 && isSelected == false) {
            c.setBackground(Color.decode("#9c9c9c"));
            c.setForeground(Color.BLACK);
        }
        else{
            if (columna.compareTo(column) == 2 && isSelected == false) {
                c.setBackground(Color.decode("#9c9c9c"));
                c.setForeground(Color.BLACK);
            }
        }
            // Si la celda esta en la fila indicada y esta seleccionada se coloreara de este modo
//        } else if (columna.compareTo(column) == 0 && isSelected == true) {
//            //c.setBackground(Color.RED);
//            c.setForeground(Color.WHITE);
//            // Si la celda no esta en la fila indicada y esta seleccionada se coloreara de este modo
//        } else if (columna.compareTo(column) != 0 && isSelected == true) {
//            c.setBackground(Color.BLUE);
//            c.setForeground(Color.WHITE);
//            // En los demas casos se coloreara de este modo
//        } else {
//            c.setBackground(Color.WHITE);
//            c.setForeground(Color.BLACK);
//        }
        // Regresamos la celda para que se agrege a la tabla
        return c;
    }

    /**
     * @return the fila
     */
    public Integer getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(Integer fila) {
        this.fila = fila;
    }
}