package com.budjet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.budjet.DAO.DAOFactory;
import com.budjet.DAO.MemberDAO;
import com.budjet.DAO.MsSqlConnect;
import com.budjet.models.Member;
import com.budjet.services.AuthenticationService;
import com.budjet.utils.Strings;


@WebServlet(name = "signup", value = "/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Signup() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/signup.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String groupName = request.getParameter("group");
		String pseudo = request.getParameter("pseudo");
		String mail = request.getParameter("mail");
		String password = request.getParameter("password");
		String cleanedGroupName = cleanString(groupName);
		String cleanedPseudo = cleanString(pseudo);
		String cleanedMail = cleanString(mail);
		String cleanedPassword = cleanString(password);
		
		ServletContext context = this.getServletContext();
		String path = context.getContextPath();
			
		if (!Strings.isEmptyOrBlank(cleanedGroupName)
				&& !Strings.isEmptyOrBlank(cleanedPseudo)
				&& !Strings.isEmptyOrBlank(cleanedMail)
				&& !Strings.isEmptyOrBlank(cleanedPassword)) {
			
			AuthenticationService authenticationService = new AuthenticationService();
			int userId = authenticationService.register(cleanedGroupName, cleanedPseudo, cleanedMail, cleanedPassword);
			HttpSession userSession = createSession(request, userId, cleanedPseudo, cleanedMail, cleanedGroupName);
			
			response.sendRedirect(path + "/profile");
		} else {
			
			response.sendRedirect(path + "/login");
		}
	}

	private static String cleanString(String string) {
		return string.replaceAll("<[^>]*>", "");
	}
	
	private HttpSession createSession(HttpServletRequest request, int userId, String pseudo, String email, String groupName) {
		HttpSession session = request.getSession();
		session.setAttribute("userId", userId);
		session.setAttribute("username", pseudo);
		session.setAttribute("email", email);
		session.setAttribute("groupName", groupName);
		session.setAttribute("userBudget", 0);
		session.setAttribute("userSpending", 0);
		return session;
	}


}
