<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>

	<%
	String name = (String) request.getAttribute("name");
	List<String> friends = (List<String>) request.getAttribute("frnd");
	%>

	<h1>This is home page</h1>
	<h3>Called by home controller</h3>
	<h4>url - /home</h4>

	<h1>
		My name is
		<%=name%></h1>

	<h1>My friends list</h1>
	<%
	for (String f : friends) {
	%>

	<h1><%=f%></h1>
	<%}%>
</body>
</html>