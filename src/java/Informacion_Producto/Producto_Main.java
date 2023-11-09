
package Informacion_Producto;

import ConexionBD.ConexionBD;
import java.time.LocalDate;


public class Producto_Main {

    
    public static void main(String[] args) {
        
        LocalDate fechaFabricacion = LocalDate.of(2012, 8, 5);
        java.sql.Date fechaSql = java.sql.Date.valueOf(fechaFabricacion);
        
        Producto producto1 = new Producto(1,"gafas", "123", "insafe", "012", fechaSql, "gaf01", "0123456", "ntc18001", 5, "massy", 2);

        Producto_Metodos insertar = new Producto_Metodos();

        // Agregar producto
        insertar.agregarProducto(producto1);

        // Cerrar la conexión a la base de datos
        ConexionBD.cerrarConexion();
    }
}
        
 