package com.socialtech;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.socialtech.doa.LoginDoa;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String uname = req.getParameter("username");
		String pass = req.getParameter("password");
		LoginDoa doa = new LoginDoa();
		if(doa.check(uname, pass)) {
			HttpSession session = req.getSession();
			session.setAttribute("username", uname);
			res.sendRedirect("Welcome.jsp");
		}else {
			res.sendRedirect("Failed.jsp");
		}
	}

}
