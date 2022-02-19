package com.oddeven;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class find
 */
//@WebServlet("/find")
public class find extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		
	     PrintWriter out = res.getWriter();
	     res.setContentType("text/html");
	     int num = Integer.parseInt(req.getParameter("n"));
	     
	     if(num%2==0)
	     {
	    	 out.println("The number is even");
	     }else {
	    	 out.println("The number is odd");
	     }
	     
	}

}
