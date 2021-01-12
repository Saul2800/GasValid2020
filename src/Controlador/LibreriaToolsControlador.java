/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modeloTablaUsuario;
import Vista.Principal.accesoPrincipal;
import Vista.Principal.ventanaPrincipal;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static org.apache.poi.hssf.usermodel.HeaderFooter.date;


/**
 * Está Librieria nos permitira realizar herramientas de apoyo en el sistema entre otras.
 * Date: 25/06/2020
 * @author joseluis.caamal
 */
public class LibreriaToolsControlador {
    public String nombreTipoUsuario = "";
    
    /*Inicia: Llamo al modeloTablas para recuperar la información en get y set
    @Author: Jose L. Caamal Ic 28/06/2020
    */
    modeloTablaUsuario mt;
    
    /*
    Inicia:
    Se declaran las variables de tipo usuario para manipular el sistema en tiempo real
    Nota: Siempre hay que obtener la validación desde aquí:
    @Author: Jose Luis Caamal Ic 27/06/2020
    */
    
    public String validaUsuario(int tipoUser){
        
        /*
        0 = Gerente Técnico
        1 = Técnico Verificador
        2 = Personal de Apoyo
        */
        switch(tipoUser){
            case 0:
                nombreTipoUsuario = "Gerente Técnico";
            break;
            case 1:
                nombreTipoUsuario = "Técnico Verificador";
            break;
            case 2:
                nombreTipoUsuario = "Personal de Apoyo";
            break;
            default:
                nombreTipoUsuario = "No existe el rol de usuario";
            break;
            
            
        }
        
            
        return nombreTipoUsuario;
    }
    
    
    /*
    Termina:
    Se declaran las variables de tipo usuario para manipular el sistema en tiempo real
    Nota: Siempre hay que obtener la validación desde aquí:
    @Author: Jose Caamal 27/06/2020
    */
    
    /*
    Inicia:
    Se encripta la contraseña
    Nota: Siempre hay que obtener la validación desde aquí:
    @Author: Jose Caamal 27/06/2020
    */
    public String obtenerMD5(String input) {
       try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] messageDigest = md.digest(input.getBytes());
                BigInteger number = new BigInteger(1, messageDigest);
                String hashtext = number.toString(16);

