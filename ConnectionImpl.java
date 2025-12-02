package com.miniProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionImpl implements IConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/studentdb"; // your DB name
    private static final String USER = "root";
    private static final String PASS = "ShreeRam&&Sita"; // change accordingly

    @Override
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

