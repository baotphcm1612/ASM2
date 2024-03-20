package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class JDBCUtil {
    private static final String hostName = "DESKTOP-HL72S6V\\BRAVOS:1433;";
    private static final String username = "admin";
    private static final String password = "BaoSQL2005@";
    private static final String dbName = "studentManager;";
    private static final String url = "jdbc:sqlserver://" +
            hostName +
            "databaseName=" + dbName +
            "encrypt=true;" +
            "trustServerCertificate=true;" +
            "integratedSecurity=false;";

    public static Connection getConnection() {
        Connection conn;
        try {
            conn = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            if(conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
