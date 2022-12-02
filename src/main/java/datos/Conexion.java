package datos;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //Variables
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    //Metodo conexion
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
    //Metodos para cerrar
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    
     public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
     
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
    
}
