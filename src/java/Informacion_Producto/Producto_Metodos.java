
package Informacion_Producto;

import ConexionBD.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Producto_Metodos {
    
    public void agregarProducto(Producto producto) {
        String insertQuery = "INSERT INTO producto (idproducto, Nombre_Producto, Codigo_Interno, Marca, Serie, Fecha_Fabricacion, Referencia, "
                + "Lote, Norma_Tecnica, Cantidad, Proveedor, usuarios_idusuario) VALUES (?, ?, ? , ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.obtenerConexion();
                
             PreparedStatement statement = conn.prepareStatement(insertQuery)) {
            statement.setInt(1, producto.getIdproducto());
            statement.setString(2, producto.getNombre_Producto());
            statement.setString(3, producto.getCodigo_Interno());
            statement.setString(4, producto.getMarca());
            statement.setString(5, producto.getSerie());
            statement.setDate(6, producto.getFecha_Fabricacion());
            statement.setString(7, producto.getReferencia());
            statement.setString(8, producto.getLote());
            statement.setString(9, producto.getNorma_Tecnica());
            statement.setInt(10, producto.getCantidad());
            statement.setString(11, producto.getProveedor());
            statement.setInt(12, producto.getUsuarios_idusuario());
            statement.executeUpdate();
            
            System.out.println("Producto agregado correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar el producto.");
        }
    }
    
}
