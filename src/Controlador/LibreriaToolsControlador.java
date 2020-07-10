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
    Inicia:
    @obtenerDatosUsuarioGlobal void para recuperar la info de la lista obtenida en la consulta
    Se encripta la contraseña
    Nota: Siempre hay que obtener la validación desde aquí:
    @Author: Jose Caamal 27/06/2020
    */
//    public void obtenerDatosUsuarioGlobal(List<Object> listaDatosUsuarios) {
//        int tamañoListaDU = listaDatosUsuarios.size(); //Obtengo el tamaño de los usuarios
//       //Cuando se añada un nuevo campo a la tabla es necesario que se actualize :p
//       //En un futuro se puede pasar a la libreria de bd
//       Iterator iter = listaDatosUsuarios.iterator();
//       while (iter.hasNext()){
//            
//            switch(tamañoListaDU){
//                /*Nota:
//                Cuando es un objeto puedo castear directamente unicamente añadiendo el tipo de variable
//                que deseo que se convierta ejemplo: (int) nameVariable
//                Jose Luis Caamal Ic 28/06/2020
//                */
//                case 1:
//                    mt.setTipoUsuario((int) iter.next());
//                    System.out.println("Posición"+tamañoListaDU+": "+iter.next());
//                break;
//                case 2:
//                    mt.setNombreCompleto((String) iter.next());
//                    System.out.println("Posición"+tamañoListaDU+": "+iter.next());
//                break;
//                case 3:
//                    //mt.setFechaFin((String) iter.next());
//                    System.out.println("Posición"+tamañoListaDU+": "+iter.next());
//                break;
//                case 4:
//                    //mt.setFechaInicio((String) iter.next());
//                    System.out.println("Posición"+tamañoListaDU+": "+iter.next());
//                break;
//                case 5:
//                    mt.setPassword((String) iter.next());
//                    System.out.println("Posición"+tamañoListaDU+": "+iter.next());
//                break;
//                case 6:
//                    mt.setNombreUsuario((String) iter.next());
//                    System.out.println("Posición"+tamañoListaDU+": "+iter.next());
//                break;
//                case 7:
//                    mt.setIdActual((int) iter.next());
//                    System.out.println("Posición"+tamañoListaDU+": "+iter.next());
//                break;
//                case 8:
//                    System.out.println("Posición"+tamañoListaDU+": "+iter.next());
//                break;
//                default:
//                    System.out.println("Hay valores que aún no estan en la lista: "+tamañoListaDU+": "+iter.next());
//                break;
//            }
//            tamañoListaDU = tamañoListaDU-1; //Quito un valor al tamaño para que el contenido sea exacto
//            
//        }
//    }
       
}
