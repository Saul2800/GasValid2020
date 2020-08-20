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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.sql.*;
import static java.util.Collections.list;
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
            //Como obtener la información desde un archivo properties
            String db_nam = "gasvalid";
            String use = "root";
            String pas ="ARENAS28";
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_nam, use, pas);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Conexion;
    }
    
/*  ----------------------------------------------------------------------------------
    Nombre: Clase MySQLConnection
    Función: Apertura La Conexión con la BD
    Aut@r: José Luis Caamal Ic
    Parametros: 
    ----------------------------------------------------------------------------------

    public void MySQLConnection(String user, String pass, String db_name) {
        db_name = "gasvalid";
        user = "root";
        pass="sakai";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
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
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
            return idAux;
        }
        return idAux;
    }    
    
    //Saul Arenas Ramirez 07/8/2020
    //insertar los hologramas en la tabla TablaGasValid
        public void insertarHologramas(String Holograma, String tipoHolograma) {
        try {
                PreparedStatement pps=Conexion.prepareStatement("INSERT INTO TablaGasValid(Holograma,tipoHolograma) VALUES (?,?) ");
                pps.setString(1,Holograma);//Eso estuvo bueno :v buena saúl.
                pps.setString(2, tipoHolograma);
    
                pps.executeUpdate();
    
                //Inica el statement de la conexión
                //Statement st = Conexion.createStatement();
                //     st.executeUpdate(Query);
                JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.toString());
            }
    
    return modeloRetorno;
}
    
    
/*  ----------------------------------------------------------------------------------
    Nombre: Clase ModificarHolograma
    Función: Modifica el holograma
    Date: 12/07/2020
    Aut@r: Saul Arenas
    Parametros: String Holograma,String Estatus,String tipoHolograma
    ----------------------------------------------------------------------------------
*/  
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
                                //Statement st = Conexion.createStatement();
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
            res.close();
                        }
            } catch(SQLException a){
                JOptionPane.showMessageDialog(null, a);
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
            }
    }


