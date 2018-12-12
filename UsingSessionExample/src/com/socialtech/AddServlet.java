package com.socialtech;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		double i = Double.parseDouble(req.getParameter("num1"));
		double j = Double.parseDouble(req.getParameter("num2"));
		double results = i + j;
		HttpSession session = req.getSession();
		session.setAttribute("results", results);
		res.sendRedirect("sq");
	}
}
