<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
   <%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>EX10-1</title>
</head>
<body>
   <%
      String field[] = { "First name", "Last name", "E-mail", "Phone number" };
      String param[] = { "firstname", "lastname", "email", "tel" };

      out.println("<!DOCTYPE html>\n" + "<html>\n"
            + "<head><title>EX9-1</title><style>span{color: red;}</style></head>\n"
            + "<body><h2>Registration</h2>\n" + "<form><table>");
      for (int i = 0; i < field.length; i++) {
         out.print("<tr><td><label>" + field[i] + ": </label></td>" + "<td><input type=\"text\" name=\""
               + param[i] + "\"");
         String val = request.getParameter(param[i]);
         String msg = (val != null && val.length() <= 0) ? ("<td><span>Enter " + field[i] + "</span><td>")
               : ("");
         out.print((val == null) ? ("/></td>") : (" value=\"" + val + "\"></td>" + msg));
         out.println("</tr>");
      }
      out.println("<tr><td><input type='submit' value='Register'>" + "</td></tr></table></form></body></html>");
   %>
</body>
</html>