                while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
       return hashtext;
            }
       catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
       }
    }
    
    /*
    Formateo la fecha para recibirla y guardarla en MySQL
    @Author: Jose Caamal 15/07/2020
    */
    public String convertirFecha(Date fecha){
        SimpleDateFormat plantilla;
        //fecha = new java.util.Date();  
        plantilla = new SimpleDateFormat("yyyy/MM/dd H:mm:ss"); //Obtengo Horas y 
        String tiempo = plantilla.format(fecha);
        return tiempo;
    }

    /*
    Se abre la ventana principal desde el acceso principal
    @Author: Christian Olmedo 23/07/2020
    */
    public void usuarioCorrecto(LibreriaBDControlador lbd){
//        System.out.println(lbd.mtu.toString());
//        ventanaPrincipal ventanaPrincipal = new ventanaPrincipal(lbd.mtu);
//        accesoPrincipal accesoPrincipal = new accesoPrincipal(); 
////        this.setVisible(false);
//        ventanaPrincipal.show(true);
//        //accesoPrincipal.show(false);  
    }
    
    /*
    Permite identificar el tipo de documento que se va imprimir
    @Author: Jose Luis Caamal Ic 31/08/2020
    */
    public String tipoDocumentoImprimir(int tipoDoc){
        String tipoDocumento = "";
        
        switch(tipoDoc){
            
            case 1:
                tipoDocumento = "CONTRATO2021.docx";
            break;
            case 2:
                tipoDocumento = "SOLICITUD2021.docx";
            break;
            case 3:
                tipoDocumento = "DICTAMENBOMBAS2021.docx";
            break;
            case 4:
                tipoDocumento = "DICTAMENBOMBAS2021H2.docx";
            break;
            default:
                //tipoDocumento = "CONTRATO2021.docx";
            break;
        }
        System.out.println(tipoDocumento);
        
        return tipoDocumento;
    }
    
    /*
    Permite identificar el tipo de documento que se va imprimir
    @Author: Jose Luis Caamal Ic 31/08/2020
    */
    public String tipoDocumentoGenerar(int tipoDoc, String nameArchive){
        String tipoDocumento = "";
        
        switch(tipoDoc){
            
            case 1:
                tipoDocumento = "ContratoFolio-"+nameArchive;
            break;
            case 2:
                tipoDocumento = "SolicitudFolio-"+nameArchive;
            break;
            case 3:
                tipoDocumento = "DictamenBombaUno-"+nameArchive;
            break;
            case 4:
                tipoDocumento = "DictamenBombaDos-"+nameArchive;
            break;
            default:
                //tipoDocumento = "CONTRATO2021.docx";
            break;
        }
        System.out.println(tipoDocumento);
        
        return tipoDocumento;
    }
        //Abre el archivo deseado en la dirección deseada
    //@direccionArchivo C:/Formatos
    //@Jose Luis Caamal Ic
    public void openWord(String direccionArchivo){

     try {

            File objetofile = new File (direccionArchivo);
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }

    }
    //Elimina el archivo deseado en la dirección deseada
    //@direccionArchivo C:/Formatos
    //@Jose Luis Caamal Ic
    public int deleteDocumento(String direccionArchivo){
     int valida = 0;
        try {
               //File objetofile = new File (direccionArchivo);
               Files.delete(Paths.get(direccionArchivo));
               //Desktop.getDesktop().open(objetofile);
               valida = 1;
        }catch (IOException ex) {

               System.out.println(ex);
               valida = 0;
        }
       return valida;
    }
    
    //Obtiene el Periodo para el documento
    //@direccionArchivo C:/Formatos
    //@Jose Luis Caamal Ic
    //31/08/2020
    public String obtenerPeriodo(){
     
       String[] periodo={"1ER PERIODO","2DO PERIODO"};
       JComboBox jcd = new JComboBox(periodo);
       jcd.setEditable(true);
       jcd.setSelectedIndex(1);
       
       JOptionPane.showMessageDialog(null, jcd, "Title",JOptionPane.QUESTION_MESSAGE);
       
       String opcion = (String) jcd.getSelectedItem();
       
       return opcion;
    }
    
    public String obtenerHorarioInicio(){
     
       JOptionPane.showMessageDialog(null, "Por favor, ingresa la hora inicial en formato: AM/PM");
       String[] periodo={"00:00 AM/PM"};
       
       JComboBox jcd = new JComboBox(periodo);
       jcd.setEditable(true);
       jcd.setSelectedIndex(0);
       
       JOptionPane.showMessageDialog(null, jcd, "Title",JOptionPane.QUESTION_MESSAGE);
       
       String opcion = (String) jcd.getSelectedItem();
       
       return opcion;
    }
    
    public String obtenerHorarioFIN(){
     
       JOptionPane.showMessageDialog(null, "Por favor, ingresa la hora fin en formato: AM/PM");
       String[] periodo={"00:00 AM/PM"};
       
       JComboBox jcd = new JComboBox(periodo);
       jcd.setEditable(true);
       jcd.setSelectedIndex(0);
       
       JOptionPane.showMessageDialog(null, jcd, "Title",JOptionPane.QUESTION_MESSAGE);
       
       String opcion = (String) jcd.getSelectedItem();
       
       return opcion;
    }
    
    public baseUserHorario obtenerPeriodoClase(){
       baseUserHorario buh = null;
       String[] periodo={"1ER PERIODO","2DO PERIODO"};
       String[] horarioHora={"1ER PERIODO","2DO PERIODO"};
       String[] horarioMin={"1ER PERIODO","2DO PERIODO"};
       
       JComboBox jcd = new JComboBox(periodo);
       jcd.setEditable(true);
       jcd.setSelectedIndex(1);
       
       JComboBox jcd1 = new JComboBox(horarioHora);
       jcd.setEditable(true);
       jcd.setSelectedIndex(1);
       
       JComboBox jcd2 = new JComboBox(horarioMin);
       jcd.setEditable(true);
       jcd.setSelectedIndex(1);
       
       
       String opcion = (String) jcd.getSelectedItem();
       String horarioinicio = (String) jcd1.getSelectedItem();
       String horariofin = (String) jcd2.getSelectedItem();
       
       JOptionPane.showMessageDialog(null, jcd, "Title",JOptionPane.QUESTION_MESSAGE);
       buh = new baseUserHorario(opcion,horarioinicio,horariofin);
       return buh;
    }
    
    public String obtenerFecha(){
     
       JOptionPane.showMessageDialog(null, "Por favor, ingresa la fecha");
       JDateChooser jd = new JDateChooser();
       Date date = new Date();
       date.setMonth(12);
       date.setYear(1993);
       date.setDate(13);
       jd.setDate(date);
       String message ="Elija la fecha:\n";
       Object[] params = {message,jd};
       
       JOptionPane.showConfirmDialog(null,params,"Fecha", JOptionPane.PLAIN_MESSAGE);
       String s="";
       SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
       s=sdf.format(((JDateChooser)params[1]).getDate());//Casting params[1] makes me able to get its information
       
       //JOptionPane.showMessageDialog(null, "Elige una fecha:");}
       
       return s;
    }
}
