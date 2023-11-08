
package Contacto;

//Definición de la clase Contacto
public class Contacto {
    
    
    //Definición de los atributos o variables de la clase
    public int idcontacto;
    public String Nombre_Trabajador;
    public int trabajador_Numero_ID;
    public String Correo_Electronico;
    public String Asunto;
    public String Mensaje;

    
    // Método constructor para inicializar los atributos
    public Contacto(int idcontacto, String Nombre_Trabajador, int trabajador_Numero_ID, String Correo_Electronico, String Asunto, String Mensaje) {
        this.idcontacto = idcontacto;
        this.Nombre_Trabajador = Nombre_Trabajador;
        this.trabajador_Numero_ID = trabajador_Numero_ID;
        this.Correo_Electronico = Correo_Electronico;
        this.Asunto = Asunto;
        this.Mensaje = Mensaje;
    }

    // Getters y setters - Acceder y Modificar
    
    public int getIdcontacto() {
        return idcontacto;
    }

    public void setIdcontacto(int idcontacto) {
        this.idcontacto = idcontacto;
    }

    public String getNombre_Trabajador() {
        return Nombre_Trabajador;
    }

    public void setNombre_Trabajador(String Nombre_Trabajador) {
        this.Nombre_Trabajador = Nombre_Trabajador;
    }

    public int getTrabajador_Numero_ID() {
        return trabajador_Numero_ID;
    }

    public void setTrabajador_Numero_ID(int trabajador_Numero_ID) {
        this.trabajador_Numero_ID = trabajador_Numero_ID;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    
    
    
    
}
