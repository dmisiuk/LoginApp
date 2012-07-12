package by.minsler.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.minsler.web.dto.User;
import by.minsler.web.service.LoginService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userID;
		String password;
		userID = request.getParameter("userID");
		password = request.getParameter("password");
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userID, password);
		if (result) {
			User user = loginService.getUser(userID);
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("success.jsp");
			return;
		} else {
			response.sendRedirect("login.jsp");
			return;
		}
	}
}
