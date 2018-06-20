<%@page import="com.model.UserTable"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String path = request.getContextPath();
	UserTable user = (UserTable)request.getSession().getAttribute("user");
	if(user == null){
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
%>