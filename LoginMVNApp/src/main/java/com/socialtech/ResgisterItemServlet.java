package com.socialtech;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.socialtech.doa.ItemsDoa;
@WebServlet("/RegisterItems")
public class ResgisterItemServlet extends HttpServlet {
    public ResgisterItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int itemId = Integer.parseInt(request.getParameter("itemId"));
		String itemName = request.getParameter("itemName");
		double itemPrice = Double.parseDouble(request.getParameter("itemPrice"));
		ItemsDoa id = new ItemsDoa();
		boolean success = id.registerItems(itemId, itemName, itemPrice);
		RequestDispatcher rd = null;
		if(success) {
			rd = request.getRequestDispatcher("ItemAddedWithSuccess.jsp");
			rd.forward(request, response);
		}else {
			rd = request.getRequestDispatcher("ItemFailed.jsp");
			rd.forward(request, response);
		}
	}



}
