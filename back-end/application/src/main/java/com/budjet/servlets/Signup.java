package com.budjet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name ="signup", value="/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;
       
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/signup.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nom = request.getParameter("group");
		message = "Bonjour" + nom;
		PrintWriter out = response.getWriter();
		out.println(message);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/profile.jsp").forward(request,response);
	}

}
