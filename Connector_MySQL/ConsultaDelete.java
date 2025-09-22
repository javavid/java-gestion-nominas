package Connector_MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultaDelete {
    
    public static void main(String[] args) {
        

        try {
            Connection conexion = ConexionMySQL.conectar("agenda");
            System.out.println("Conexion Exitosa.");

            String query = "DELETE FROM contacto WHERE nombre = ?";
            PreparedStatement prepereconsulta = conexion.prepareStatement(query);
            prepereconsulta.setString(1, "still6");
            int resultado = prepereconsulta.executeUpdate();

            if (resultado > 0) {
                System.out.println("contacto eliminado exitosamente.");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
