<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<c:set var="documentObjects" value="${documentObjectList}" />
	<c:forEach items="${documentObjects}" var="dobs">
		<li id="documentObject_<c:out value="dobs.docId"/>">
			<div class="documentObjects">
				<c:out value="${dobs.objectID}" />
			</div>
			<div>
				<span class="creationTime"><c:out value="${dobs.creationTime}" /></span>
				<span class="fileLocation">
				(<c:out value="${dobs.fileLocation}" />,
				<c:out value="${dobs.docSize}" />)</span>
			</div>
			<div>
				<c:out value="${dobs.fileName}" />
			</div>
		</li>
	</c:forEach>
</body>
</html>