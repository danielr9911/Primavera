/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primavera;

import Graphic.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import oracle.jdbc.OracleDatabaseMetaData;

/**
 *
 * @author Daniel
 */
public class Primavera {

    static Connection conn = null;
    static Statement st = null;
    static ResultSet rs = null;

    static String bd = "XE";
    static String login = "system";
    static String password = "eafit";
    static String url = "jdbc:oracle:thin:@localhost:1521:xe";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Start");

        MenuPrincipal vent = new MenuPrincipal();
        vent.setVisible(true);
        
    }

    public static Connection Enlace(Connection conn) throws SQLException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException e) {
            System.out.print("Clase no encontrada");
        }
        return conn;
    }
        
    public static String getId(String campoId,String campoNombre,String tabla, String nombre) {
        String id= "1110";
        String consulta = "select "+campoId+" from "+tabla+" where "+campoNombre+" = ?";
        System.out.println(consulta);
        try {
           conn=Primavera.Enlace(conn);
           String sqlinsertar=consulta;
           PreparedStatement psta=conn.prepareStatement(sqlinsertar);
           psta.setString(1, nombre);
           ResultSet rs = psta.executeQuery();
           if(rs.next()){
                id = rs.getString(1);
           }
        } catch(Exception e){
            System.out.println(e);
        }
        return id;
    }
    
    public static ResultSet selectAllFrom(String tabla,String campoId, String id ){
        String consulta = "select * from "+tabla+" where "+campoId+" = ?";
        System.out.println(consulta);
        try {
           conn=Primavera.Enlace(conn);
           String sqlinsertar=consulta;
           PreparedStatement psta=conn.prepareStatement(sqlinsertar);
           psta.setString(1, id);
           ResultSet rs = psta.executeQuery();
           return rs;
        } catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    
    public static boolean update(String tabla, String columnaUp, String value, String columnaId, String id){
        boolean updated = false;
        String consulta = "update "+tabla+" set "+columnaUp+" = ? where "+columnaId+" = ?";
        System.out.println(consulta);
        try {
           conn=Primavera.Enlace(conn);
           String sqlinsertar=consulta;
           PreparedStatement psta=conn.prepareStatement(sqlinsertar);
           psta.setString(1, value);
           psta.setString(2, id);
           psta.executeQuery();
           updated=true;
        } catch(Exception e){
            System.out.println(e);
        }
        return updated;
    }
}
