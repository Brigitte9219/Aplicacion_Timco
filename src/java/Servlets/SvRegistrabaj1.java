
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
