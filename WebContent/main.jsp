<%@page import="com.model.UserTable"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
html,body{ height:100%;}
a{text-decoration:none;margin:40px;line-height:40px;}
a:hover { color:red; }
</style>
</head>
<jsp:include page="islogin.jsp"></jsp:include>
<body>
	<% UserTable user = (UserTable)session.getAttribute("user"); %>
	 <table border="1" style="width:100%;height:100%">
        <tr height="15%">
            <td style="text-align:center;" colspan="2"><h1>欢迎来到学生管理系统</h1></td>
        </tr>
        <tr height="70%">
            <td valign="top" style="width:15%;height:100%">
            <% if(user!=null){ %>
            	你好：<%=user.getUsername()%><br /><%} %>
            	
                <a href="student/QueryAllServlet?id=query" target="main_right">查看学生信息</a><br />
                <a href="inputInfo.jsp" target="main_right">录入学生信息</a><br />
                <a href="student/QueryAllServlet?id=modify" target="main_right">修改学生信息</a><br />
                <a href="student/QueryAllServlet?id=delete" target="main_right">删除学生信息</a><br />
                <a href="user/exitServlet">退出登录</a><br />
                
            </td>
            <td valign="top" style="width:85%;height:100%">
                <iframe name="main_right" frameborder="0" width="100%" height="100%" src="student/QueryAllServlet?id=query"></iframe>
            </td>
        </tr>
        <tr height="15%">
            <td style="background-color:blue;text-align:center;font-size:xx-large" colspan="2">版权信息</td>
        </tr>
    </table>
	
</body>
</html>