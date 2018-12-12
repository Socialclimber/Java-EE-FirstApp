package com.socialtech;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		double i = Double.parseDouble(req.getParameter("num1"));
		double j = Double.parseDouble(req.getParameter("num2"));
		double results = i + j;
		// Add the value to be send to sqservlet in a cookie object
		Cookie cookie = new Cookie("results", results+"");
		// add the cookie in the response object
		res.addCookie(cookie);
		// redirect the call to sqservlet
		res.sendRedirect("sq");
	}
}
