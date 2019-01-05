package com.socialtech;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		int userId = Integer.parseInt(req.getParameter("user_id"));
		String userName = req.getParameter("user_name");
		String firstName = req.getParameter("first_name");
		String surName  = req.getParameter("sur_name");
		String middleName = req.getParameter("middle_name");
	}
}
