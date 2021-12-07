package com.ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	String email;
	String password;
	
	public void doPost(HttpServletRequest req1,HttpServletResponse res1) throws IOException {  //We are using Post method to accept the data from HTML
		res1.setContentType("text/html");
		email = req1.getParameter("useremail");
		password = req1.getParameter("password1");
		
		//PrintWriter out = res1.getWriter();
		if ((email.equals("admin@gmail.com")) && (password.equals("admin"))) {
			res1.sendRedirect("WebDemo.jsp");
		}else {
			res1.sendRedirect("Error.jsp");
		}
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/database1","root","");
//			Statement stmnt = con1.createStatement();
//			String query = "select * from users where useremail = '" + email + "' and userpass1= '" + password + "'"; //You have to check that it's equal to what is in the database
//			ResultSet rs1 = stmnt.executeQuery(query);
//			
//			if (rs1.next()) {  //We want to check if it matches what we have in the database, so login would be successful
//				out.println("Logged in successfully!");
//			}else {
//				out.println("Login failed!");
//			}
//		}catch(Exception e) {
//			out.println(e);
//		}
	}
}
