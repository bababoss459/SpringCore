<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition</title>
</head>
<body>
	<form name='subForm' action='calculate.jsp' method='get'>
		<table border='5' align='center'>
			<tr><td>First Value</td><td><input type='text' name='f' value=''/></td></tr>
			<tr><td>Second Value</td><td><input type='text' name='s' value=''/></td></tr>
			<tr><td colspan='2' align='center'>
				<input type='submit' name='sub' value='Addition'/>
			</td></tr>
		</table>
	</form>
	
</body>
</html>