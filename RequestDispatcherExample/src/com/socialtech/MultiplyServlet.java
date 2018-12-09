package com.socialtech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiplyServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		double i = Integer.parseInt(req.getParameter("num1"));
		double j = Integer.parseInt(req.getParameter("num2"));
		double result = i*j;
		PrintWriter out = res.getWriter();
		out.println("Result of "+i+" * "+j+" is: "+result);
	}
}
