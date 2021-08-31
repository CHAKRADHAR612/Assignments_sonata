<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="user" action="login" method="post">
		<fieldset>
			<legend>Enter Credentials</legend>
			<p>
				<form:label for="userName" path="userName" cssErrorClass="error">UserName</form:label>
				<br>
				<form:input path="userName" />
				<form:errors path="userName" />
			</p>
			<p>
				<form:label for="password" path="password" cssErrorClass="error">Password</form:label>
				<br>
				<form:input path="password" />
				<form:errors path="password" />
			</p>
			<p>
				<input type="submit" />
			</p>
		</fieldset>
	</form:form>
</body>
</html>