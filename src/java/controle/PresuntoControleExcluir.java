/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Presunto;
import persistencia.DaoPresunto;

/**
 *
 * @author hebertferreira
 */
public class PresuntoControleExcluir extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Presunto novoPresunto = null;
        DaoPresunto novoDaoPresunto = null;
        RequestDispatcher coveiro = null;
        String msg = null;
            
        try {
            
            novoPresunto = new Presunto();
            novoDaoPresunto = new DaoPresunto();
            
            novoPresunto.setNome(request.getParameter("txtNome"));
            novoPresunto.setEmail(request.getParameter("txtEmail"));
            
            
            novoDaoPresunto.excluir(novoPresunto);
            
            msg = "Defunto incinerado com sucesso";
            
        } catch (Exception exception) {
            
            msg = "Ops...não torrou o presunto, tente novamente!!";
        
        }finally{
            
         request.setAttribute("finado", msg);
         coveiro = request.getRequestDispatcher("resultado.jsp");
         coveiro.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
