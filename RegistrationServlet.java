package com.ServletPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//We want our method to extend HttpServlet so we can make use of the GET and POST methods
public class RegistrationServlet extends javax.servlet.http.HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String uname;
	String uemail;
	String upassword1;
	String upassword2;
	public void doPost(HttpServletRequest req1, HttpServletResponse res1) {
		res1.setContentType("text/html");
		uname = req1.getParameter("username");
		uemail = req1.getParameter("useremail");
		upassword1 = req1.getParameter("password1");
		upassword2 = req1.getParameter("password2");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useSSL=false","root",INSERT_PASSWORD);
			Statement stmnt = con1.createStatement();
			PreparedStatement preparedStatement=con1.prepareStatement("insert into base values(?,?,?)");
			String query = "select * from base where email = '" + uemail + "'"; //You have to check that it's equal to what is in the database
			ResultSet rs1 = stmnt.executeQuery(query);
			
			
			if (rs1.next()){
				res1.sendRedirect("Error.jsp");
			}
			else {
				preparedStatement.setString(1,uemail);
			    preparedStatement.setString(2,uname);
			    preparedStatement.setString(3,upassword1);
		        preparedStatement.executeUpdate();	
		        res1.sendRedirect("WebDemo.jsp");
			}
			//Setting values for Each Parameter
		}catch (Exception e){
			e.printStackTrace();
			
		}
	}
}
