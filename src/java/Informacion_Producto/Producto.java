
package Informacion_Producto;

import java.sql.Date;

//Definición de la clase Producto
public class Producto {
    
    //Definición de los atributos o variables de la clase
    public int idproducto;
    public String Nombre_Producto;
    public String Codigo_Interno;
    public String Marca;
    public String Serie;
    public java.sql.Date Fecha_Fabricacion;
    public String Referencia;
    public String Lote;
    public String Norma_Tecnica;
    public int cantidad;
    public String Proveedor;
    public int usuarios_idusuario;
    

    // Método constructor para inicializar los atributos
    public Producto(int idproducto, String Nombre_Producto, String Codigo_Interno, String Marca, String Serie, Date Fecha_Fabricacion, String Referencia, String Lote, String Norma_Tecnica, int cantidad, String Proveedor, int usuarios_idusuario) {
        this.idproducto = idproducto;
        this.Nombre_Producto = Nombre_Producto;
        this.Codigo_Interno = Codigo_Interno;
        this.Marca = Marca;
        this.Serie = Serie;
        this.Fecha_Fabricacion = Fecha_Fabricacion;
        this.Referencia = Referencia;
        this.Lote = Lote;
        this.Norma_Tecnica = Norma_Tecnica;
        this.cantidad = cantidad;
        this.Proveedor = Proveedor;
        this.usuarios_idusuario = usuarios_idusuario;
    }
    
    
    // Getters y setters - Acceder y Modificar

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public String getCodigo_Interno() {
        return Codigo_Interno;
    }

    public void setCodigo_Interno(String Codigo_Interno) {
        this.Codigo_Interno = Codigo_Interno;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public Date getFecha_Fabricacion() {
        return Fecha_Fabricacion;
    }

    public void setFecha_Fabricacion(Date Fecha_Fabricacion) {
        this.Fecha_Fabricacion = Fecha_Fabricacion;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getLote() {
        return Lote;
    }

    public void setLote(String Lote) {
        this.Lote = Lote;
    }

    public String getNorma_Tecnica() {
        return Norma_Tecnica;
    }

    public void setNorma_Tecnica(String Norma_Tecnica) {
        this.Norma_Tecnica = Norma_Tecnica;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public int getUsuarios_idusuario() {
        return usuarios_idusuario;
    }

    public void setUsuarios_idusuario(int usuarios_idusuario) {
        this.usuarios_idusuario = usuarios_idusuario;
    }
       
    
    
}
