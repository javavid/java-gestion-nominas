package Connector_MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultaInsert {
    
    public static void main(String[] args) {
        

        try {
            Connection conexion = ConexionMySQL.conectar("agenda");
            System.out.println("Conexion Exitosa.");

            String query = "INSERT INTO contacto(nombre, correo) VALUES (?,?)";
            PreparedStatement prepereconsulta = conexion.prepareStatement(query);
            prepereconsulta.setString(1, "still");
            prepereconsulta.setString(2, "still@gmail.com");
            int resultado = prepereconsulta.executeUpdate();
            if (resultado == 1) {
                System.out.println("contacto insertado exitosamente.");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
