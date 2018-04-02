<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
	<c:set var="documentHistoryList" value="${documentHistoryList}" />
	<c:set var="documentHistory" value="${documentHistory}" />
	<c:forEach items="${documentHistoryList}" var="dobs">
		<li id="documentHistory_<c:out value="dobs.historyID"/>">
			<div class="documentHistory">
				<c:out value="${dobs.fileLocation}" />
			</div>
			<div>
				<span class="sizeOnDisk"><c:out value="${dobs.totalSizeOfHistoryOnDisk}" /></span>
				
			</div>
			<div>
				
				<p>Is Modified: <c:out value="${dobs.isModified}" /></p>
				<p>Date of indexing: <fmt:formatDate value="${dobs.dateOfIndexing}" pattern="yyyy-MM-dd" var="newdatevar" /></p>
				<p>Date Saved: <fmt:formatDate value="${dobs.dateOfSaving}" pattern="yyyy-MM-dd" var="newdatevar" /></p>
			</div>
		</li>
	</c:forEach>
	
	<div class="documentHistory">
				<c:out value="${documentHistory.fileLocation}" />
			</div>
			<div>
				<span class="sizeOnDisk"><c:out value="${documentHistory.totalSizeOfHistoryOnDisk}" /></span>
				
			</div>
			<div>
				
				<p>Is Modified: <c:out value="${documentHistory.isModified}" /></p>
				<p>Date of indexing: <fmt:formatDate value="${documentHistory.dateOfIndexing}" pattern="yyyy-MM-dd" var="newdatevar" /></p>
				<p>Date Saved: <fmt:formatDate value="${documentHistory.dateOfSaving}" pattern="yyyy-MM-dd" var="newdatevar" /></p>
	</div>
	
</body>
</html>