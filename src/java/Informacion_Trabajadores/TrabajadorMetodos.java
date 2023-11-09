
package Informacion_Trabajadores;

import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TrabajadorMetodos {
    
    public void agregarTrabajador(Trabajador trabajador) {
        String insertQuery = "INSERT INTO trabajador (idtrabajador, Nombre_Completo, Correo_Electronico, Tipo_ID, Numero_ID,"
                + "Fecha_Expedicion, Ciudad_Expedicion, Fecha_Nacimiento, Lugar_Nacimiento, Edad, Estatura, Genero, Estado_Civil,"
                + "RH, Grupo_Sanguineo, Localidad, Ciudad_Residencia, Barrio, Direccion, Telefono_Movil, Telefono_Fijo, EPS,"
                + "AFP, Escolaridad, Profesion, Talla_Camisa, Talla_Pantalon, Talla_Chaqueta, Talla_Calzado, Emergencia_NombreCompleto,"
                + "Emergencia_Parentesco, Emergencia_TelefonoMovil, Emergencia_TelefonoFijo, usuarios_idusuario) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(insertQuery)) {
            statement.setInt(1, trabajador.getIdtrabajador());
            statement.setString(2, trabajador.getNombre_Completo());
            statement.setString(3, trabajador.getCorreo_Electronico());
            statement.setString(4, String.valueOf(trabajador.getTipo_ID()));
            statement.setInt(5, trabajador.getNumero_ID());
            statement.setDate(6, trabajador.getFecha_Expedicion());
            statement.setString(7, trabajador.getCiudad_Expedicion());
            statement.setDate(8, trabajador.getFecha_Nacimiento());
            statement.setString(9, trabajador.getLugar_Nacimiento());
            statement.setInt(10, trabajador.getEdad());
            statement.setDouble(11, trabajador.getEstatura());
            statement.setString(12, trabajador.getGenero());
            statement.setString(13, trabajador.getEstado_Civil());
            statement.setString(14, trabajador.getRH());
            statement.setString(15, trabajador.getGrupo_Sanguineo());
            statement.setString(16, trabajador.getLocalidad());
            statement.setString(17, trabajador.getCiudad_Residencia());
            statement.setString(18, trabajador.getBarrio());
            statement.setString(19, trabajador.getDireccion());
            statement.setString(20, trabajador.getTelefono_Movil());
            statement.setString(21, trabajador.getTelefono_Fijo());
            statement.setString(22, trabajador.getEPS());
            statement.setString(23, trabajador.getAFP());
            statement.setString(24, trabajador.getEscolaridad());
            statement.setString(25, trabajador.getProfesion());
            statement.setString(26, trabajador.getTalla_Camisa());
            statement.setString(27, trabajador.getTalla_Pantalon());
            statement.setString(28, trabajador.getTalla_Chaqueta());
            statement.setString(29, trabajador.getTalla_Calzado());
            statement.setString(30, trabajador.getEmergencia_NombreCompleto());
            statement.setString(31, trabajador.getEmergencia_Parentesco());
            statement.setString(32, trabajador.getEmergencia_TelefonoMovil());
            statement.setString(33, trabajador.getEmergencia_TelefonoFijo());
            statement.setInt(34, trabajador.getUsuarios_idusuario());
            statement.executeUpdate();
            System.out.println("Trabajador agregado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar el trabajador.");
        }
    }

    
}
