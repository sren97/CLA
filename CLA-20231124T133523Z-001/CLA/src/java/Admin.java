/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Client;
import model.ClientDAO;
/**
 *
 * @author PC
 */
public class Admin extends HttpServlet {
    ClientDAO clntDAO = new ClientDAO();
    Client clnt = new Client();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException { 
        RequestDispatcher view = request.getRequestDispatcher("product.jsp");
        view.forward(request, response);
    } 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String n = request.getParameter("mail");
        String c = request.getParameter("name");
        String b = request.getParameter("surname");
        String v = request.getParameter("Phone_number");

        clnt.setMail(n);
        clnt.setName(c);
        clnt.setSurname(b);
        clnt.setPhoneNumber(v);
        clntDAO.Create(clnt);
        RequestDispatcher view = request.getRequestDispatcher("registro.jsp");
        request.setAttribute("mensaje", "Persona agregada satisfactoriamente");
        view.forward(request, response);
}
}