package com.ServletPackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends javax.servlet.http.HttpServlet {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root");
		Statement stmnt = con1.createStatement();
		PreparedStatement preparedStatement=con1.prepareStatement("insert into base values(?,?,?)");
		 System.out.println("reached");
		 //Setting values for Each Parameter
		preparedStatement.setString(1,email);
        preparedStatement.setString(2,password);
        preparedStatement.setString(3,email);
        preparedStatement.executeUpdate();
        String query = "select * from base where email = '" + email + "' and password= '" + password + "'"; //You have to check that it's equal to what is in the database
		ResultSet rs1 = stmnt.executeQuery(query);
   
		System.out.println("reached");
		
		if (rs1.next()) {  //We want to check if it matches what we have in the database, so login would be successful
			System.out.println("Logged in successfully!");
		}else {
			System.out.println("Login failed!");
		}
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
