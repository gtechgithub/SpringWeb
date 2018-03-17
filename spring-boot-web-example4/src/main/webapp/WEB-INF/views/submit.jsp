<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="type/stylesheet" href="/css/stylesheet.css"> </link>
<title>submit form</title>
</head>
<body>
	<form:form action="post" modelAttribute="employee">
	  <table>
	  	<tr>
	  		<td> <spring:message code="lbl.firstName" text="First Name"></spring:message> </td>
	  		<td> <form:input path="firstName"/> </td>
	  		<td> <form:errors path="firstName" cssClass="error"> </form:errors></td>
	  	</tr>

	  	<tr>
	  		<td> <spring:message code="lbl.lastName" text="Last Name"></spring:message> </td>
	  		<td> <form:input path="lastName"/> </td>
	  		<td> <form:errors path="lastName" cssClass="error"> </form:errors></td>
	  	</tr>

	  	<tr>
	  		<td> <spring:message code="lbl.email" text="Email"></spring:message> </td>
	  		<td> <form:input path="email"/> </td>
	  		<td> <form:errors path="email" cssClass="error"> </form:errors></td>
	  	</tr>
	  	
	  	<tr>
	  		<td> <form:button name="submit" value="submit"/> </td>
	  	</tr>
	  	
	  </table>
	
	</form:form>

</body>
</html>