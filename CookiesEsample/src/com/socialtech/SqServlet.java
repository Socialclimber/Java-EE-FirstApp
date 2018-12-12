package com.socialtech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession session = req.getSession();
		Cookie cookies[] = req.getCookies();
		double k = 0;
		// Scan through the array and get the cookie of interest
		for(Cookie cookie: cookies)
			// check if the cookie is the required one
			if(cookie.getName().equals("results")) {
				// get the value in the cookie
				k = Double.parseDouble(cookie.getValue());
			}
		k = k * k;
		PrintWriter out = res.getWriter();
		out.print("Sq called successfully "+k);
	}

}
