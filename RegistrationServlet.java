package com.ServletPackage;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//We want our method to extend HttpServlet so we can make use of the GET and POST methods
public class RegistrationServlet extends jakarta.servlet.http.HttpServlet{
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
		upassword2 = req1 .getParameter("password2");
		
		try {
			PrintWriter out = res1.getWriter();  //This would only work if the Servlet is registered in web.xml
			out.println(uname);
			out.println(uemail);
			out.println(upassword1);
			out.println(upassword2);
		}catch(IOException e){
			System.out.println("Exception caught!!");
		}
		
	}
}
