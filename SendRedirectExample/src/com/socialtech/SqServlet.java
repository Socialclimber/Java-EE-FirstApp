package com.socialtech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		double k = Double.parseDouble(req.getParameter("results"));
		k = k * k;
		PrintWriter out = res.getWriter();
		out.print("Sq called successfully "+k);
	}

}
