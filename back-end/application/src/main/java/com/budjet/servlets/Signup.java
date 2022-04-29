package com.budjet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.models.Member; // refaire le package com.budjet.models


@WebServlet(name = "signup", value = "/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;

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
		String passwordConfirmation = request.getParameter("password-confirmation");

		String cleanedGroupName = cleanString(groupName);
		String cleanedPseudo = cleanString(pseudo);
		String cleanedMail = cleanString(mail);
		String cleanedPassword = cleanString(password);
		String cleanedPasswordConfirmation = cleanString(passwordConfirmation);
		
		ServletContext context = this.getServletContext();
		String path = context.getContextPath();
			
		if (!StringUtils.isEmpty(cleanedGroupName) && !StringUtils.isBlank(cleanedGroupName)
				&& !StringUtils.isEmpty(cleanedPseudo) && !StringUtils.isBlank(cleanedPseudo)
				&& !StringUtils.isEmpty(cleanedMail) && !StringUtils.isBlank(cleanedMail)
				&& !StringUtils.isEmpty(cleanedPassword) && !StringUtils.isEmpty(cleanedPassword)) {
			
//			PreparedStatement preparedStatement = null;
//			ResultSet resultSet = null;
//			
//			String query = "SELECT COUNT(*) OCC+ FROM member WHERE email = ?";
//			//PreparedStatement preparedStatement = getConnexion().preparedStatement. //preparer requête
//			resultSet = preparedStatement.executeQuery(query);
//			if(!resultSet.next() || resultSet >= 1) {
//				return false;
//				
//			}
			
			Member member = new Member();
			
			
			response.sendRedirect(path + "/profile");
		} else {
			
			response.sendRedirect(path + "/login");
		}
	}

	private String cleanString(String string) {
		return string.replaceAll("<[^>]*>", "");
	}

//	private boolean register(HttpServletRequest request, HttpServletResponse response,
//			String group, String pseudo, String email, String password, String passwordConfirmation) {
//		if(request.getParameter(message) != null && request.getParameter(pseudo) != null && request.getParameter(email) != null
//				&& request.getParameter(password) != null && request.getParameter(passwordConfirmation) != null) {
//			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/profile.jsp").forward(request,response);
//			
//		}
//		
//		
//		return false;
//		
//	}

}
