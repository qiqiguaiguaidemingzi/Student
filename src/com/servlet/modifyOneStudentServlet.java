package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jdbc.DAO.StudentInfoServer;
import com.model.StudentInfo;

/**
 * Servlet implementation class modifyOneStudentServlet
 */
@WebServlet("/student/modifyOneStudentServlet")
public class modifyOneStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifyOneStudentServlet() {
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
		StudentInfo s = new StudentInfoServer().queryStudentById(id);
		//HttpSession session = request.getSession();
		//session.setAttribute("student", s);
		request.setAttribute("student", s);
		//response.sendRedirect("../modifyOneStudent.jsp");
		request.getRequestDispatcher("../modifyOneStudent.jsp").forward(request, response);
	}

}
