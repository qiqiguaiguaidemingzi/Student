package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.DAO.StudentInfoServer;
import com.model.StudentInfo;

/**
 * Servlet implementation class ModifyOneStudent_ResultServlet
 */
@WebServlet("/student/ModifyOneStudent_ResultServlet")
public class ModifyOneStudent_ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyOneStudent_ResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String ofClass= request.getParameter("ofClass");
		int sex = Integer.parseInt(request.getParameter("sex"));
		String birthday = request.getParameter("birthday");
		String major = request.getParameter("major");
		String[] courseArray = request.getParameterValues("courseArray");
		String[] hobbyArray = request.getParameterValues("hobbyArray");
		String beizhu = request.getParameter("beizhu");
		StudentInfo s = new StudentInfo();
		s.setId(id);
		s.setName(name);
		s.setOfClass(ofClass);
		s.setSex(sex);
		s.setBirthday(birthday);
		if(birthday.equals("")||birthday.equals("null"))
			s.setBirthday(null);
		s.setMajor(major);
		s.setCourseArray(courseArray);
		s.setHobbyArray(hobbyArray);
		s.setBeizhu(beizhu);
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		if(new StudentInfoServer().updateStudent(s)){
			out.print("成功修改该学生的信息                  ");
		}else{
			out.print("操作失败！！！                            ");
		}
	}

}
