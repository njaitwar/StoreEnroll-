<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Lead</title>
</head>
<body>
		<h2>Lead | Create</h2>
		<form action="save" method = "post">
		<pre>
		First Name<input type = "text" name = "firstName"/>
		Last Name<input type ="text" name = "lastName"/>
		Email<input type = "text" name = "email"/>
		Mobile<input type = "number" name = "mobile"/>
		
		Source:
		<select name = "source">
		<option value = "website">website</option>
		<option value = "delivery">delivery</option>
		<option value = "trade show">trade show</option>
		<option value = "online">online</option>
	
		</select>
		<input type = "submit" value = "save"/>
		</pre>
		</form>

</body>
</html>