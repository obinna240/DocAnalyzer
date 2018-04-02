<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<h1><s:message code="analyzer.welcome" /></h1>
	<a href="<s:url value="/docs" />">Documents</a> |
	<a href="<s:url value="/docCreator/register" />">Register</a>
	<a href="<s:url value="/doumentHistory" />">See Document History</a>
	<a href="<s:url value="/documentObject" />">See Document Objects</a>
</body>
</html>