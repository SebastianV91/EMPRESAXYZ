/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xyz.controller;

import com.xyz.dao.TarjetaCreditoFacadeLocal;
import com.xyz.entities.TarjetaCredito;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sebastian
 */
public class ServletTarjetaCredito extends HttpServlet {
    
    @EJB(name = "crud")
    private TarjetaCreditoFacadeLocal crud;
    
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
            out.println("<title>Servlet ServletTarjetaCredito</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletTarjetaCredito at " + request.getContextPath() + "</h1>");
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
        
        try {
            String accion = request.getParameter("accion");
            switch(accion){
                
                /*            case "Lista":
                
                List<TarjetaCredito> datos = crud.findAll();
                request.setAttribute("datos", datos);
                request.getRequestDispatcher("tarjeta_credito.jsp").forward(request, response);
                
                break;                                                                  */
                
                case "Nuevo":
                    request.getRequestDispatcher("registrar_tarjeta_credito.jsp").forward(request, response);
                    break;
                    
                case "Guardar":
                    
                    String nombre = request.getParameter("txtNombre");
                    String codigo = request.getParameter("txtCodigo");
                    String fechaVencimiento = request.getParameter("txtFechaVencimiento");
                    
                    Date date = new SimpleDateFormat("dd-MM-yy").parse(fechaVencimiento);
                    
                    int cod = Integer.parseInt(codigo);
                    
                    TarjetaCredito credito = new TarjetaCredito(nombre, cod, date);
       
                    crud.create(credito);
                    
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    
                    break;
                    
                    /*            case "Editar":
                    
                    String ide = request.getParameter("id");
                    int id = Integer.parseInt(ide);
                    Cliente cliente1 = crud.find(id);
                    request.setAttribute("cliente", cliente1);
                    request.getRequestDispatcher("editar_cliente.jsp").forward(request, response);
                    
                    break;                                                                  */
                    
                    /*            case "Actualizar":
                    
                    String cedula1 = request.getParameter("txtCedulaCiudadania");
                    String nombre1 = request.getParameter("txtNombre");
                    String apellidos1 = request.getParameter("txtApellido");
                    String direccion1 = request.getParameter("txtDireccion");
                    String telefono1 = request.getParameter("txtTelefono");
                    String ide1 = request.getParameter("txtId");
                    
                    int id1 = Integer.parseInt(ide1);
                    int cc1 = Integer.parseInt(cedula1);
                    
                    Cliente c = new Cliente();
                    
                    c.setIdCliente(id1);
                    c.setCedulaCiudadania(cc1);
                    c.setNombre(nombre1);
                    c.setApellido(apellidos1);
                    c.setDireccion(direccion1);
                    c.setTelefono(telefono1);
                    
                    crud.edit(c);
                    
                    request.getRequestDispatcher("ServletCliente?accion=Lista").forward(request, response);
                    
                    break;                                                  */
                    
                    /*            case "Eliminar":
                    
                    String ide2 = request.getParameter("id");
                    
                    int id2 = Integer.parseInt(ide2);
                    
                    Cliente c2 = new Cliente();
                    
                    crud.remove(c2);
                    
                    request.getRequestDispatcher("ServletCliente?accion=Lista").forward(request, response);
                    
                    break;                                                                  */
                    
                default:
                    throw new AssertionError();
            }
        } catch (ParseException ex) {
            Logger.getLogger(ServletTarjetaCredito.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
