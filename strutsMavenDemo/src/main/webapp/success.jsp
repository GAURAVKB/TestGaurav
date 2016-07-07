<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>getfeebackheres</title>
</head>
<body>
HI! 
</br>Welcome : <s:property  value="%{fname}" /></br>
Feedback : <s:property value="%{fback}" /></br>
<s:textfield name="fname" value= "%{fname}"/>
</body>
</html>