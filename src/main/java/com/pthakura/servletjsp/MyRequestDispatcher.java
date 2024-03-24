package com.pthakura.servletjsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyRequestDispatcher extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		int param = (int)req.getAttribute("param");
		
		int square = param * param;
		PrintWriter pw = res.getWriter();
		
		pw.print("Square of the sum is :" + square);
		
	}
}
