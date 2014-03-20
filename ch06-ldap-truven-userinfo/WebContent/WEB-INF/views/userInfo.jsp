<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Info</title>
</head>
<body>

	<ul>
		<li>cn: ${user.cn}</li>
		<li>description: ${user.description}</li>
		<li>displayName: ${user.displayName }</li>
		<li>postalAddress: ${user.postalAddress }</li>
		<li>postalCode: ${user.postalCode }</li>
		<li>sn: ${user.sn }</li>
		<li>street: ${user.street }</li>
		<li>title: ${user.title}</li>
		<li>username: ${user.username }</li>
	</ul>

</body>
</html>