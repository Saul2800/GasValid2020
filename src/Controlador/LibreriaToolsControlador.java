/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modeloTablaUsuario;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


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
}