/*  ----------------------------------------------------------------------------------
    Nombre: Clase EliminarHolograma
    Función: se Elimina el holograma
    Date: 12/07/2020
    Aut@r: Saul Arenas
    Parametros: String Holograma
    ----------------------------------------------------------------------------------
*/  
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

            } 
            catch (SQLException ex){
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else{//no se 
                JOptionPane.showMessageDialog(null, "No existe el Holograma: " + Holograma, " por favor revise",JOptionPane.ERROR_MESSAGE);
                res.close();
            }
        } catch(SQLException a){
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
            JOptionPane.showMessageDialog(null, a);
        }

    }

    /*  ----------------------------------------------------------------------------------
    Nombre: Clase insertaEstaciones
    Función: Se inserta la información de las estaciones
    Date: 15/07/2020
    Aut@r: Jose Luis Caamal Ic
    Modify by Saul Arenas 17/07/2020
    (Valid the existence of the station)
    Parametros: 
    ----------------------------------------------------------------------------------
    */ 
    public void insertaEstaciones(String idEstacion,
            String fechaRegistro,
            String nombreResponsable,
            String razonSocial,
            String registroFedCausante,
            String domicilio,
            String colonia,
            String ciudad,
            String estado,
            String telefono,
            String correoElectronico,
            String coordenadasUTM,
            String codigoPostal,
            String numeroCRE,
            String marcaGasolina,
            int totalGasMagna,
            int totalGasDiesel,
            int totalGasPremium,
            String estatusManguera) {

        
    try{
        PreparedStatement stmt;
        stmt = Conexion.prepareStatement("SELECT idestacion FROM tabla_clientes WHERE idestacion = '" +idEstacion+ "'");
        java.sql.ResultSet res;
        res = stmt.executeQuery();

        if(res.next()){
       JOptionPane.showMessageDialog(null, "YA EXISTE la estacion: " + idEstacion, " ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                res.close();
        }
        else{//no se 
                  //PreparedStatement stmt;
            try {
               String Query = 
                "INSERT INTO tabla_clientes(idestacion,"
                        + "fecharegistro,"
                        + "nombre_responsable,"
                        + "razon_social,"
                        + "registro_fedcausante,"
                        + "domicilio,"
                        + "colonia,"
                        + "ciudad,"
                        + "estado,"
                        + "telefono,"
                        + "correo_electronico,"
                        + "coordenadasUTM,"
                        + "codigo_postal,"
                        + "numero_cre,"
                        + "marca_gasolina,"
                        + "mangueraMagna,"
                        + "mangueraPremium,"
                        + "mangueraDiesel,"
                        + "estatus_maguera) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pps = Conexion.prepareStatement(Query);
                pps.setString(1,idEstacion);
                pps.setString(2,fechaRegistro);
                pps.setString(3,nombreResponsable);
                pps.setString(4,razonSocial);
                pps.setString(5,registroFedCausante);
                pps.setString(6,domicilio);
                pps.setString(7,colonia);
                pps.setString(8,ciudad);
                pps.setString(9,estado);
                pps.setString(10,telefono);
                pps.setString(11,correoElectronico);
                pps.setString(12,coordenadasUTM);
                pps.setString(13,codigoPostal);
                pps.setString(14,numeroCRE);
                pps.setString(15,marcaGasolina);
                pps.setInt(16,totalGasMagna);
                pps.setInt(17,totalGasDiesel);
                pps.setInt(18,totalGasPremium);
                pps.setString(19,estatusManguera);
                pps.executeUpdate();
    
                //Inica el statement de la conexión
                Statement st = Conexion.createStatement();
                //     st.executeUpdate(Query);
                JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");} 
            catch (SQLException ex){
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos"+ex);
            }
            
            }
        } catch(SQLException a){
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
            JOptionPane.showMessageDialog(null, a);
        }
        
        
        
    }
            /*  ----------------------------------------------------------------------------------
            Nombre: Clase modeloGasValid
            Función: Se realiza la implementación del modelo par el llenado de tabla
            Date: 11/07/2020
            Aut@r: José Luis Caamal Ic
            Parametros: String columna[],String folioH,String statusH
            ----------------------------------------------------------------------------------
            */
            public DefaultTableModel modeloEstaciones(String columna[],String tipoHolograma,String folioH,String statusH){
            DefaultTableModel modeloRetorno;
            modeloRetorno = new DefaultTableModel(null, columna); 
            boolean validaFiltros = false; //Controla todos los filtros
                try{
                        String Query = "SELECT * FROM gasvalid.tabla_clientes";

                        if(!tipoHolograma.equals("")&& !validaFiltros)
                        {
                                Query = "SELECT * FROM gasvalid.tabla_clientes";
                                Query = Query + " WHERE marca_gasolina = '"+tipoHolograma+"' "; //Añado el filtro holograma
                                if(!statusH.equals("")){
                                Query = Query + " AND estatus_maguera = '"+statusH+"' "; //Añado el filtro status

                                }
                                if(!folioH.equals("")){
                                    Query = Query + "AND idestacion = '"+folioH+"' "; //Añado el filtro status
                                }
                                validaFiltros = true;

                        }
                        if(!folioH.equals("") && !validaFiltros){
                                Query = "SELECT * FROM gasvalid.tablagasvalid";
                                Query = Query + " WHERE idestacion = '"+folioH+"' "; //Añado el filtro holograma
                                if(!tipoHolograma.equals("")){
                                Query = Query + " AND marca_gasolina = '"+tipoHolograma+"' "; //Añado el filtro status

                                }
                                if(!statusH.equals("")){
                                Query = Query + " AND estatus_maguera = '"+statusH+"' "; //Añado el filtro status
                                }
                                validaFiltros = true;
                        }
                        if(!statusH.equals("") && !validaFiltros){
                                Query = "SELECT * FROM gasvalid.tablagasvalid";
                                Query = Query + " WHERE estatus_maguera = '"+statusH+"' "; //Añado el filtro status

                                if(!tipoHolograma.equals("")){
                                Query = Query + " AND marca_gasolina = '"+tipoHolograma+"' "; //Añado el filtro status

                                }
                                if(!folioH.equals("")){
                                    Query = Query + " AND idestacion = '"+folioH+"' "; //Añado el filtro status
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
                        Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println(ex.toString());
                    }

            return modeloRetorno;
        }
            
            /*  ----------------------------------------------------------------------------------
    Nombre: Clase eliminarEstacion
    Función: se Elimina el holograma
    Date: 17/07/2020
    Aut@r: Saul Arenas
    Parametros: String estacion
    ----------------------------------------------------------------------------------
*/  
            
    public int eliminarEstacion( String estacion) {
        try{
                        PreparedStatement stmt;
                        stmt = Conexion.prepareStatement("SELECT idestacion FROM tabla_clientes WHERE idestacion = '" + estacion+ "'");
                        java.sql.ResultSet res;
                        res = stmt.executeQuery();

               if(res.next()){
                   //PreparedStatement stmt;
                   try {
                        String Query = "DELETE FROM tabla_clientes WHERE idestacion = \"" + estacion + "\"";
                        System.out.println("SQL Elimina: "+Query);
                        Statement st = Conexion.createStatement();
                        st.executeUpdate(Query);
                        JOptionPane.showMessageDialog(null, "La estacion "+estacion+" se ELIMINO correctamente");

                   } 
                    catch (SQLException ex){
                    System.out.println(ex.getMessage());
                    Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Error borrando la estacion especificada");return 0;            } 
                }
                else{//no se 
                        JOptionPane.showMessageDialog(null, "NO EXISTE la estacion: " + estacion, "ATENCION",JOptionPane.ERROR_MESSAGE);
                        res.close();
                    }
                } catch(SQLException a){
                    Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
                    JOptionPane.showMessageDialog(null, a);
                }                   
                return 1;
           }
            
               
                           /*  ----------------------------------------------------------------------------------
    Nombre: Clase modificarEstacion
    Función: se modifica la estacion
    Date: 17/07/2020
    Aut@r: Saul Arenas
    Parametros: String estacion,
            String fechaRegistro,
            String nombreResponsable,
            String razonSocial,
            String registroFedCausante,
            String domicilio,
            String colonia,
            String ciudad,
            String estado,
            String telefono,
            String correoElectronico,
            String coordenadasUTM,
            String codigoPostal,
            String numeroCRE,
            String marcaGasolina,
            int totalGasMagna,
            int totalGasDiesel,
            int totalGasPremium,
            String estatusManguera
    ----------------------------------------------------------------------------------
*/  
               
               
               
        public void modificarEstaciones(String idEstacion,
            String fechaRegistro,
            String nombreResponsable,
            String razonSocial,
            String registroFedCausante,
            String domicilio,
            String colonia,
            String ciudad,
            String estado,
            String telefono,
            String correoElectronico,
            String coordenadasUTM,
            String codigoPostal,
            String numeroCRE,
            String marcaGasolina,
            int totalGasMagna,
            int totalGasDiesel,
            int totalGasPremium,
            String estatusManguera) {

        
    try{
        PreparedStatement stmt;
        stmt = Conexion.prepareStatement("SELECT idestacion FROM tabla_clientes WHERE idestacion = '" +idEstacion+ "'");
        java.sql.ResultSet res;
        res = stmt.executeQuery();

        if(res.next()){
                        
                  //PreparedStatement stmt;
            try {
               String Query =  "UPDATE tabla_clientes SET fecharegistro='"+fechaRegistro+"',nombre_responsable='"+nombreResponsable+"',razon_social='"+razonSocial+"',registro_fedcausante='"+registroFedCausante+"',domicilio='"+domicilio+"',colonia='"+colonia+"',ciudad='"+ciudad+"',estado='"+estado+"',telefono='"+telefono+"',correo_electronico='"+correoElectronico+"',coordenadasUTM='"+coordenadasUTM+"',codigo_postal='"+codigoPostal+"',numero_cre='"+numeroCRE+"',marca_gasolina='"+marcaGasolina+"',mangueraMagna='"+totalGasMagna+"',mangueraPremium='"+totalGasPremium+"',mangueraDiesel='"+totalGasDiesel+"',estatus_maguera='"+estatusManguera+"' WHERE idestacion = '" +idEstacion+ "'";

               PreparedStatement pps = Conexion.prepareStatement(Query);
               pps.executeUpdate();
    
                //Inica el statement de la conexión
                Statement st = Conexion.createStatement();
                //     st.executeUpdate(Query);
                JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");} 
            catch (SQLException ex){
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos"+ex);
            }          }
        else{//no se 
               JOptionPane.showMessageDialog(null, "No EXISTE la estacion: " + idEstacion, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
                res.close();
            }
        } catch(SQLException a){
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
            JOptionPane.showMessageDialog(null, a);
        }
        
        
        
    }
               
               
               
               
               
               
        /*
        Caamal Ic Jose Luis
        Obtiene los campos de la tabla clientes para poder modificar
        valida que el campo estacion exista
        Since 20/07/2020
        */
        public int obtenerEstaciones(String idEstacion) 
                {
                int aux = 0;
        
                try{
                    PreparedStatement stmt;
                    stmt = Conexion.prepareStatement("SELECT count(*) as idestacion FROM tabla_clientes WHERE idestacion = '" +idEstacion+ "'");
                    java.sql.ResultSet res;
                    res = stmt.executeQuery();

                    if(res.next()){
                            //JOptionPane.showMessageDialog(null, "Si existe la estacion: " + idEstacion, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
                            aux = res.getInt("idestacion");
                            return aux;
                    }
                    else{//no se 
                            //JOptionPane.showMessageDialog(null, "No existe la estacion: " + idEstacion, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
                            res.close();
                            return aux;
                    }
                    
                } catch(SQLException a){
                    
                    Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
                    JOptionPane.showMessageDialog(null, a);
                    aux = 0;
                }
        
        return aux;
        
    }           
    
     public Object[] obtenerArrEstaciones(String idEstacion) 
                {
                Object [] arrObjetos = null;
                try{
                    PreparedStatement stmt;
                    stmt = Conexion.prepareStatement("SELECT * FROM tabla_clientes WHERE idestacion = '" +idEstacion+ "'");
                    System.out.println("SELECT * FROM tabla_clientes WHERE idestacion = '" +idEstacion+ "'");
                    java.sql.ResultSet res;
                    res = stmt.executeQuery();
                    ResultSetMetaData metaDatos = res.getMetaData();
                        // Se obtiene el número de columnas.
                        int numeroColumnas = metaDatos.getColumnCount();
                        // Se crea un array de etiquetas para rellenar
                        arrObjetos =new Object[numeroColumnas];
                        
                        while (res.next())
                        {
                            for (int i=0;i<numeroColumnas;i++)
                            {
                                arrObjetos[i]=res.getObject(i+1);
                            }
                            

                        }
                    
                    
                } catch(SQLException a){
                    
                    Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
                    JOptionPane.showMessageDialog(null, a);
                    arrObjetos = null;
                }
        
        return arrObjetos;
        
    }
     
    /*  ----------------------------------------------------------------------------------
    Nombre: Clase modeloDispensarios
    Función: Se realiza la implementación del modelo par el llenado de tabla
    Date: 22/07/2020
    Aut@r: José Luis Caamal Ic
    Parametros: String columna[],String folioH,String statusH
    ----------------------------------------------------------------------------------
    */
    public DefaultTableModel modeloDispensarios(String columna[],String folioDispensariob,String folioEstacionb,String marcaGas){
    DefaultTableModel modeloRetorno; //folioDispensariob, folioEstacionb,marcaGas
    modeloRetorno = new DefaultTableModel(null, columna); 
    boolean validaFiltros = false; //Controla todos los filtros
        try{
                String Query = "SELECT * FROM gasvalid.tabla_dispensarios";

                if(!folioDispensariob.equals("")&& !validaFiltros)
                {
                        Query = "SELECT * FROM gasvalid.tabla_dispensarios";
                        Query = Query + " WHERE no_dispensario = '"+folioDispensariob+"' "; //Añado el filtro holograma
                        if(!marcaGas.equals("")){
                        Query = Query + " AND marca_dispensario = '"+marcaGas+"' "; //Añado el filtro status

                        }
                        if(!folioEstacionb.equals("")){
                            Query = Query + "AND numero_estacion = '"+folioEstacionb+"' "; //Añado el filtro status
                        }
                        validaFiltros = true;

                }
                if(!folioEstacionb.equals("") && !validaFiltros){
                        Query = "SELECT * FROM gasvalid.tabla_dispensarios";
                        Query = Query + " WHERE numero_estacion = '"+folioEstacionb+"' "; //Añado el filtro holograma
                        if(!folioDispensariob.equals("")){
                        Query = Query + " AND no_dispensario = '"+folioDispensariob+"' "; //Añado el filtro status

                        }
                        if(!marcaGas.equals("")){
                        Query = Query + " AND marca_dispensario = '"+marcaGas+"' "; //Añado el filtro status
                        }
                        validaFiltros = true;
                }
                if(!marcaGas.equals("") && !validaFiltros){
                        Query = "SELECT * FROM gasvalid.tabla_dispensarios";
                        Query = Query + " WHERE marca_dispensario = '"+marcaGas+"' "; //Añado el filtro status

                        if(!folioDispensariob.equals("")){
                        Query = Query + " AND no_dispensario = '"+folioDispensariob+"' "; //Añado el filtro status

                        }
                        if(!folioEstacionb.equals("")){
                            Query = Query + " AND numero_estacion = '"+folioEstacionb+"' "; //Añado el filtro status
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
                        //System.out.println(objDatos[i]);
                    }
                    modeloRetorno.addRow(objDatos);
                }
            }
            catch(SQLException ex){
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.toString());
            }
    
    return modeloRetorno;
    }
    
    /*
        Caamal Ic Jose Luis
        Nombre obtenerEstacion();
        Obtiene el campo estación.
        Since 22/07/2020
        Parametros idEstacion
        Actualmente no se usa
        */
        public Object[] obtenerDatosEstacion(String idEstacion) 
                {
                Object[] auxObject = null;
        
                try{
                    PreparedStatement stmt;
                    stmt = Conexion.prepareStatement("SELECT idestacion FROM tabla_clientes WHERE idestacion = '" +idEstacion+ "'");
                    java.sql.ResultSet res;
                    res = stmt.executeQuery();

                    if(res.next()){
                            //JOptionPane.showMessageDialog(null, "Si existe la estacion: " + idEstacion, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
                           // auxObject = res.getObject("idestacion");
                            return auxObject;
                    }
                    else{//no se 
                            //JOptionPane.showMessageDialog(null, "No existe la estacion: " + idEstacion, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
                            res.close();
                            return auxObject;
                    }
                    
                } catch(SQLException a){
                    
                    Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
                    JOptionPane.showMessageDialog(null, a);
                    auxObject = null;
                }
        
        return auxObject;
        
    }
        
        
    /*
        Caamal Ic Jose Luis
        Obtiene el numero actual de dispensarios, por estación
        valida que el campo estacion exista en la tabla dispensarios
        y cuenta el numero de registros y obtiene el valor actual y le aumenta + 1,
        si no exista lo añade.
        Since 20/07/2020
        */
        public int obtenerDispensario(String idEstacion) 
                {
                int aux = 0;
        
                try{
                    String Query = "SELECT count(*) as idDispensario FROM tabla_dispensarios WHERE numero_estacion = '"+idEstacion+"'";
                    System.out.println(Query);
                    PreparedStatement stmt;
                    stmt = Conexion.prepareStatement(Query);
                    java.sql.ResultSet res;
                    res = stmt.executeQuery();
                    

                    if(res.next()){
                            //JOptionPane.showMessageDialog(null, "Si existe la estacion: " + idEstacion, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
                            aux = res.getInt("idDispensario");
                            
                            aux = aux + 1; //Aumento si la consulta me arroja cero y solo si existe el numero de estación
                            //Se cambia para aumentar por codigo
                            return aux;
                    }
                    else{//no se 
                            //JOptionPane.showMessageDialog(null, "No existe la estacion: " + idEstacion, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
//                          if(aux==0)
//                                aux = aux + 1;
                            res.close();
                            return aux;
                    }
                    
                } catch(SQLException a){
                    
                    Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
                    JOptionPane.showMessageDialog(null, a);
                    aux = 0;
                }
        
        return aux;
        
    }
    
        //Jose Luis Caamal Ic 23/07/2020
        //insertar los dipensarios en la tabla_dispensarios
        public void insertaDispensarios(String campoDispensario,
        String campoEstacion,
        String campoMDispensario,
        String campoModeloD,
        String campoSerieD,
        String campoAlcanceMin,
        String campoAprobacion,
        String campoAlcanceMax,
        String campoMA,
        String campoMB,
        String campoMC,
        String campoMD,
        String campoME,
        String campoMF,
        String fechaRegistroD) {
        try {
                String idDispAux = "default";
                PreparedStatement pps=Conexion.prepareStatement("INSERT INTO "
                        + "tabla_dispensarios(id_dispensario,"
                        + "no_dispensario,"
                        + "numero_estacion,"
                        + "marca_dispensario,"
                        + "modelo,"
                        + "numSerie,"
                        + "alcanceMin,"
                        + "aprobacionDGN,"
                        + "alcanceMax,"
                        + "mangueraA,"
                        + "mangueraB,"
                        + "mangueraC,"
                        + "mangueraD,"
                        + "mangueraE,"
                        + "mangueraF,"
                        + "fecha_reg_disp) "
                        + "VALUES (default,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
                //pps.setString(1,idDispAux);//Eso estuvo bueno :v buena saúl.
                pps.setString(1,campoDispensario);
                pps.setString(2, campoEstacion);
                pps.setString(3, campoMDispensario);
                pps.setString(4, campoModeloD);
                pps.setString(5, campoSerieD);
                pps.setString(6, campoAlcanceMin);
                pps.setString(7, campoAprobacion);
                pps.setString(8, campoAlcanceMax);
                pps.setString(9, campoMA);
                pps.setString(10, campoMB);
                pps.setString(11, campoMC);
                pps.setString(12, campoMD);
                pps.setString(13, campoME);
                pps.setString(14, campoMF);
                pps.setString(15, fechaRegistroD);
                System.out.println(pps.toString());
                pps.executeUpdate();
    
                //JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
                System.out.println("Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                //JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos"+ex);
                System.out.println("Error en el almacenamiento de datos"+ex);
        }
    }
    //Jose Luis Caamal Ic 23/07/2020
    //Obtiene el numero de dispensarios de la estación    
    public List <Object> obtenerNoDispensarios(String idEstacion) 
                {
                List <Object> listaAux = new ArrayList<Object>();
                try{
                    String Query = "SELECT no_dispensario FROM tabla_dispensarios WHERE numero_estacion = '"+idEstacion+"'";
                    System.out.println(Query);
                    PreparedStatement stmt;
                    stmt = Conexion.prepareStatement(Query);
                    java.sql.ResultSet res;
                    res = stmt.executeQuery();
                     
                    while (res.next())
                    {
                        listaAux.add(res.getObject("no_dispensario"));
                    }
                    
                    
                } catch(SQLException a){
                    
                    Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
                    JOptionPane.showMessageDialog(null, a);
                    listaAux = null;
                }
        
        return listaAux;
        
    }
    
        /*
            Caamal Ic Jose Luis
            Valida que existanDispensarios
            si no exista lo añade.
            Since 20/07/2020
        */
        public int validaDispensario(String idEstacion) 
                {
                int aux = 0;
        
                try{
                    String Query = "SELECT count(*) as idDispensario FROM tabla_clientes WHERE idestacion = '"+idEstacion+"'";
                    System.out.println(Query);
                    PreparedStatement stmt;
                    stmt = Conexion.prepareStatement(Query);
                    java.sql.ResultSet res;
                    res = stmt.executeQuery();
                    

                    if(res.next()){
                            //JOptionPane.showMessageDialog(null, "Si existe la estacion: " + idEstacion, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
                            aux = res.getInt("idDispensario");
                            //if(aux)
                            //aux = aux + 1; //Aumento si la consulta me arroja cero y solo si existe el numero de estación
                            //Se cambia para aumentar por codigo
                            return aux;
                    }
                    else{//no se 
                            //JOptionPane.showMessageDialog(null, "No existe la estacion: " + idEstacion, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
//                          if(aux==0)
//                                aux = aux + 1;
                            res.close();
                            return aux;
                    }
                    
                } catch(SQLException a){
                    
                    Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
                    JOptionPane.showMessageDialog(null, a);
                    aux = 0;
                }
        
        return aux;
        
    }
    /*
            Caamal Ic Jose Luis
            Obtiene toda la información del Numero de dispensario seleccionado :)
            si no exista lo añade.
            Since 20/07/2020
    */
     public Object[] obtenerArrDispensarios(String idEstacion,String idDispensario) 
                {
                Object [] arrObjetos = null;
                try{
                    String Query = "SELECT * FROM tabla_dispensarios WHERE numero_estacion = '" +idEstacion+ "' AND no_dispensario = '" +idDispensario+ "';";
                    PreparedStatement stmt;
                    stmt = Conexion.prepareStatement(Query);
                    System.out.println(Query);
                    java.sql.ResultSet res;
                    res = stmt.executeQuery();
                    ResultSetMetaData metaDatos = res.getMetaData();
                        // Se obtiene el número de columnas.
                        int numeroColumnas = metaDatos.getColumnCount();
                        // Se crea un array de etiquetas para rellenar
                        arrObjetos =new Object[numeroColumnas];
                        
                        while (res.next())
                        {
                            for (int i=0;i<numeroColumnas;i++)
                            {
                                arrObjetos[i]=res.getObject(i+1);
                            }
                            

                        }
                    
                    
                } catch(SQLException a){
                    
                    Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
                    JOptionPane.showMessageDialog(null, a);
                    arrObjetos = null;
                }
        
        return arrObjetos;
        
    }
     
    //Jose Luis Caamal Ic 
    //23/07/2020
    //actualiza los dipensarios en la tabla_dispensarios
    public void actualizaDispensarios(String campoDispensario,
        String campoEstacion,
        String campoMDispensario,
        String campoModeloD,
        String campoSerieD,
        String campoAlcanceMin,
        String campoAprobacion,
        String campoAlcanceMax,
        String campoMA,
        String campoMB,
        String campoMC,
        String campoMD,
        String campoME,
        String campoMF,
        String fechaRegistroD) {
        try {
                String idDispAux = "default";
                PreparedStatement pps=Conexion.prepareStatement("UPDATE "
                        + "tabla_dispensarios "
                        + "SET "
                        //+ "no_dispensario = ?,"
                        //+ "numero_estacion = ?,"
                        + "marca_dispensario = ?,"
                        + "modelo = ?,"
                        + "numSerie = ?,"
                        + "alcanceMin = ?,"
                        + "aprobacionDGN = ?,"
                        + "alcanceMax = ?,"
                        + "mangueraA = ?,"
                        + "mangueraB = ?,"
                        + "mangueraC = ?,"
                        + "mangueraD = ?,"
                        + "mangueraE = ?,"
                        + "mangueraF = ?,"
                        + "fecha_reg_disp = ?"
                        + "WHERE numero_estacion = '" +campoEstacion+ "' AND no_dispensario = '" +campoDispensario+ "';");
                //pps.setString(1,idDispAux);//Eso estuvo bueno :v buena saúl.
                //pps.setString(2,campoDispensario);
                //pps.setString(3, campoEstacion);
                pps.setString(1, campoMDispensario);
                pps.setString(2, campoModeloD);
                pps.setString(3, campoSerieD);
                pps.setString(4, campoAlcanceMin);
                pps.setString(5, campoAprobacion);
                pps.setString(6, campoAlcanceMax);
                pps.setString(7, campoMA);
                pps.setString(8, campoMB);
                pps.setString(9, campoMC);
                pps.setString(10, campoMD);
                pps.setString(11, campoME);
                pps.setString(12, campoMF);
                pps.setString(13, fechaRegistroD);
                System.out.println(pps.toString());
                pps.executeUpdate();
    
                //JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
                System.out.println("Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                //JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos"+ex);
                System.out.println("Error en el almacenamiento de datos"+ex);
        }
    }
    
    
    
        //Saul Arenas Ramirez: JL
    //25/07/2020
    //Rellena los campos de registroSolicitudContrato
       public Object[] obtenerdatosparasolicitud(String idestacion) 
                {
                Object [] arrObjetos = null;
                try{
                    PreparedStatement stmt;
                    stmt = Conexion.prepareStatement("SELECT * FROM tabla_clientes WHERE idestacion = '" +idestacion+ "'");
                    System.out.println("SELECT * FROM tabla_clientes WHERE idestacion = '" +idestacion+ "'");
                    java.sql.ResultSet res;
                    res = stmt.executeQuery();
                    ResultSetMetaData metaDatos = res.getMetaData();
                        // Se obtiene el número de columnas.
                        int numeroColumnas = metaDatos.getColumnCount();
                        // Se crea un array de etiquetas para rellenar
                        arrObjetos =new Object[numeroColumnas];
                        
                        while (res.next())
                        {
                            for (int i=0;i<numeroColumnas;i++)
                            {
                                arrObjetos[i]=res.getObject(i+1);
                            }
                            

                        }
                    
                    
                } catch(SQLException a){
                    
                    Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
                    JOptionPane.showMessageDialog(null, a);
                    arrObjetos = null;
                }
        
        return arrObjetos;
        
    }
            //Saul Arenas Ramirez
    //25/07/2020
    //Ingresa los datos de registroSolicitudContrato en la tabla_registro_solicitud
       
       public void subirDatosSolicitud(String Foliodesolicitud,String Usuario,String Tecnico, String Fecha,String FechaPropuesta, String Tipodesolicitud,String idestacion, String total_mangueras, String  ReferenciadeSolicitud,String Observaciones){
         try {
                PreparedStatement pps=Conexion.prepareStatement("INSERT INTO tabla_registro_solicitud (folio_solicitud,nombre_usuario,nombre_tecnico,fecha,fecha_propuesta,tipo_solicitud,idestacion,total_mangueras,referencia,observaciones) VALUES (?,?,?,?,?,?,?,?,?,?) ");
                pps.setString(1,Foliodesolicitud);
                pps.setString(2, Usuario);
               pps.setString(3, Tecnico);
                pps.setString(4, Fecha);
                pps.setString(5, FechaPropuesta);
                pps.setString(6, Tipodesolicitud);
                pps.setString(7, idestacion);
                pps.setString(8,total_mangueras);
                pps.setString(9, ReferenciadeSolicitud);
                pps.setString(10,Observaciones);
           //     pps.setString(7, valida_contrato);

    
                pps.executeUpdate();
    
                //Inica el statement de la conexión
                //Statement st = Conexion.createStatement();
                //     st.executeUpdate(Query);
                JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos"+ex);
        }
       
       }
       
       public void modificarDatosSolicitud(String Foliodesolicitud,String Usuario,String Tecnico, String Fecha,String FechaPropuesta, String Tipodesolicitud,String idestacion,String total_mangueras,  String  ReferenciadeSolicitud,String Observaciones){
       try{
      PreparedStatement stmt;
        stmt = Conexion.prepareStatement("SELECT folio_solicitud FROM tabla_registro_solicitud WHERE folio_solicitud = '" +Foliodesolicitud+ "'");
        java.sql.ResultSet res2;
        res2 = stmt.executeQuery();
        if(res2.next()){       
            
        stmt = Conexion.prepareStatement("SELECT idestacion FROM tabla_clientes WHERE idestacion = '" +idestacion+ "'");
        java.sql.ResultSet res;
        res = stmt.executeQuery();

        if(res.next()){
                        
                  //PreparedStatement stmt;
            try {
               String Query =  "UPDATE tabla_registro_solicitud SET nombre_usuario='"+Usuario+"',nombre_tecnico='"+Tecnico+"',fecha='"+Fecha+"',fecha_propuesta='"+FechaPropuesta+"',tipo_solicitud='"+Tipodesolicitud+"',idestacion='"+idestacion+"',total_mangueras='"+total_mangueras+"',referencia='"+ReferenciadeSolicitud+"',observaciones='"+Observaciones+"'WHERE folio_solicitud= '" +Foliodesolicitud+ "'";

               PreparedStatement pps = Conexion.prepareStatement(Query);
               pps.executeUpdate();
    
                //Inica el statement de la conexión
                Statement st = Conexion.createStatement();
                //     st.executeUpdate(Query);
                JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");} 
            catch (SQLException ex){
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos"+ex);
            }          }
        else{//no se 
               JOptionPane.showMessageDialog(null, "No EXISTE la estacion: " + idestacion, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
                res.close();
            }}    
        else{JOptionPane.showMessageDialog(null, "No EXISTE el folio: " + Foliodesolicitud, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
                res2.close();}
       }catch(SQLException ex){Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos"+ex);}
       
       }
       
       
     /*  ----------------------------------------------------------------------------------
    Nombre: Clase modeloSolicitud
    Función: Se realiza la implementación del modelo par el llenado de tabla del catalogo de solicitud
    Date: 27/07/2020
    Aut@r: Saul Arenas Ramirez ,JL
   
    ----------------------------------------------------------------------------------
    */
    public DefaultTableModel modeloSolicitudtabla(String columna[],String folio_solicitud,String  tipoSolicitud,String  noEstacion){
    DefaultTableModel modeloRetorno;
    modeloRetorno = new DefaultTableModel(null, columna); 
    boolean validaFiltros = false; //Controla todos los filtros
        try{
                String Query = "SELECT * FROM gasvalid.tabla_registro_solicitud";

                if(!folio_solicitud.equals("")&& !validaFiltros)
                {
                        Query = "SELECT * FROM gasvalid.tabla_registro_solicitud";
                        Query = Query + " WHERE folio_solicitud = '"+folio_solicitud+"' "; //Añado el filtro folio
                        if(!noEstacion.equals("")){
                        Query = Query + " AND idestacion = '"+noEstacion+"' "; //Añado el filtro No.Estacion

                        }
                        if(!tipoSolicitud.equals("")){
                            Query = Query + "AND tipo_solicitud = '"+tipoSolicitud+"' "; //Añado el filtro tipo solicitud
                        }
                        validaFiltros = true;

                }
                if(!tipoSolicitud.equals("") && !validaFiltros){
                        Query = "SELECT * FROM gasvalid.tabla_registro_solicitud";
                        Query = Query + " WHERE tipo_solicitud = '"+tipoSolicitud+"' "; //Añado el filtro tipo solicitud
                        if(!folio_solicitud.equals("")){
                        Query = Query + " AND folio_solicitud = '"+folio_solicitud+"' "; //Añado el filtro folio Solicitud

                        }
                        if(!noEstacion.equals("")){
                        Query = Query + " AND idestacion = '"+noEstacion+"' "; //Añado el filtro No.Estacion
                        }
                        validaFiltros = true;
                }
                if(!noEstacion.equals("") && !validaFiltros){
                        Query = "SELECT * FROM gasvalid.tabla_registro_solicitud";
                        Query = Query + " WHERE idestacion = '"+noEstacion+"' "; //Añado el filtro No.Estacion

                        if(!folio_solicitud.equals("")){
                        Query = Query + " AND folio_solicitud = '"+folio_solicitud+"' "; //Añado el filtro folio Solicitud

                        }
                        if(!tipoSolicitud.equals("")){
                            Query = Query + " AND tipo_solicitud = '"+tipoSolicitud+"' "; //Añado el filtro tipo solicitud
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
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.toString());
            }
    
    return modeloRetorno;
}

/*
    Caamal Ic Jose Luis
    Valida que exista el FolioSolicitud
    si no exista lo añade.
    Since 20/07/2020
*/
        public int validaFolioSolicitud(String idFolio) 
                {
                int aux = 0;
        
                try{
                    String Query = "SELECT count(*) as idFolio FROM tabla_registro_solicitud WHERE folio_solicitud = '"+idFolio+"'";
                    System.out.println(Query);
                    PreparedStatement stmt;
                    stmt = Conexion.prepareStatement(Query);
                    java.sql.ResultSet res;
                    res = stmt.executeQuery();
                    

                    if(res.next()){
                            //JOptionPane.showMessageDialog(null, "Si existe la estacion: " + idEstacion, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
                            aux = res.getInt("idFolio");
                            //if(aux)
                            //aux = aux + 1; //Aumento si la consulta me arroja cero y solo si existe el numero de estación
                            //Se cambia para aumentar por codigo
                            return aux;
                    }
                    else{//no se 
                            //JOptionPane.showMessageDialog(null, "No existe la estacion: " + idEstacion, "ATENCIÓN",JOptionPane.ERROR_MESSAGE);
//                          if(aux==0)
//                                aux = aux + 1;
                            res.close();
                            return aux;
                    }
                    
                } catch(SQLException a){
                    
                    Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
                    JOptionPane.showMessageDialog(null, a);
                    aux = 0;
                }
        
        return aux;
        
    }
     /*
            obtenerDatosSolicitud
            Caamal Ic Jose Luis
            Obtiene toda la información del los datos de solicitud y del cliente;
            si no exista lo añade.
            Since 06/08/2020
    */
     public Object[] obtenerDatosSolicitud(String idFolio) 
                {
                Object [] arrObjetos = null;
                try{
                    //String Query = "SELECT * FROM tabla_dispensarios WHERE numero_estacion = '" +idEstacion+ "' AND no_dispensario = '" +idDispensario+ "';";
                    String Query = "SELECT tblreg.folio_solicitud, UPPER(tblreg.nombre_usuario) as nombre_usuario,tblclie.razon_social,tblclie.nombre_responsable, tblclie.ciudad, tblclie.estado,tblreg.fecha_propuesta,UPPER(tblreg.nombre_usuario) as nombre_usuario,UPPER(tblreg.nombre_tecnico) as nombre_tecnico "
                            + "FROM tabla_registro_solicitud tblreg, tabla_clientes tblclie\n" +
                               "WHERE  tblreg.idestacion = tblclie.idestacion and folio_solicitud = '"+idFolio+"'";
                    PreparedStatement stmt;
                    stmt = Conexion.prepareStatement(Query);
                    System.out.println(Query);
                    java.sql.ResultSet res;
                    res = stmt.executeQuery();
                    ResultSetMetaData metaDatos = res.getMetaData();
                        // Se obtiene el número de columnas.
                        int numeroColumnas = metaDatos.getColumnCount();
                        // Se crea un array de etiquetas para rellenar
                        arrObjetos =new Object[numeroColumnas];
                        
                        while (res.next())
                        {
                            for (int i=0;i<numeroColumnas;i++)
                            {
                                arrObjetos[i]=res.getObject(i+1);
                            }
                            

                        }
                    
                    
                } catch(SQLException a){
                    
                    Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
                    JOptionPane.showMessageDialog(null, a);
                    arrObjetos = null;
                }
        
        return arrObjetos;
        
    }   
       
     /*  ----------------------------------------------------------------------------------
    Aut@r: Saul Arenas Ramirez
     18/08/20
    ----------------------------------------------------------------------------------
*/
     public void  agregarTermometro(String id_Termo,String marca, String  modelo, String serie,String estatus, String fecha_calibracion, String resultado,String informe_calibracion){
         try {
                PreparedStatement pps=Conexion.prepareStatement("INSERT INTO tabla_termometros (id_Termo,marca,modelo,serie,estatus,fecha_calibracion,resultado,informe_calibracion) VALUES (?,?,?,?,?,?,?,?) ");
                pps.setString(1,id_Termo);
                pps.setString(2, marca);
               pps.setString(3, modelo);
                pps.setString(4, serie);
                pps.setString(5, estatus);
                pps.setString(6, fecha_calibracion);
                pps.setString(7, resultado);
                pps.setString(8,informe_calibracion);

                pps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos"+ex);
        }}
     
     
     public void modificarTermometro(String id_Termo,String marca, String  modelo, String serie,String estatus, String fecha_calibracion, String resultado,String informe_calibracion){
      try{
            PreparedStatement stmt;
                        stmt = Conexion.prepareStatement("SELECT id_Termo FROM tabla_termometros WHERE id_Termo = '" + id_Termo+ "'");
                       java.sql.ResultSet res;

                        res = stmt.executeQuery();

                        if(res.next()){
                    //se encontro
                     try{

                    //PreparedStatement stmt  ;
                    stmt=Conexion.prepareStatement("UPDATE tabla_termometros SET marca=(?),modelo=(?),serie=(?),estatus=(?),fecha_calibracion=(?),resultado=(?),informe_calibracion=(?) WHERE id_Termo=(?)");
                    stmt.setString(1, marca);
                    stmt.setString(2, modelo);
                     stmt.setString(3, serie);
                    stmt.setString(4, estatus);
                    stmt.setString(5, fecha_calibracion);
                    stmt.setString(6, resultado);
                    stmt.setString(7, informe_calibracion);
                    stmt.setString(8,id_Termo);

                        stmt.executeUpdate();

                                //Inica el statement de la conexión
                                //Statement st = Conexion.createStatement();
                       //     st.executeUpdate(Query);
                                JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa.");
                        Conexion.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                               System.out.println(ex.getMessage());
                                JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos."+ex);
                            }            }

            else{//no se 
            JOptionPane.showMessageDialog(null, "NO existe el Termometro: " + id_Termo, " por favor revise",JOptionPane.ERROR_MESSAGE);
            res.close();
                        }
            } catch(SQLException a){
                JOptionPane.showMessageDialog(null, a);
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
            }
     }
     
     
     public void eliminarTermometro(String id_Termo){
         try{
        PreparedStatement stmt;
        stmt = Conexion.prepareStatement("SELECT id_Termo FROM tabla_termometros WHERE id_Termo = '" + id_Termo+ "'");
        java.sql.ResultSet res;
        res = stmt.executeQuery();

        if(res.next()){
            //PreparedStatement stmt;
            try {
                stmt=Conexion.prepareStatement("DELETE FROM tabla_termometros WHERE id_Termo = '" + id_Termo+ "'");
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "El Termometro "+id_Termo+" ha sido ELIMINADO exitosamente");

            } 
            catch (SQLException ex){
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else{//no se 
                JOptionPane.showMessageDialog(null, "No existe el Termometro: " + id_Termo, " por favor revise",JOptionPane.ERROR_MESSAGE);
                res.close();
            }
        } catch(SQLException a){
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
            JOptionPane.showMessageDialog(null, a);
        }
         
     
     }
     
     
     
       /*  ----------------------------------------------------------------------------------
    Nombre: Clase modeloTemometros
    Función: Se realiza la implementación del modelo par el llenado de tabla
    Date: 19/08/2020
    Aut@r: Saul Arenas Ramirez
    Parametros: String columna[]
    ----------------------------------------------------------------------------------
    */
    public DefaultTableModel modeloTermometros(String columna[]){
    DefaultTableModel modeloRetorno;
    modeloRetorno = new DefaultTableModel(null, columna); 
        try{
                String Query = "SELECT * FROM gasvalid.tabla_termometros";

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
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.toString());
            }
    
    return modeloRetorno;
}
     
    
      /*  ----------------------------------------------------------------------------------
    agregarCronometros
    Aut@r: Saul Arenas Ramirez
     19/08/20
    ----------------------------------------------------------------------------------
*/
     public void  agregarCronometros(String id_Crono,String marca, String  modelo, String serie,String estatus, String fecha_calibracion, String resultado,String informe_calibracion){
         try {
                PreparedStatement pps=Conexion.prepareStatement("INSERT INTO tabla_cronometros (id_Crono,marca,modelo,serie,estatus,fecha_calibracion,resultado,informe_calibracion) VALUES (?,?,?,?,?,?,?,?) ");
                pps.setString(1,id_Crono);
                pps.setString(2, marca);
               pps.setString(3, modelo);
                pps.setString(4, serie);
                pps.setString(5, estatus);
                pps.setString(6, fecha_calibracion);
                pps.setString(7, resultado);
                pps.setString(8,informe_calibracion);

                pps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos"+ex);
        }}
     
      /*  ----------------------------------------------------------------------------------
    Nombre: Clase modeloTemometros
    Función: Se realiza la implementación del modelo par el llenado de tabla
    Date: 19/08/2020
    Aut@r: Saul Arenas Ramirez
    Parametros: String columna[]
    ----------------------------------------------------------------------------------
    */
    public DefaultTableModel modeloCronometros(String columna[]){
    DefaultTableModel modeloRetorno;
    modeloRetorno = new DefaultTableModel(null, columna); 
        try{
                String Query = "SELECT * FROM gasvalid.tabla_cronometros";

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
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.toString());
            }
    
    return modeloRetorno;
}
    
    
    
    /*  ----------------------------------------------------------------------------------
    Aut@r: Saul Arenas Ramirez
     18/08/20
    ----------------------------------------------------------------------------------
*/
    
    public void editarCronometro(String id_Crono,String marca, String  modelo, String serie,String estatus, String fecha_calibracion, String resultado,String informe_calibracion){
      try{
            PreparedStatement stmt;
                        stmt = Conexion.prepareStatement("SELECT id_Crono FROM tabla_cronometros WHERE id_Crono = '" + id_Crono+ "'");
                       java.sql.ResultSet res;

                        res = stmt.executeQuery();

                        if(res.next()){
                    //se encontro
                     try{

                    //PreparedStatement stmt  ;
                    stmt=Conexion.prepareStatement("UPDATE tabla_cronometros SET marca=(?),modelo=(?),serie=(?),estatus=(?),fecha_calibracion=(?),resultado=(?),informe_calibracion=(?) WHERE id_Crono=(?)");
                    stmt.setString(1, marca);
                    stmt.setString(2, modelo);
                     stmt.setString(3, serie);
                    stmt.setString(4, estatus);
                    stmt.setString(5, fecha_calibracion);
                    stmt.setString(6, resultado);
                    stmt.setString(7, informe_calibracion);
                    stmt.setString(8,id_Crono);

                        stmt.executeUpdate();

                                //Inica el statement de la conexión
                                //Statement st = Conexion.createStatement();
                       //     st.executeUpdate(Query);
                                JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa.");
                        Conexion.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
                               System.out.println(ex.getMessage());
                                JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos."+ex);
                            }            }

            else{//no se 
            JOptionPane.showMessageDialog(null, "NO existe el Cronometro: " + id_Crono, " por favor revise",JOptionPane.ERROR_MESSAGE);
            res.close();
                        }
            } catch(SQLException a){
                JOptionPane.showMessageDialog(null, a);
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
            }
     }
     
    
        /*  ----------------------------------------------------------------------------------
    Aut@r: Saul Arenas Ramirez
     18/08/20
    ----------------------------------------------------------------------------------
*/
      public void eliminarCronometro(String id_Crono){
         try{
        PreparedStatement stmt;
        stmt = Conexion.prepareStatement("SELECT id_Crono FROM tabla_cronometros WHERE id_Crono = '" + id_Crono+ "'");
        java.sql.ResultSet res;
        res = stmt.executeQuery();

        if(res.next()){
            //PreparedStatement stmt;
            try {
                stmt=Conexion.prepareStatement("DELETE FROM tabla_cronometros WHERE id_Crono = '" + id_Crono+ "'");
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "El Cronometro "+id_Crono+" ha sido ELIMINADO exitosamente");

            } 
            catch (SQLException ex){
                Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else{//no se 
                JOptionPane.showMessageDialog(null, "No existe el Cronometro: " + id_Crono, " por favor revise",JOptionPane.ERROR_MESSAGE);
                res.close();
            }
        } catch(SQLException a){
            Logger.getLogger(LibreriaBDControlador.class.getName()).log(Level.SEVERE, null, a);
            JOptionPane.showMessageDialog(null, a);
        }
         
     
     }
     
     
     
     
     
}//final