package com.socialtech;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		double i = Double.parseDouble(req.getParameter("num1"));
		String operator = req.getParameter("operator");
		double j = Double.parseDouble(req.getParameter("num2"));
		RequestDispatcher rd;
		if(operator.equals("+")) {
			rd = req.getRequestDispatcher("add");
			rd.forward(req, res);
		}else if(operator.equals("-")){
			rd = req.getRequestDispatcher("subtract");
			rd.forward(req, res);
		}else if(operator.equals("*")) {
			rd = req.getRequestDispatcher("multiply");
			rd.forward(req, res);
		}else if(operator.equals("/")) {
			rd = req.getRequestDispatcher("division");
			rd.forward(req, res);
		}else if(operator.equals("%")) {
			rd = req.getRequestDispatcher("modulus");
			rd.forward(req, res);
		}else {
			res.getWriter().println("Invalid operator!");
		}
		
		
	}
}
