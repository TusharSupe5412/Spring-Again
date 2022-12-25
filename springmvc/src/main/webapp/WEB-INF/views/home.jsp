<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h3>Called by home controller</h3>
	<h4>url /home</h4>

	<%
	String name = (String) request.getAttribute("name");

	List<String> friends = (List<String>) request.getAttribute("f");
	%>
	<h1>Name is <%=name%></h1>
	
	<%
	 for(String s: friends){
	%>
	<h1><%=s %></h1>
	<%
	} 
	%> 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>