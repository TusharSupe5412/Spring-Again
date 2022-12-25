<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>This is from help jsp</h1>

<%
	String name = (String)request.getAttribute("name");
	LocalDateTime dateTime = (LocalDateTime)request.getAttribute("time");
%>
<h1>My name is <%= name %></h1>

<h2>Current date and time is : dateTime</h2><%= dateTime %>
</body>
</html>