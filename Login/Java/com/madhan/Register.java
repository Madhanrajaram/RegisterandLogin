package com.madhan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String uname1=request.getParameter("uname2");
		String upwd1=request.getParameter("upwd2");
		String umail1=request.getParameter("umail");
		User u=new User(uname1,upwd1,umail1);
		Userdb ud=new Userdb();
		String result=ud.insert(u);
		out.println(result);
		out.println("<html><body>");
		out.println("<br><br><br>");
		out.println("<form action=index.jsp method=post>");
		out.println("<input type=submit value= BacktoLoginpage>");
		out.println("</form></body></html>");
	}

}
