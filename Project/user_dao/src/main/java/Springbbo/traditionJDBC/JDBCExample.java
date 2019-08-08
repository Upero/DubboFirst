package Springbbo.traditionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCExample {

    private Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mybatis?bm";
            String user = "root";
            String password = "learn";
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
