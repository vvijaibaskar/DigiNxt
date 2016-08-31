<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>   Register your details</h1>

	<h2>Please fill the details</h2>

	<form:form action="register2" commandName="usr" method="post">
		<table>
			<tr>
				<td>User ID:</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Mobile No:</td>
				<td><input type="text" name="phone"></td>
			</tr>
			
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email"></td>
			</tr>
			
		<tr>
				<td>Year Of Join:</td>
				<td><input type="number" name="yearOfJoin"></td>
			</tr>
		<tr>
				<td>NIIT RollNo:</td>
				<td><input type="text" name="niitRollNo"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register">
				<td><input type="reset" value="Reset">
			</tr>
			
		</table>

	</form:form>

</body>
</html>