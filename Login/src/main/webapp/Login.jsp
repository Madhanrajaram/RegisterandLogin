<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<%
HttpSession one=request.getSession();
if(one.getAttribute("name").equals(null))
{
response.sendRedirect("index.jsp");
}
response.setHeader("cache-control","no-cache,no-store,must-revalidate");
String s=one.getAttribute("name").toString();
out.println("Welcome  "+s);
%>
<br>
<br>
<img src="https://miro.medium.com/max/3960/0*HICLyAdNSIyT0ODU.jpg" alt="300" height="180"/>
<br>
<br>
<br>
<br>
<form action="Logout" method="post">
<input type="submit" value="Logout">
</form>

</body>
</html>