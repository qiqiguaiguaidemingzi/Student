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
	<center>
		<form action="student/InputStudentInfoServlet" method="post">
			<table bgcolor="c0c0c0" width="50%" border="1px" cellspacing="0" >
				<tr>
					<td align="center" bgcolor="green" colspan="2">录入信息</td>
				</tr>
				<tr>
					<td>姓名：</td>
					<td><input type="text" name="name" style="font-size: 20px;"/></td>
				</tr>
				<tr>
					<td>班级：</td>
					<td><input type="text" name="ofClass" style="font-size: 20px;"/></td>
				</tr>
				<tr>
					<td>性别：</td>
					<td><input type="radio" name="sex" checked value="1"/>男&nbsp;&nbsp;&nbsp;
						<input type="radio" name="sex" checked value="0"/>女</td>
				</tr>
				<tr>
			    	<td>出生日期：</td>
			    	<td><input name="birthday" type="text" style="font-size: 20px;" maxlength="10" onclick="new Calendar().show(this);" readonly="readonly"  />
			    	</td>
			    </tr>
			    <tr>
					<td>所学专业：</td>
					<td><select name="major" style="font-size: 20px;">
							<option selected="selected">计算机科学与技术</option>
							<option>通信工程</option>
							<option>电气工程</option>
						</select></td>
				</tr>
			    <tr>
					<td>所学课程：</td>
					<td><select name="courseArray" size="3" multiple="multiple" style="font-size: 20px;">
							<option>计算机导论</option>
							<option>数据结构</option>
							<option>计算机原理</option>
							<option>操作系统</option>
							<option>计算机网络</option>
							<option>大学物理</option>
						</select></td>
				</tr>
				<tr>
					<td>兴趣：</td>
					<td><input type="checkbox" value="music" name="hobbyArray" />听音乐&nbsp;&nbsp;
						<input type="checkbox" value="book" name="hobbyArray" />看书&nbsp;&nbsp;
						<input type="checkbox" value="web" name="hobbyArray" />上网&nbsp;&nbsp;</td>
				</tr>
				<tr>
					<td>备注：</td>
					<td><textarea rows="6" cols="50" name="beizhu"></textarea></td>
				</tr>
				<tr>
					<td align="center" colspan="2">
						<input type="submit" value="提交" />&nbsp;&nbsp;
						<input type="reset" value="重置" /></td>
				</tr>
				</table>
		</form>
	</center>
</body>
</html>