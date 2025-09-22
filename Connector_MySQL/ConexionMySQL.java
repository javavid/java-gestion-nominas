package Connector_MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionMySQL {
    
        private static final String URL = "jdbc:mysql://localhost:3306/";
        private static final String USER = "root";
        private static final String PASS = ""; // o la que tengas configurada en XAMPP

        
            
            public static Connection conectar(String nombreDB) throws SQLException
            {
                return DriverManager.getConnection(URL+nombreDB, USER, PASS);
            }
    }
