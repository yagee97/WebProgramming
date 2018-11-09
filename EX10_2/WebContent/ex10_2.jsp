<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ex10_2</title>
</head>
<%
String bgcolor, textColor;
if(request.getHeader("User-Agent").contains("Chrome")){
	bgcolor = "yellow";
	textColor = "red";
}
else {
	bgcolor =  "navy";
	textColor = "white";
}

%>
<body bgColor="<%= bgcolor %>" text="<%= textColor %>">
<%@ page import="java.util.Enumeration" %>
<%
	Enumeration<String> headerNames = request.getHeaderNames();
	while (headerNames.hasMoreElements()) {
	    String name = (String)headerNames.nextElement();
	    %>
	    <p><%=name %> : <%= request.getHeader(name) %></p>
	    <%
	}
%>
</body>
</html>