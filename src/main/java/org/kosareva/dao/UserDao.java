package org.kosareva.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDao {
    private static Connection conn;
    static {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bank",
                    "postgres",
                    "123456");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
