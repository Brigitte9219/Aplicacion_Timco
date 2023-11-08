
package Pqrsf;

//Definición de la clase Pqrsf
public class Pqrsf {
    
    //Definición de los atributos o variables de la clase
    public int idpqrsf;
    public String Nombre_Trabajador;
    public int trabajador_Numero_ID;
    public String Entidad_Empresa;
    public String Cargo;
    public String Ciudad;
    public String Telefono_movil;
    public String Correo_Electronico;
    public String Elija_Opcion;
    public String Mensaje;

    
    // Método constructor para inicializar los atributos
    public Pqrsf(int idpqrsf, String Nombre_Trabajador, int trabajador_Numero_ID, String Entidad_Empresa, String Cargo, String Ciudad, String Telefono_movil, String Correo_Electronico, String Elija_Opcion, String Mensaje) {
        this.idpqrsf = idpqrsf;
        this.Nombre_Trabajador = Nombre_Trabajador;
        this.trabajador_Numero_ID = trabajador_Numero_ID;
        this.Entidad_Empresa = Entidad_Empresa;
        this.Cargo = Cargo;
        this.Ciudad = Ciudad;
        this.Telefono_movil = Telefono_movil;
        this.Correo_Electronico = Correo_Electronico;
        this.Elija_Opcion = Elija_Opcion;
        this.Mensaje = Mensaje;
    }

    
    // Getters y setters - Acceder y Modificar
    public int getIdpqrsf() {
        return idpqrsf;
    }

    public void setIdpqrsf(int idpqrsf) {
        this.idpqrsf = idpqrsf;
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

    public String getEntidad_Empresa() {
        return Entidad_Empresa;
    }

    public void setEntidad_Empresa(String Entidad_Empresa) {
        this.Entidad_Empresa = Entidad_Empresa;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getTelefono_movil() {
        return Telefono_movil;
    }

    public void setTelefono_movil(String Telefono_movil) {
        this.Telefono_movil = Telefono_movil;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public String getElija_Opcion() {
        return Elija_Opcion;
    }

    public void setElija_Opcion(String Elija_Opcion) {
        this.Elija_Opcion = Elija_Opcion;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    
    
    
    
}
