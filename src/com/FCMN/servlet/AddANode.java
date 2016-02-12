package com.FCMN.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.FCMN.service.Functions;

/**
 * Servlet implementation class AddANode
 */
@WebServlet("/AddANode")
public class AddANode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddANode() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("aaaaaaaaa");
		Functions func = new Functions();
		
		String group = request.getParameter("group");
		String connector = request.getParameter("connector");
		String active = request.getParameter("active");
		System.out.println("group "+group+" connector "+connector+" active "+active);
		int i = 3;
		int j = 3;
		if (active.equals("active")) {
			i = 1;
		} else {
			i = 0;
		}
		if (connector.equals("yes")) {
			j = 1;
			;
		} else {
			j = 0;
		}
		int k = func.addANode(group, i, j);//return type is boolean.
		if (k==10010) {
			//flag is true ,add User successfully
			request.getRequestDispatcher("/successful.jsp").forward(request,
					response);

		} else {
			//failed, return error information.
			request.setAttribute("error", "Failed!");
			request.getRequestDispatcher("/addUser.jsp").forward(request,
					response);
		}

	}

}
