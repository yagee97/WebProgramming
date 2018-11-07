package myPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\n"+"<html>\n"+"<head><title>Example9.1</title>\n<style>span{color:red}</style></head>"
		+"<body><h1>Registration</h1>\n");
		
		String firstName = request.getParameter("firstName");
		
		out.println("<form name=\"fr\" action=\"http://localhost:8080/test/Hello\">");		
		out.println("<table><tr><td>First name:</td><td><input type=\"text\" name=\"firstName\""+"value= \""+firstName+"\""+"></td>\n");
		
	    if((firstName == null || firstName.trim().equals(""))) {
	         out.println("<td><span>Enter First name</span></td></tr>");
	      }
				
	    String lastName = request.getParameter("lastName");
	    
		out.println("<tr><td>Last name:</td><td><input type=\"text\" name=\"lastName\""+"value= \""+lastName+"\""+"></td>\n");
		
	    if((lastName == null || lastName.trim().equals(""))) {
	         out.println("<td><span>Enter Last name</span></td></tr>");
	      }
	    
	    String mail = request.getParameter("email");
		out.println("<tr><td>E-mail:</td><td><input type=\"email\" name=\"email\""+"value= \""+mail+"\""+"></td>\n");
		
	    if((mail == null || mail.trim().equals(""))) {
	         out.println("<td><span>Enter your email</span></td></tr>");
	      }
	    
	    String phone = request.getParameter("phone");
		out.println("<tr><td>Phone number:</td><td> <input type=\"text\" name=\"phone\""+"value= \""+phone+"\""+"></td>\n");
		

	    if((phone == null || phone.trim().equals(""))) {
	         out.println("<td><span>Enter your phone number</span></td></tr>");
	      }
	    
		out.println("<tr><td><input type=\"submit\" value=\"Register\"></td></tr></table>\n"+"</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
