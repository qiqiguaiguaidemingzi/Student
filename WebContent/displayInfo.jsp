<%@page import="com.model.StudentInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="islogin.jsp"></jsp:include>
<body>
	<%
		//List<StudentInfo> s = (List<StudentInfo>)session.getAttribute("studentList");
		List<StudentInfo> s = (List<StudentInfo>)request.getAttribute("studentList");
	%>
	<center>
	<table cellpadding="10">
		<tr>
			<th>id</th><th>姓名</th><th>班级</th><th>性别</th><th>出生日期</th><th>专业</th><th>课程</th><th>爱好</th><th>备注</th>
		</tr>
		<%
			int i=0;
			for(StudentInfo stu : s){
		%>
		<tr  <% if(i%2==0){%> bgcolor="#f0f8ff" <% } %>>
			<td><%=stu.getId() %></td>
			<td><%=stu.getName() %></td>
			<td><%=stu.getOfClass() %></td>
			<td><% if(stu.getSex()==1) out.print("男");else out.print("女"); %></td>
			<td><%=stu.getBirthday() %></td>
			<td><%=stu.getMajor() %></td>
			<td><%=stu.getCourse() %></td>
			<td><%=stu.getHobby() %></td>
			<td><%=stu.getBeizhu() %></td>
		</tr>
		<%
			i++;
			}
		%>
		
	</table>
	</center>
	
</body>
</html>