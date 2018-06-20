<%@page import="com.model.StudentInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>tr{height:50px;}</style>
<script type="text/javascript" src="js/Calendar3.js"></script>
</head>
<jsp:include page="islogin.jsp"></jsp:include>
<body>
	<%  
		//StudentInfo stu = (StudentInfo)session.getAttribute("student");
		StudentInfo stu = (StudentInfo)request.getAttribute("student");
	%>
	<center>
		<form action="student/ModifyOneStudent_ResultServlet" method="post">
			<table bgcolor="c0c0c0" width="50%" border="1px" cellspacing="0" >
				<tr>
					<td align="center" bgcolor="green" colspan="2">录入信息</td>
				</tr>
				<tr>
					<td>姓名：</td>
					<td><input type="text" name="name" style="font-size: 20px;" value="<%=stu.getName() %>"/></td>
				</tr>
				<tr>
					<td>班级：</td>
					<td><input type="text" name="ofClass" style="font-size: 20px;" value="<%=stu.getOfClass() %>"/></td>
				</tr>
				<tr>
					<td>性别：</td>
					<td><input type="radio" name="sex" value="1" <%if(stu.getSex()==1){ %> checked <%} %>/>男&nbsp;&nbsp;&nbsp;
						<input type="radio" name="sex" value="0" <%if(stu.getSex()==0){ %> checked <%} %>/>女</td>
				</tr>
				<tr>
			    	<td>出生日期：</td>
			    	<td><input name="birthday" type="text" style="font-size: 20px;" maxlength="10" onclick="new Calendar().show(this);" readonly="readonly" value="<%=stu.getBirthday() %>" />
			    	</td>
			    </tr>
			    <tr>
					<td>所学专业：</td>
					<td><select name="major" style="font-size: 20px;">
							<option <%if(stu.getMajor().contains("计算机科学与技术")){ %> selected="selected" <%} %>>计算机科学与技术</option>
							<option <%if(stu.getMajor().contains("通信工程")){ %> selected="selected" <%} %>>通信工程</option>
							<option <%if(stu.getMajor().contains("电气工程")){ %> selected="selected" <%} %>>电气工程</option>
						</select></td>
				</tr>
			    <tr>
					<td>所学课程：</td>
					<td><select name="courseArray" size="3" multiple="multiple" style="font-size: 20px;">
							<option <%if(stu.getCourse().contains("计算机导论")){ %> selected="selected" <%} %>>计算机导论</option>
							<option <%if(stu.getCourse().contains("数据结构")){ %> selected="selected" <%} %>>数据结构</option>
							<option <%if(stu.getCourse().contains("计算机原理")){ %> selected="selected" <%} %>>计算机原理</option>
							<option <%if(stu.getCourse().contains("操作系统")){ %> selected="selected" <%} %>>操作系统</option>
							<option <%if(stu.getCourse().contains("计算机网络")){ %> selected="selected" <%} %>>计算机网络</option>
							<option <%if(stu.getCourse().contains("大学物理")){ %> selected="selected" <%} %>>大学物理</option>
						</select></td>
				</tr>
				<tr>
					<td>兴趣：</td>
					<td><input type="checkbox" value="music" name="hobbyArray" <%if(stu.getHobby().contains("music")){ %> checked <%} %> />听音乐&nbsp;&nbsp;
						<input type="checkbox" value="book" name="hobbyArray" <%if(stu.getHobby().contains("book")){ %> checked <%} %> />看书&nbsp;&nbsp;
						<input type="checkbox" value="web" name="hobbyArray" <%if(stu.getHobby().contains("web")){ %> checked <%} %> />上网&nbsp;&nbsp;</td>
				</tr>
				<tr>
					<td>备注：</td>
					<td><textarea rows="6" cols="50" name="beizhu" ><%=stu.getBeizhu() %></textarea></td>
				</tr>
				<tr>
					<td align="center" colspan="2">
						<input type="hidden" name="id" value="<%=stu.getId() %>" />
						<input type="submit" value="提交" />&nbsp;&nbsp;
						<input type="reset" value="重置" /></td>
				</tr>
				</table>
		</form>
	</center>
</body>
</html>