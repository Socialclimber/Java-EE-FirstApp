/**
 * 
 */
package com.socialtech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author socialclimber
 *
 */
public class ArithmeticServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		double i = Double.parseDouble(req.getParameter("num1"));
		String operator = req.getParameter("operator");
		double j = Double.parseDouble(req.getParameter("num2"));
		double results = 0;
		if(operator.equals("+")) {
			results = i+j;
		}else if(operator.equals("-")){
			results = i-j;
		}else if(operator.equals("*")) {
			results = i*j;
		}else if(operator.equals("/")) {
			results = i/j;
		}else if(operator.equals("%")) {
			results = i%j;
		}else {
			res.getWriter().println("Invalid operator!");
		}
		PrintWriter out = res.getWriter();
		out.println(i+" "+operator+" "+j+" is: "+results);
	}
}
