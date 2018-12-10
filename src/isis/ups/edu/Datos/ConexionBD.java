/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isis.ups.edu.Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Antony
 */
public class ConexionBD {

    private static Connection conn;
    private static final String drvier = "com.mysql.jdbc.Driver";
    private static final String usuario = "antony";
    private static final String password = "tony";
    private static final String url = "jdbc:mysql://192.168.43.254:3306/aplicaciones";

    public ConexionBD() {
        conn = null;
        try {
            Class.forName(drvier);
            conn = DriverManager.getConnection(url, usuario, password);
            if (conn != null) {
                
               // JOptionPane.showMessageDialog(null, "Conectado .... ");
                System.out.println("Conectado .... ");
            }
        } catch (Exception e) {
            System.out.println("Error .... " + e);  
        }
    }
    /**
     * Con este metodo obtenemos la conexion
     *
     * @return
     */
    public Connection getConnection() {

        return conn;
    }
    /**
     * Este metodo cierra la conexion con la BD
     */
    public void Desconectar() {
        conn = null;
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "Good Bye .... ");
            System.out.println("Good Bye .... ");
        }
    }
}
