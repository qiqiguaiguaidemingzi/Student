package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jdbc.DAO.StudentInfoServer;
import com.model.StudentInfo;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class QueryAllServlet
 */
@WebServlet("/student/QueryAllServlet")
public class QueryAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryAllServlet() {
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
		String id = request.getParameter("id");
		List<StudentInfo> s = new StudentInfoServer().queryAllStudent();
		//response.getWriter().write(JSONArray.fromObject(s).toString());
		//HttpSession session = request.getSession();
		//session.setAttribute("studentList", s);
		request.setAttribute("studentList", s);
		if(id.equals("query"))
			//response.sendRedirect("../displayInfo.jsp");
			request.getRequestDispatcher("../displayInfo.jsp").forward(request, response);
		if(id.equals("modify"))
			//response.sendRedirect("../modifyInfo.jsp");
			request.getRequestDispatcher("../modifyInfo.jsp").forward(request, response);
		if(id.equals("delete"))
			//response.sendRedirect("../deleteInfo.jsp");
			request.getRequestDispatcher("../deleteInfo.jsp").forward(request, response);
	}

}
