<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>			<!-- attribute -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!							//Declaration tag
	int a,b,c;
%>
<%							//scriptlet tag
	a = 123;
	b = 456;
	c = a+b;
	out.println("addition is : "+c);
%>
</body> 
</html>