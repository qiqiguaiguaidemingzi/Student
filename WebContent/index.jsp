<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/Style.css">
</head>
<body>
	欢迎来到登录界面<br />
	<form action="user/loginServlet" name="login" method="post">
	<center>
		<table>
		<tr>
			<td>用户名</td><td><input type="text" name="username" /></td>
		</tr>
		<tr>
			<td>密   码</td><td><input type="text" name="password" /></td>
		</tr>
		</table>
		
			<input type="submit" value="登录" />
			<input type="button" value="注册" />
		</center>
	</form>
</body>
</html>