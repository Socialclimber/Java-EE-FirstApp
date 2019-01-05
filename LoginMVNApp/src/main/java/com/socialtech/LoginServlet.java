package com.socialtech;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.socialtech.doa.ItemsDoa;
import com.socialtech.doa.LoginDoa;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public LoginServlet() {
        super();
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		
		LoginDoa ld = new LoginDoa();
		// login the user with his/her username and password
		User u = ld.login(username, password);
		// put user object in a session
		HttpSession session = request.getSession();
		session.setAttribute("user", u);
		
		//Create RequestDispatcher object
		RequestDispatcher rd = null;
		// check user credentials
		if(username.equals(u.getUserName()) && password.equals(u.getPassword())) {
			// Query the items in the database and display them
			ItemsDoa id = new ItemsDoa();
			List items = id.select();//new ArrayList<Item>();
			request.setAttribute("itemsList", items);

			rd = request.getRequestDispatcher("Items.jsp");
			rd.forward(request, response);
			System.out.println("Success!");
			
		}else {
			// create a login failure message
			String message = "Invalid credentials";
			request.setAttribute("invalidLogin", message);
			rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		
	}

}
