package com.socialtech;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.socialtech.doa.LoginDoa;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		LoginDoa ld = new LoginDoa();
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		User u1 = null;
		try {
			u1 =	ld.getUser(userName);
		}catch(Exception e) {
			
		}
		String name = u1.userName;
		req.setAttribute("name", name);
		req.setAttribute("user", u1);
		RequestDispatcher rd = req.getRequestDispatcher("Display.jsp");
		rd.forward(req, res);
	}
}
