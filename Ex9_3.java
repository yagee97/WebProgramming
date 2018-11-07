package myPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex9_3
 */
@WebServlet("/Ex9_3")
public class Ex9_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Ex9_3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		String searchEngine = request.getParameter("searchEngine");
		String keyword = request.getParameter("keyword");

		if ((searchEngine != null) && (keyword != null) && (keyword.trim().length() > 0)) {

			switch (searchEngine) {
			case "Naver":
				response.sendRedirect("http://search.naver.com/search.naver?query=" + keyword);
				break;
			case "Daum":
				response.sendRedirect("http://search.daum.net/search?q=" + keyword);
				break;
			case "Google":
				response.sendRedirect("http://www.google.com/search?q=" + keyword);
				break;
			case "Yahoo":
				response.sendRedirect("http://search.yahoo.com/bin/search?p=" + keyword);
				break;
			case "Bing":
				response.sendRedirect("http://www.bing.com/search?q=" + keyword);
				break;
			}
					}

		response.setContentType("text/html");
		out.println("<!DOCTYPE html><html><head><title>Exercise9.3</title></head>");
		out.println("<body><center><h1>Search Front-end</h1>");

		out.println("<p>Choose a search engine and enter query keywords.</p>");
		
		  out.println("<form action='http://localhost:8080/EX9_3/Ex9_3'>");
		out.println("<select name=\"searchEngine\">");
		out.println("<option value=\"Naver\">Naver</option>");
		out.println("<option value=\"Daum\">Daum</option>");
		out.println("<option value=\"Google\">Google</option>");
		out.println("<option value=\"Yahoo\">Yahoo</option>");
		out.println("<option value=\"Bing\">Bing</option>");
		out.println("</select>");

		out.println("<input type=\"text\" name=\"keyword\"><br/><br/>");
		
		out.println("<input type=\"submit\" value=\"Search\">");
		out.println("</center></body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
