<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>Contact Manager - Struts2 Hibernate Example</title>
</head>
<body>
<h1>Contact Manager</h1>
<s:actionerror/>
<s:form action="add" method="post">
	<s:textfield name="contact.firstName" label="Firstname"/>
	<s:textfield name="contact.lastName" label="Lastname"/>
	<s:textfield name="contact.emailId" label="Email"/>
	<s:textfield name="contact.cellNo" label="Cell No."/>
	<!--<s:textfield name="contact.website" label="Homepage"/>-->
	<s:textfield name="contact.birthDate" label="Birthdate"/>
	<s:textfield name="contact.address.city" label="Add.city"/>
	<s:textfield name="contact.address.state" label="Add.state"/>
	<s:submit value="Add Contact" align="center"/>
</s:form>
<h2>Contacts</h2>
 <table> 
 <tr> 
 <th>Name</th> <th>Email</th> <th>Cell No.</th> <th>Birthdate</th> 
  <th>Delete</th> </tr> <s:iterator value="contactList" var="contact"> <tr> <td>
  <s:property value="lastName"/>, <s:property value="firstName"/> </td>
   <td><s:property value="emailId"/></td> <td><s:property value="cellNo"/></td>
    <td><s:property value="birthDate"/></td> <td><s:property value="address.city"/></td> 
    <td><s:property value="address.state"/></td>
    <!--  <td><a href="<s:property value="website"/>">link</a></td> -->
    <td><a href="delete?id=<s:property value="id"/>">delete</a></td> </tr>
     </s:iterator> </table> </body> </html>