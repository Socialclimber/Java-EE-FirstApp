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
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String n = req.getParameter("sentence");
		int stringlength = n.split(" ").length;
		req.setAttribute("n", n);
		req.setAttribute("len", stringlength);
		RequestDispatcher rd = req.getRequestDispatcher("Display.jsp");
		rd.forward(req, res);
	}
}
