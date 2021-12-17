package com.ServletPackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends javax.servlet.http.HttpServlet {	
	/**
	 * This servlet is connected to the login.jsp file. It takes the user inputed data
	 * and compares it to existing emails and passwords in the data. If there is a match
	 * the user is rerouted to the home page and is otherwise sent to an error page
	 */
	private static final long serialVersionUID = 1L;
	String email;
	String password;
	//The doPost method is used when data is to be sent, in this case, the info entered by the user is sent to the webserver and database
	public void doPost(HttpServletRequest req1,HttpServletResponse res1) throws IOException {  //We are using Post method to accept the data from HTML
		res1.setContentType("text/html");
		//Get methods are implemented in order to retrieve the data for the corresponding variable
		email = req1.getParameter("useremail");
		password = req1.getParameter("password1");
		
		try {
		//Allows us to connect to the database so the already existing credentials can be accessed
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","DATABASE NAME","DATABASE PASSWORD");
		Statement stmnt = con1.createStatement();
		
		//Creates a mySQL query to search for the user's email in its database
        String query = "select * from base where email = '" + email + "' and password= '" + password + "'"; 
        //You have to check that it's equal to what is in the database
		ResultSet rs1 = stmnt.executeQuery(query);
		String demail = (rs1.getString("email"));
		
		//We want to check if it matches what we have in the database, so login would be successful
		if (demail.equals(email)) {                        
			System.out.println("Logged in successfully!");
			res1.sendRedirect("WebDemo.jsp");
		//Redirects the user to an error page and requests them to enter valid credentials
		}else {                                            
			System.out.println("Login failed!");
			res1.sendRedirect("LoginError.jsp");
		}
	}catch(Exception e) {
		res1.sendRedirect("LoginError.jsp");
	}
	}
}
