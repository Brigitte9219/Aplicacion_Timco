
package Contacto;

import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ContactoMetodos {
    
    public void agregarContacto(Contacto contacto) {
        String insertQuery = "INSERT INTO contacto (idcontacto, Nombre_Trabajador, trabajador_Numero_ID, Correo_Electronico, Asunto, Mensaje) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(insertQuery)) {
            statement.setInt(1, contacto.getIdcontacto());
            statement.setString(2, contacto.getNombre_Trabajador());
            statement.setInt(3, contacto.getTrabajador_Numero_ID());
            statement.setString(4, contacto.getCorreo_Electronico());
            statement.setString(5, contacto.getAsunto());
            statement.setString(6, contacto.getMensaje());
            statement.executeUpdate();
            System.out.println("Contacto agregado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar el contacto.");
        }
    }

    
}

  