<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>loginpage</title>>
</head>
<body>
	<h1>Struts2 Feedback form</h1>

	<s:form action="login">
		<s:textfield key="user.name" label="Username" />
		<s:textfield key="user.feedback" label="feedback" />
		<s:submit key="submit" />
	</s:form>

</body>
</html>