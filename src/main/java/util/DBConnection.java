package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static String url = System.getenv("DB_URL");;
    private static String user = System.getenv("DB_USER");;
    private static String pass = System.getenv("DB_PASS");;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }
}
