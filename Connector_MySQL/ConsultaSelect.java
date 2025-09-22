package Connector_MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaSelect {
    

    public static void main(String[] args) {
        

        try {
            Connection conexion = ConexionMySQL.conectar("agenda2");
            System.out.println("Conexion Exitosa.");

            String query = "SELECT nombre, correo, telefono, imagen, binarioImagen FROM contacto";
            PreparedStatement preparequery = conexion.prepareStatement(query);
            ResultSet resultado = preparequery.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String correo = resultado.getString("correo");
                String telefono = resultado.getString("telefono");
                String imagen = resultado.getString("imagen");
                byte[] binarioImagen = resultado.getBytes("binarioImagen");

                System.out.println("\nNOMBRE: " + nombre);
                System.out.println("CORREO: " + correo);
                System.out.println("TELEFONO: " + telefono);
                System.out.println("IMAGEN: " + imagen);
                System.out.println("🧬 BINARIOIMAGEN: " + binarioImagen.length + " bytes\n");

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
