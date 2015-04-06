package com.xinglongjian.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private String message;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		this.message=config.getInitParameter("message");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext sc=getServletContext();
		sc.setAttribute("foo", "2222");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>"+this.message+"</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>HelloWorld</h1>");
		out.print("<h2>"+sc.getAttribute("foo")+"</h2>");
		out.println("</body>");
		out.println("</html>");
	}

}
