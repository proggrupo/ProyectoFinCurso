/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alejandroo
 */
public class ConexionBBDD {

    private static Connection conn = null;

    /**
     * Realiza la conexion con la Base de Datos
     *
     * @return Objeto de la interfaz Connection
     */
    public static Connection getConnection() {
        try {
            if (conn == null) {
                Runtime.getRuntime().addShutdownHook(new MiShDwHook());
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost/empresa";
                String usuario = "root";
                String password = "";
                Class.forName(driver);
                conn = DriverManager.getConnection(url, usuario, password);
            }

            return conn;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error al cargar la base de datos", ex);
        }
    }

    static class MiShDwHook extends Thread {

        public void run() {
            try {
                Connection conn = ConexionBBDD.getConnection();
                conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }

}
