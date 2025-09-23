package Connector_MySQL;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.mindrot.jbcrypt.BCrypt;

public class AddImagenes {
    public static final String NOMBRE = "jocelyn";
    public static final String CORREO = "jocelyn@gmail.com";
    public static final int TEL = 32063260;
    public static final String IMAGEN = "C:\\java-gestion-nominas\\Connector_MySQL\\java-151343_1920.png";

    public static void main(String[] args) {
        
        

        try {
            Connection conexion = ConexionMySQL.conectar("agenda2");
            System.out.println("Conexion Exitosa.");

            final byte[] bitImagen = Files.readAllBytes(Paths.get(IMAGEN));

            //ejemplo de datos encryptados:
            String telIncryptada = BCrypt.hashpw(CORREO, BCrypt.gensalt());//esta linea de codigo encypta la contraseña como no tengo el campo contraseña hago el ejemplo con el correo.

            String query = "INSERT INTO contacto(nombre, correo, telefono, imagen, binarioImagen) VALUES (?,?,?,?,?)";
            PreparedStatement prepereConsulta = conexion.prepareStatement(query);
            prepereConsulta.setString(1, NOMBRE);
            prepereConsulta.setString(2, telIncryptada);
            prepereConsulta.setInt(3, TEL);
            prepereConsulta.setString(4, IMAGEN);
            prepereConsulta.setBytes(5, bitImagen);
            int resultado = prepereConsulta.executeUpdate();
            if (resultado == 1) {
                System.out.println("contacto insertado exitosamente.");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
