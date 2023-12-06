
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvRegistrabaj1", urlPatterns = {"/SvRegistrabaj1"})
public class SvRegistrabaj1 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreCompleto=request.getParameter("nombreCompleto");
        String tipoDeIdentificacion=request.getParameter("tipoDeIdentificacion");
        String fechaDeExpedicion=request.getParameter("fechaDeExpedicion");
        String fechaDeNacimiento=request.getParameter("fechaDeNacimiento");
        String edad=request.getParameter("edad");
        String genero=request.getParameter("genero");
        String correoElectronico=request.getParameter("correoElectronico");
        String noDeIdentificacion=request.getParameter("noDeIdentificacion");
        String ciudadDeExpedicion=request.getParameter("ciudadDeExpedicion");
        String lugarDeNacimiento=request.getParameter("lugarDeNacimiento");
        String estatura=request.getParameter("estatura");
        String estadoCivil=request.getParameter("estadoCivil");
        
        
        Connection conexion = null;
        PreparedStatement pstmt = null;
        
        try {
            if (conexion == null || conexion.isClosed()) {
                //Se carga el driver al proyecto
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Se define la cadena de conexion
                String url = "jdbc:mysql://localhost:3306/timcobd3";
                String usuario = "root";
                String contraseña = "";
                //Establecer la conexion
                conexion = DriverManager.getConnection(url, usuario, contraseña);
                
                // Insertar datos en la base de datos
                String sql = "INSERT INTO usuarios (nombreCompleto, tipoDeIdentificacion, fechaDeExpedicion, fechaDeNacimiento, edad,"
                        + "genero, correoElectronico, noDeIdentificacion, ciudadDeExpedicion, lugarDeNacimiento, estatura, estadoCivil) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                pstmt = conexion.prepareStatement(sql);
                pstmt.setString(1, nombreCompleto);
                pstmt.setString(2, tipoDeIdentificacion);
                pstmt.setString(3, fechaDeExpedicion);
                pstmt.setString(4, fechaDeExpedicion);
                pstmt.setString(5, fechaDeExpedicion);
                pstmt.setString(6, fechaDeExpedicion);
                pstmt.setString(7, fechaDeExpedicion);
                pstmt.setString(8, fechaDeExpedicion);
                pstmt.setString(9, fechaDeExpedicion);
                pstmt.setString(10, fechaDeExpedicion);
                pstmt.setString(11, fechaDeExpedicion);
                pstmt.setString(12, fechaDeExpedicion);
                pstmt.executeUpdate();

                
                response.sendRedirect("registrabaj2.jsp"); // Redirigir a una página de registro exitoso
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("registroFallido.jsp"); // Redirigir a una página de registro fallido
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conexion != null) conexion.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
