package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection connection;

    public  Connection getConnection(){
        String dbName = "myproject";
        String userName = "root";
        String password = "";
        String url = "jdbc:mysql://localhost/" + dbName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,userName,password);

        } catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }

        return connection;
    }
}
