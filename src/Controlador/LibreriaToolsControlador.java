/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modeloTablaUsuario;
import Vista.Principal.accesoPrincipal;
import Vista.Principal.ventanaPrincipal;
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
     
       String[] periodo={"1ER PERIODO","2DO PERIODO","3RO PERIODO","4TO PERIODO","5TO PERIODO"};
       JComboBox jcd = new JComboBox(periodo);
       jcd.setEditable(true);
       jcd.setSelectedIndex(4);
       
       JOptionPane.showMessageDialog(null, jcd, "Title",JOptionPane.QUESTION_MESSAGE);
       
       String opcion = (String) jcd.getSelectedItem();
       
       return opcion;
    }
}
