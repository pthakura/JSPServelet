package com.pthakura.servletjsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoGetPost extends HttpServlet {

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int result = num1 + num2;
		
		PrintWriter pw = res.getWriter();
		
		pw.print("Result of Post request is :" +result);		
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		int num1  = Integer.parseInt(req.getParameter("num1"));
		int num2  = Integer.parseInt(req.getParameter("num2"));
		
		int sum = num1 + num2;
		
		res.sendRedirect("square?k="+sum);
		
//		req.setAttribute("param", sum);
		
//		RequestDispatcher rd = req.getRequestDispatcher("square");
//		
//		rd.forward(req, res);
	}
}
