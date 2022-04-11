/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public abstract class DBConnection {
    private Connection connection;
    public Connection connect() throws SQLException {
        if (this.connection == null || this.connection.isClosed()){
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/EczaneSistemi", "postgres", "12345");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }
        return this.connection;
    }

}
