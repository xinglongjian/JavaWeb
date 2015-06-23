package com.xinglongjian.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="annotationServlet",
            initParams={@WebInitParam(name="message",value="Annotaion!")},
            urlPatterns={"/anno.html"})
public class AnnotationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
    private String message;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext sc=getServletContext();
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>"+this.message+"</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>"+this.message+"</h1>");
//		out.print("<h2>"+sc.getAttribute("foo")+"</h2>");
		out.println("</body>");
		out.println("</html>");
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		this.message=config.getInitParameter("message");
	}

}
