/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.ProjectsManager;

/**
 *
 * @author mazafaka
 */
@WebServlet(name = "private_controller", urlPatterns = {"/private", "/logout","/project"})
@ServletSecurity( @HttpConstraint(rolesAllowed = {"private"}) )
public class private_controller extends HttpServlet {
    
    @EJB
    ProjectsManager projectsManager;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
         String login=request.getUserPrincipal().getName();
        if ("/private".equals(request.getServletPath())){
            
            request.setAttribute("name", login); 
            request.getRequestDispatcher("WEB-INF/private/private_article.jsp").forward(request, response);
        }else
        if ("/logout".equals(request.getServletPath())){
            HttpSession session = request.getSession(false);
            if (session!= null){
                session.invalidate();
            }
            response.sendRedirect("/ASUCommunity/");
        }
        else
        if ("/project".equals(request.getServletPath())){
                try
                {
                    List<Object[]> result= projectsManager.findByLogin(login);
                    request.setAttribute("project", result);
                    request.getRequestDispatcher("WEB-INF/private/project.jsp").forward(request, response);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
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
