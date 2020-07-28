/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Dispensarios.modificarDispensario;
import Vista.Principal.accesoPrincipal;

/**
 *
 * @author Jose Luis Caamal Ic
 * @Objetive metodo inicial/ principal de GasValid2.0
 */
public class mainGasValid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Implementamos la aplicación para que pueda correr el logo y luego el inicio de sesión
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainGasValid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainGasValid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainGasValid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainGasValid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        accesoPrincipal mainPrincipal = new accesoPrincipal();
        mainPrincipal.show();
    }
    
}
