/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modeloTablaUsuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 * Esta librería nos permitira controlar el acceso y consultas en base de datos.
 * Date: 25/06/2020
 * @author joseluis.caamal
 */
public class LibreriaBDControlador {
    private static Connection Conexion; //Abro la conexión
/*Inciamos el constructor*/

   //controladorLibrerias lv = new controladorLibrerias();
    public modeloTablaUsuario mtu = new modeloTablaUsuario();
/*  ----------------------------------------------------------------------------------
    Nombre: Clase conex()
    Función: Apertura La Conexión con la BD/ Utilizado para la consulta de tablas
    Aut@r: José Luis Caamal Ic
    Parametros: 
    ----------------------------------------------------------------------------------
    
    ----------------------------------------------------------------------------------
Crecenciales de DB
    
    
    
*/
    public Connection openConnection() {
        
        try {
            String db_nam = "gasvalid";
            String use = "root";
            String pas ="ARENAS28";
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_nam, use, pas);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
           // Logger.getLogger(LibreriaHerramientas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Conexion;
    }
    
/*  ----------------------------------------------------------------------------------
    Nombre: Clase MySQLConnection
    Función: Apertura La Conexión con la BD
    Aut@r: José Luis Caamal Ic
    Parametros: 
    ----------------------------------------------------------------------------------
*/
    public void MySQLConnection(String user, String pass, String db_name) {
        db_name = "gasvalid";
        user = "root";
        pass="ARENAS28";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*  ----------------------------------------------------------------------------------
    Nombre: Clase closeConnection
    Función: Cierra La Conexión con la BD
    Aut@r: José Luis Caamal Ic
    Parametros: 
    ----------------------------------------------------------------------------------
*/
    public void closeConnection() {
        try {
            Conexion.close();
            System.out.println("Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/*  ----------------------------------------------------------------------------------
    Nombre: Clase obtenerIDUser
    Función: Obtiene el siguiente ID del usuario
    Aut@r: José Luis Caamal Ic
    Parametros: 
    ----------------------------------------------------------------------------------
*/    
    public int obtenerIDUser(String table_name) {
        int id = 0;
        try {
            String Query = "SELECT count(*) as countid FROM " + table_name;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);

            while (resultSet.next()) {
                
                id = resultSet.getInt("countid");
                if(id==0){
                    id= id+1;
                }
                else{
                    id= id+1;
                }
                System.out.println("ID: " + resultSet.getInt("countid"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
            return id;
        }
        return id;
    }
    
    /*Inicia: Inserto los datos a la base de datos en la tabla usuarios
    @insertarDatosUsuario
    @Date 27/06/2020
    @Author Jose Luis Caamal Ic 
    */
    public void insertarDatosUsuario(String table_name, int ID, String name, String password, 
                                     String fechaInicio, String fechaFin, String nombreCompleto, 
                                     int tipoUsuario) {
        try {
            String Query = "INSERT INTO " + table_name + " VALUES("
                    + "\"" + ID + "\", "
                    + "\"" + name + "\", "
                    + "\"" + password + "\", "
                    + "\"" + fechaInicio + "\", "
                    + "\"" + fechaFin + "\", "
                    + "\"" + nombreCompleto + "\", "
                    + "\"" + tipoUsuario + "\")";
            //Inica el statement de la conexión
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }
    
    /*  ----------------------------------------------------------------------------------
    Nombre: Clase obtenerDatosUsuarios
    Función: Obtiene todos los usuarios
    Aut@r: José Luis Caamal Ic
    Parametros: 
    @Date: 28/06/2020
    ----------------------------------------------------------------------------------
*/    
    public List <Object> obtenerDatosUsuario(String table_name, String usuarioIngresado,
                                             String passwordIngresado) {
        //int id = 0;
        List <Object> datosUsuarios = new ArrayList<Object>(); //Cargo una lista JLCI 28/06/2020 :D
        try {
            String Query = "SELECT * FROM " + table_name+" WHERE nombre_usuario = '"+usuarioIngresado+"' and password = '"+passwordIngresado+"'";
            System.out.println(Query);
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);

            while (resultSet.next()) {
                
                mtu.setIdActual(resultSet.getInt("id"));
                datosUsuarios.add(resultSet.getInt("id"));
                
                mtu.setNombreUsuario(resultSet.getString("nombre_usuario"));
                datosUsuarios.add(resultSet.getString("nombre_usuario"));
                
                mtu.setPassword(resultSet.getString("password"));
                datosUsuarios.add(resultSet.getString("password"));
                
                mtu.setFechaInicio(resultSet.getString("fechainicio"));
                datosUsuarios.add(resultSet.getString("fechainicio"));
                
                mtu.setFechaFin(resultSet.getString("fechafinal"));
                datosUsuarios.add(resultSet.getString("fechafinal"));
                
                mtu.setNombreCompleto(resultSet.getString("nombre_completo"));
                datosUsuarios.add(resultSet.getString("nombre_completo"));
                
                mtu.setTipoUsuario(resultSet.getInt("tipo_usuario"));
                datosUsuarios.add(resultSet.getInt("tipo_usuario"));
                
            }
            System.out.println("Lista datosUsuarios es: "+datosUsuarios);
            System.out.println("ModeloTablas datosUsuarios es: "+mtu.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
            return datosUsuarios;
        }
        return datosUsuarios;
    }
/*  ----------------------------------------------------------------------------------
    Nombre: Clase updateDatosUsuario
    Función: Actualiza los valores en la tabla correspondiente.
    Aut@r: José Luis Caamal Ic
    Parametros: Table: tabla_pacientes
                Columns:
    Date: 27/06/2020
    ----------------------------------------------------------------------------------
*/
public int updateDatosUsuario(String table_name, int ID, String password, 
                                     String nombreCompleto, 
                                     int tipoUsuario) {
        try {
            //int response;
            String sql = ("UPDATE  " + table_name  + " "
                    + "SET "
                    + "password = '" + password + "', "
                    + "nombre_completo = '" + nombreCompleto + "', "
                    + "tipo_usuario = '" + tipoUsuario + "' "
                    + "WHERE id = '"+ID+"'");
            System.out.println("consulta updateDatosUsuario "+sql);
            Statement st = Conexion.createStatement();
            st.executeUpdate(sql);	
            //System.out.println(" Response: "+ response);
            //JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
            return 1;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
            return 0;
        }
    }
/*  ----------------------------------------------------------------------------------
    Nombre: Clase eliminarFila
    Función: Elimina los valores en la tabla correspondiente.
    Aut@r: José Luis Caamal Ic
    Parametros: Table: tabla_pacientes
                Columns:
    Date: 27/06/2020
    ----------------------------------------------------------------------------------
*/

    public int eliminarFila(String table_name, String ID) {
        try {
            String Query = "DELETE FROM " + table_name + " WHERE ID = \"" + ID + "\"";
            System.out.println("SQL Elimina: "+Query);
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");return 0;
        }
        return 1;
    }
    
    
    /*  ----------------------------------------------------------------------------------
    Nombre: Clase validaSiExisteUsuario
    Función: Valida si existe el usuario en BD
    Aut@r: José Luis Caamal Ic
    Parametros: 
    ----------------------------------------------------------------------------------
*/    
    public int validaSiExisteUsuario(String table_name,String id) {
        int idAux = 0;
        try {
            String Query = "SELECT count(*) as countid FROM " + table_name+" WHERE id = "+id;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);

            while (resultSet.next()) {
                
                idAux = resultSet.getInt("countid");
                System.out.println(" validaSiExisteUsuario Campos Existentes: " + resultSet.getInt("countid"));
            }
            if(idAux>0){
                idAux = 1;
            }
            else{
                idAux = 0;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
            return idAux;
        }
        return idAux;
    }    
    
    //Saul Arenas Ramirez 07/8/2020
    //insertar los hologramas en la tabla TablaGasValid
        public void insertarHologramas(String table_name, String  Holograma, String tipoHolograma) {
        try {
    PreparedStatement pps=Conexion.prepareStatement("INSERT INTO TablaGasValid(Holograma,tipoHolograma) VALUES (?,?) ");
    pps.setString(1,Holograma);//Eso estuvo bueno :v buena saúl.
    pps.setString(2, tipoHolograma);
    
    pps.executeUpdate();
    
            //Inica el statement de la conexión
            Statement st = Conexion.createStatement();
   //     st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos"+ex);
        }
    }
        
        
    /*  ----------------------------------------------------------------------------------
    Nombre: Clase selectLlenaTabla
    Función: Guarda los valores en la tabla correspondiente.
    Date: 11/07/2020
    Aut@r: José Luis Caamal Ic
    Parametros: table_name -- Nombre de la tabla
                dni_user -- Nombre Usuario
                usuario --- Usuario que recibe el nombre
                password -- Contraseña
    ----------------------------------------------------------------------------------
    */ 
    public Object[] selectLlenaTabla(String folioH,String statusH){
     Object llenaTabla[] = null;
    
    try {
            String Query = "SELECT * FROM gasvalid.tablagasvalid";
            if(!folioH.equals("")){
                Query = Query + "WHERE Holograma = "+folioH+" "; //Añado el filtro holograma
            }
            if(!statusH.equals("")){
                Query = Query + "AND Estatus = "+statusH+" "; //Añado el filtro status
            }
            
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            ResultSetMetaData metaDatos = resultSet.getMetaData();
            while (resultSet.next()) {
                                    // Se obtiene el número de columnas.
                    int numeroColumnas = metaDatos.getColumnCount();

                    // Se crea un array de etiquetas para rellenar
                    llenaTabla = new Object[numeroColumnas];
                    
                    // Se obtiene cada una de las etiquetas para cada columna
                    for (int i = 0; i < numeroColumnas; i++)
                    {
                       // Nuevamente, para ResultSetMetaData la primera columna es la 1.
                       llenaTabla[i] = metaDatos.getColumnLabel(i + 1);
                    }
            }
            
            //JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
            return llenaTabla;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
        return llenaTabla;

}
    /*  ----------------------------------------------------------------------------------
    Nombre: Clase modeloGasValid
    Función: Se realiza la implementación del modelo par el llenado de tabla
    Date: 11/07/2020
    Aut@r: José Luis Caamal Ic
    Parametros: String columna[],String folioH,String statusH
    ----------------------------------------------------------------------------------
    */
    
    public DefaultTableModel modeloGasValid(String columna[],String tipoHolograma,String folioH,String statusH){
    DefaultTableModel modeloRetorno;
    modeloRetorno = new DefaultTableModel(null, columna); 
    boolean validaFiltros = false; //Controla todos los filtros
    try{
            String Query = "SELECT * FROM gasvalid.tablagasvalid";
            
            if(!tipoHolograma.equals("")&& !validaFiltros)
            {
                    Query = "SELECT * FROM gasvalid.tablagasvalid";
                    Query = Query + " WHERE tipoHolograma = '"+tipoHolograma+"' "; //Añado el filtro holograma
                    if(!statusH.equals("")){
                    Query = Query + " AND Estatus = '"+statusH+"' "; //Añado el filtro status
                    
                    }
                    if(!folioH.equals("")){
                        Query = Query + "AND Holograma = '"+folioH+"' "; //Añado el filtro status
                    }
                    validaFiltros = true;
                
            }
            if(!folioH.equals("") && !validaFiltros){
                    Query = "SELECT * FROM gasvalid.tablagasvalid";
                    Query = Query + " WHERE Holograma = '"+folioH+"' "; //Añado el filtro holograma
                    if(!tipoHolograma.equals("")){
                    Query = Query + " AND tipoHolograma = '"+tipoHolograma+"' "; //Añado el filtro status
                    
                    }
                    if(!statusH.equals("")){
                    Query = Query + " AND Estatus = '"+statusH+"' "; //Añado el filtro status
                    }
                    validaFiltros = true;
            }
            if(!statusH.equals("") && !validaFiltros){
                    Query = "SELECT * FROM gasvalid.tablagasvalid";
                    Query = Query + " WHERE Estatus = '"+statusH+"' "; //Añado el filtro status
                    
                    if(!tipoHolograma.equals("")){
                    Query = Query + " AND tipoHolograma = '"+tipoHolograma+"' "; //Añado el filtro status
                    
                    }
                    if(!folioH.equals("")){
                        Query = Query + " AND Holograma = '"+folioH+"' "; //Añado el filtro status
                    }
                    validaFiltros = true;
            }

            System.out.println("Contenido en ejecución: "+Query);

            PreparedStatement us = Conexion.prepareStatement(Query);
            ResultSet res = us.executeQuery();
            Object objDatos[] = new Object[columna.length]; //Siempre debe cconexoincidir con el numero de columnas!
            
            while(res.next()){
                for (int i = 0; i<columna.length; i++){
                    objDatos[i] = res.getObject(i+1);
                    System.out.println(objDatos[i]);
                }
                modeloRetorno.addRow(objDatos);
            }
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    
    return modeloRetorno;
}
    
    
    //Saul Arenas Ramirez 12/07/28   
public void ModificarHolograma(String Holograma,String Estatus,String tipoHolograma) {

        try{
PreparedStatement stmt;
            stmt = Conexion.prepareStatement("SELECT Holograma FROM TablaGasValid WHERE Holograma = '" + Holograma+ "'");
           java.sql.ResultSet res;
           
            res = stmt.executeQuery();

            if(res.next()){
//se encontro
 try{

//PreparedStatement stmt  ;
stmt=Conexion.prepareStatement("UPDATE TablaGasValid SET Estatus=(?),tipoHolograma=(?) WHERE Holograma=(?)");
stmt.setString(1, Estatus);
stmt.setString(2, tipoHolograma);
stmt.setString(3,Holograma);

    stmt.executeUpdate();
    
            //Inica el statement de la conexión
            Statement st = Conexion.createStatement();
   //     st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
    Conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos, verifique existencia"+ex);
        }            }
            
            else{//no se 
 JOptionPane.showMessageDialog(null, "NO existe el Holograma: " + Holograma, " por favor revise",JOptionPane.ERROR_MESSAGE);
 res.close();}
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, a);
        }
    }


//Saul Arenas Ramirez 12/07/2020
//para eliminar hologramas
public void EliminarHolograma(String Holograma){
    
            try{
PreparedStatement stmt;
            stmt = Conexion.prepareStatement("SELECT Holograma FROM TablaGasValid WHERE Holograma = '" + Holograma+ "'");
           java.sql.ResultSet res;
           
            res = stmt.executeQuery();

            if(res.next()){
//PreparedStatement stmt;
        try {
            stmt=Conexion.prepareStatement("DELETE FROM TablaGasValid WHERE Holograma = '" + Holograma+ "'");
                stmt.executeUpdate();

            
            JOptionPane.showMessageDialog(null, "El Holograma "+Holograma+" ha sido ELIMINADO exitosamente");
            
        } catch (SQLException ex) {
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
        } }
            
            else{//no se 
 JOptionPane.showMessageDialog(null, "No existe el Holograma: " + Holograma, " por favor revise",JOptionPane.ERROR_MESSAGE);
 res.close();}
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, a);
        }





}



    
}


/*




*/