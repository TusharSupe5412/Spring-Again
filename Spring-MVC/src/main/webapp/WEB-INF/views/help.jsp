<%@page import="com.mvc.beans.StudentBean"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
	<%
	String name = (String)request.getAttribute("name");
	Integer RollNo = (Integer)request.getAttribute("RollNo");
	LocalDateTime now = (LocalDateTime)request.getAttribute("time");
	StudentBean bean = (StudentBean)request.getAttribute("details");
	%>
	
	<h1>We are here for help</h1>
	<h2>My name is <%= name %></h2>
	<h3>Roll no: <%=RollNo %></h3>
	<h4>Current time : <%=now.toString() %></h4>
	<h2>Students Details:</h2>
	<h4>Id : <%=bean.getId().toString() %></h4>
	<h4>name : <%=bean.getName().toUpperCase().toString() %></h4>
	<h4>Phones : <%=bean.getPhones().toString() %></h4>
	
	
</body>
</html>