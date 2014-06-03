/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import entity.Articles;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.ArticlesManager;

/**
 *
 * @author mazafaka
 */
@WebServlet(name = "search", urlPatterns = {"/nsearch","/fsearch","/fnsearch"})
public class search extends HttpServlet {
    
        @EJB
        ArticlesManager articlesManager;
        
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userPath=request.getServletPath();
         if ("/nsearch".equals(userPath)){
             String search=request.getParameter("search");
             List<Articles> result=articlesManager.findNewsBySectionAndTitle(search);
             request.setAttribute("article", result);
        }
         if ("/fsearch".equals(userPath)){
             String search=request.getParameter("search");
             List<Articles> result=articlesManager.findForumBySectionAndTitle(search);
             request.setAttribute("article", result);
         }
         if ("/fnsearch".equals(userPath)){
             String csearch=null,dsearch=null;
            Enumeration<String> parameters = request.getParameterNames();
            while (parameters.hasMoreElements()) {
                String parameter = parameters.nextElement();
                if (parameter.equals("csearch")){
                    csearch=request.getParameter(parameter);
                    //List<Articles> result=
                            //articlesManager.findNewsByCategory(csearch);
                    //request.setAttribute("article", result);
                }else
                if (parameter.equals("dsearch")){
                    dsearch=request.getParameter(parameter);
                    //List<Articles> result=
                            articlesManager.findNewsByDate(dsearch);
                   // request.setAttribute("article", result);
                }
            }
         }
         request.getRequestDispatcher("/WEB-INF/views"+userPath+".jsp").forward(request, response);
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
