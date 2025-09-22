package Connector_MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultaUpDate {
    

    public static void main(String[] args) {
        

        try {
            Connection conexion = ConexionMySQL.conectar("agenda");
            System.out.println("Conexion Exitosa.");

            String query = "UPDATE contacto SET nombre=? WHERE nombre = ?";
            PreparedStatement prepereconsulta = conexion.prepareStatement(query);
            prepereconsulta.setString(2, "still");
            prepereconsulta.setString(1, "still6");
            int resultado = prepereconsulta.executeUpdate();
            
            if (resultado > 0) {
                System.out.println("contacto modificado exitosamente.");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
