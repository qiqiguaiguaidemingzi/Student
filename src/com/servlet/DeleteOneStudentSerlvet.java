package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.DAO.StudentInfoServer;

/**
 * Servlet implementation class DeleteOneStudentSerlvet
 */
@WebServlet("/student/DeleteOneStudentSerlvet")
public class DeleteOneStudentSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteOneStudentSerlvet() {
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
		int id = Integer.parseInt(request.getParameter("id"));
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		if(new StudentInfoServer().delectStudent(id)){
			response.sendRedirect("QueryAllServlet?id=delete");
		}else{
			out.print("操作失败！！！                            ");
		}
	}

}
