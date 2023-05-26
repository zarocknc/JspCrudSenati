/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author sebas
 */
import java.sql.*;
public class Conexion {
    private Connection con;
    private static final String JDBC_URL = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10621360";
    private static final String JDBC_USER = "sql10621360";
    private static final String JDBC_PASSWORD = "t7ed9uJXTn";
    public Conexion() {
        try {
           con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (Exception e) {
            System.err.println("ERROR: "+e);
        }
}

        public Connection getConnection() {
            return con;
        }
}
