package com.ServletPackage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//We want our method to extend HttpServlet so we can make use of the GET and POST methods
public class RegistrationServlet extends jakarta.servlet.http.HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public RegistrationServlet() {
		super();
	}
	
	String uname;
	String uemail;
	String upassword1;
	String upassword2;
	public void doPost(HttpServletRequest req1, HttpServletResponse res1) throws IOException {
		res1.setContentType("text/html");
		uname = req1.getParameter("username");
		uemail = req1.getParameter("useremail");
		upassword1 = req1.getParameter("password1");
		upassword2 = req1 .getParameter("password2");
		res1.sendRedirect("WebDemo.jsp");
		//PrintWriter out = res1.getWriter();
////This would only work if the Servlet is registered in web.xml
//		out.println(uname);
//		out.println(uemail);
//		out.println(upassword1);
//		out.println(upassword2);
// 		File file1 = new File("UserRegistrationDatabase.txt");
		
// 		FileWriter fw = new FileWriter(file1);
		
// 		PrintWriter pw = new PrintWriter(fw);
		
// 		pw.print(uname + " " + uemail + " " + upassword1 + " " + upassword2);
		
// 		pw.close();
		
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/database1","root","");
//			String query = "INSERT INTO users(username,useremail,userpass1,userpass2) VALUES(?,?,?,?)"; //replace these placeholders with the info that the user enters
//			PreparedStatement ps1 = con1.prepareStatement(query);
//			ps1.setString(1,uname); //all the input we make use of are in String format, and each is inserted in a particular position
//			ps1.setString(2,uemail);
//			ps1.setString(3,upassword1);
//			ps1.setString(4,upassword2);
//			
//			ps1.executeUpdate();
//			out.println("Data is inserted successfully!");
//		} catch (Exception e) {
//			//out.println(e);
//		}
		
		//Now we want to link the details of the user to the database
	}
}
