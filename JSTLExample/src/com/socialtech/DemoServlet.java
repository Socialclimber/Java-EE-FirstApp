package com.socialtech;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet{
	public void	doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Student s = new Student(2, "Nkeng");
		req.setAttribute("student", s);
		RequestDispatcher rd = req.getRequestDispatcher("Display.jsp");
		rd.forward(req, res);
	}
}
