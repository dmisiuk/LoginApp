<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="by.minsler.web.dto.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successful login</title>
</head>
<body>
<h2>Successful login</h2>

<jsp:useBean id="user" class="by.minsler.web.dto.User" scope="session"></jsp:useBean>
Hello <jsp:getProperty property="userName" name="user"/>
</body>
</html>