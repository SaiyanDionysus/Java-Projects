package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/PostgreSQLExample";
        String username = "postgres";
        String password = "postgres";

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

        if(connection != null && !connection.isClosed()) {
            System.out.println("Connection successfully established");
        }

        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("Connection closed.");
        }
    }
}


//https://proxiesapi.com/blog/how-to-build-a-super-simple-http-proxy-in-java.html.php