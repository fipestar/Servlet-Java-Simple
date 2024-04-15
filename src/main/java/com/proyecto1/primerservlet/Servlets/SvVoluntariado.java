/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.proyecto1.primerservlet.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import logica.Voluntariado;

/**
 *
 * @author barbo
 */
@WebServlet(name = "SvVoluntariado", urlPatterns = {"/SvVoluntariado"})
public class SvVoluntariado extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvVoluntariado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvVoluntariado at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        HttpSession misesion = request.getSession();
        List<Voluntariado> listaVoluntariado = new ArrayList<>();

        request.setAttribute("listaVoluntariado", listaVoluntariado);
        request.getRequestDispatcher("mostrarVoluntariado.jsp").forward(request, response);
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
        String nombre_voluntario = request.getParameter("nombre_voluntario");
        String identificacion_voluntario = request.getParameter("identificacion_voluntario");
        String edad = request.getParameter("edad");
        String ocupacion = request.getParameter("ocupacion");
        String disponibilidad = request.getParameter("disponibilidad");
        
        Voluntariado voluntario = new Voluntariado(nombre_voluntario, identificacion_voluntario, edad, ocupacion, disponibilidad);

        HttpSession session = request.getSession();
        List<Voluntariado> listaVoluntariado = (List<Voluntariado>) session.getAttribute("listaVoluntariado");
        if (listaVoluntariado == null) {
            listaVoluntariado = new ArrayList<>();
        }
        listaVoluntariado.add(voluntario);
        session.setAttribute("listaVoluntariado", listaVoluntariado);

        response.sendRedirect("mostrarVoluntariado.jsp");
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
