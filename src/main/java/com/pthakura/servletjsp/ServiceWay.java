package com.pthakura.servletjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServiceWay extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		int num1 = Integer.parseInt(req.getParameter("number1"));
		int num2 = Integer.parseInt(req.getParameter("number2"));
		
		try {
			PrintWriter pw  = res.getWriter();
			int r = num1+ num2;
			pw.print("The result is :" + r);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
}
