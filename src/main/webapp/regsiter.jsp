<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
<h2><b>User Register Form</b></h2>
<table>
<tr>
<td>User name</td>
<td><input type="text" name="userName"></td>
<td>Email </td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>Address</td>
<td><input type="textarea" name="address"></td>
<td>mobile No. </td>
<td><input type="text" name="mobileNo"></td>
</tr>
<tr>
<td>Topic</td>
<td><input type="checkbox" name="topic1">java</td>
<td><input type="checkbox" name="topic2">python</td>
<td><input type="checkbox" name="topic3">Angular</td>
</tr>
<tr>
<td>register Date</td>
<td><input type="text" name="registerDate"></td>
<td>Parent mail. </td>
<td><input type="text" name="pmailId"></td>
<tr><td><input type="submit">Register User</td></tr>
</tr>
</table>
</form>
</body>
</html>