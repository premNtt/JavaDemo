<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>   
<%
    session=request.getSession(false);
    if(session.getAttribute("username")== null )
    {
        response.sendRedirect("login.jsp");
    }	
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome !!!</title>
<link rel="stylesheet" href="css/style.css" type="text/css">

</head>
<body>
<div class="Wrapper">
<header>
<h1>Header area</h1>
<a href="LogoutServlet">Logout</a>|  
</header>
  
<nav>
  <ul>
    <li><a href="#">link A <%=session.getAttribute("username")%></a></li>
    <li><a href="#">line B</a></li>
    <li><a href="#">line C</a></li>
  </ul>
</nav>
