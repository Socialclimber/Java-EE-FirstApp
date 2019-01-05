package com.socialtech;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.socialtech.doa.RegisterUser;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get values from the registration jsp form
		int id = Integer.parseInt(request.getParameter("userId"));
		String fname = request.getParameter("firstName");
		String sname = request.getParameter("secondName");
		String uname = request.getParameter("userName");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		RegisterUser ru = new RegisterUser();
		try {
			ru.registerUser(id, fname, sname, uname, email, pass);
			RequestDispatcher rd = request.getRequestDispatcher("RegistrationSuccessfulPage.jsp");
			rd.forward(request, response);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			RequestDispatcher rd = request.getRequestDispatcher("RegistrationFailurePage.jsp");
			rd.forward(request, response);
			e.printStackTrace();
			
		}
	}

}
