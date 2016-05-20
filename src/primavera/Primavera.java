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
        // TODO code application logic here
        //Connection conexion;
        /**
         * try { Connection conexion; Class.forName("oracle.jdbc.OracleDriver");
         * String BaseDeDatos = "jdbc:oracle:thin:@127.0.0.1:1521:SYSTEM";
         * conexion = DriverManager.getConnection(BaseDeDatos, "system",
         * "eafit"); if (conexion != null && !conexion.isClosed()) {
         * System.out.println("-> Conexion establecida"); OracleDatabaseMetaData
         * dbmd; String tipos[] = new String[]{"TABLE", "VIEW"}; ResultSet
         * tablas; ArrayList<String> datos = new ArrayList(); dbmd =
         * (OracleDatabaseMetaData) conexion.getMetaData(); tablas =
         * dbmd.getTables(null, "SYSTEM", "TABLE", tipos); } else {
         * System.out.println("->No fue posible crear la conexion!"); } } catch
         * (Exception ex) { ex.printStackTrace(); }
         */
        System.out.println("Start");

        /**
         * Long idCarro = new Long(5); String nombreCarro = "Ejemplo"; String
         * placaCarro = "SOL45"; String estadoCarro = "ACTIVO"; Carrosolar car =
         * new Carrosolar(idCarro, nombreCarro, placaCarro, estadoCarro); String
         * consulta = "select nombre_carro from Carrosolar"; LinkedList<String>
         * resultado = query(consulta); for(int i=0;i<resultado.size();i++){
         * System.out.println(resultado.get(i)); }
         */
        MenuPrincipal vent = new MenuPrincipal();
        vent.setVisible(true);
        //GestionarCarroSolar inter = new GestionarCarroSolar();
        //GestionarCarroSolar.main(new String[0]);
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

    public static Statement sta(Statement st) throws SQLException {
        conn = Enlace(conn);
        st = conn.createStatement();
        return st;
    }

    public static ResultSet EnlEst(ResultSet rs) throws SQLException {
        st = sta(st);
        rs = st.executeQuery("select * from autor");
        return rs;
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
    
    
    /**
    static public Statement connect() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Connecting to the database...");
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "eafit");
            Statement statement = connection.createStatement();
            return statement;
        } catch (Exception e) {
            System.out.println("Exepcion:" + e);
            return null;
        }
    }

    static public LinkedList<String> query(String from) {
        try {
            Statement st = connect();
            ResultSet resultSet = st.executeQuery(from);

            LinkedList<String> result = new LinkedList();
            while (resultSet.next()) {
                for (int i = 1; i < resultSet.getMetaData().getColumnCount(); i++) {
                    result.add(resultSet.getString(i));
                }
            }
            return result;
        } catch (Exception e) {
            return null;
        }
    }
    */
}
