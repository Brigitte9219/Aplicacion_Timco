
package Contacto;

import ConexionBD.ConexionBD;


public class AgregarContacto {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Contacto contacto1 = new Contacto(1, "Brigitte Padilla", 1118551584, "bri@gmail.com", "hola", "Mi nombre es Brigitte");

        ContactoMetodos insertar = new ContactoMetodos();

        // Agregar trabajador
        insertar.agregarContacto(contacto1);
        
        // Cerrar la conexión a la base de datos
        ConexionBD.cerrarConexion();
    }
    
}
