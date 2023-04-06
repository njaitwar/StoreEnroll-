<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing</title>
</head>
<body>

		<h2>Billing Information</h2>
		FirstName:${billing.firstName }<br/>
		LastName:${billing.lastName }<br/>
		Email:${billing.email }<br/>
		Mobile:${billing.mobile }<br/>
		Product:${billing.product }<br/>
		Amount:${billing.amount }<br/>
		
			<div>
				${msg }
			</div>

</body>
</html>