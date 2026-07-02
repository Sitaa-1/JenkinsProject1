package com.nt.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/greeting")
public class WishMsgGenerator extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		int hr  = LocalDateTime.now().getHour();
		String msg;
		if(hr>=5 && hr<12)
			msg="good morning";
		else if(hr>=12 && hr<16)
			msg="good afternoon";
		else if(hr>=16 && hr<19)
			msg="good evening";
		else
			msg="good night";
		
	   out.println("<!DOCTYPE html>");
       out.println("<html><body style='text-align:center; margin-top:150px;'>");
       out.println("<h1>" + msg + "</h1>");
       out.println("<a href='index.html'>Back</a>");
       out.println("</body></html>");
	}
}
