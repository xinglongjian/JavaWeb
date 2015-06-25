package com.xinglongjian.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.net.spi.nameservice.dns.DNSNameService;

public class HelloWorldServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private String message;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		this.message=config.getInitParameter("message");
		System.out.println("helloword init");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext sc=getServletContext();
		sc.setAttribute("foo", "23222");
		System.out.println("dddddddddddd");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>"+this.message.toString()+"</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello  World</h1>");
		out.println("<h2>"+sc.getAttribute("foo")+"</h2>");
		out.println("<h2>"+this.message.getClass().getClassLoader()+"</h2>");
		out.println("<h2>DNSNameService:"+DNSNameService.class.getClassLoader()+"</h2>");
		out.println("<h2>ServletContext:"+ServletContext.class.getClassLoader()+"</h2>");
		out.println("<h2>AnnotationServlet:"+AnnotationServlet.class.getClassLoader()+"</h2>");
		out.println("<h2>getServletInfo:"+this.getServletInfo()+"</h2>");
		out.println("<h2>getServletName:"+this.getServletName()+"</h2>");
		out.println("<h2>getInitParameterNames:"+this.getInitParameterNames().toString()+"</h2>");
		out.println("<h2>getServletConfig:"+this.getServletConfig()+"</h2>");
		out.println("<h2>getServletContext:"+this.getServletContext().getContextPath()+"</h2>");
		out.println("<h2>getInitParameter:"+this.getInitParameter("message")+"</h2>");
		out.println("</body>");
		out.println("</html>");
	}

}
