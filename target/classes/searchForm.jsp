<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Document Analyzer</title>
<link rel="stylesheet"
type="text/css"
href="<c:url value="/resources/style.css" />" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<h1>Search</h1>
	<form method="POST">
		First Name: <input type="text" name="firstName" /><br/>
		Last Name: <input type="text" name="lastName" /><br/>
		Username: <input type="text" name="username" /><br/>
		Password: <input type="password" name="password" /><br/>
		<input type="submit" value="Search" />
		
	</form>
	
	<sf:form method="POST" commandName="searchQueryObject">
		<sf:errors path="*" element="div" cssClass="errors" />
		<sf:label path="queryTerm" cssErrorClass="error">Search For</sf:label>:<sf:input path="queryTerm" />
 
		Query Type: <sf:input path="queryType" /><%-- <sf:errors cssClass="error" path="queryType" /><br/> --%>
		<input type="submit" value="Search" />
	</sf:form>
	

	
</body>
</html>