<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ page import = "java.util.*" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
	<%!
		Date d;						//import for it
	%>
	<%
		d = new Date();
		out.println("<h1> today's date is : "+d+"</h1>");
	%>
	<%
		String first = request.getParameter("f");
		String second = request.getParameter("s");
			
		int a = Integer.parseInt(first);
		int b = Integer.parseInt(second);
		
		int c = a+b;
		out.println("<h1> Addition is "+c+"</h1>");
	%>
</body>
</html>