package com.xinglongjian.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class CustomFilter implements Filter {

	private String contentType;
	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain fc) throws IOException, ServletException {
		// TODO Auto-generated method stub
        HttpServletRequest httpreq=(HttpServletRequest) req;
        System.out.println("CustomFilter.dddddoFilter invoked for requestURI:"+httpreq.getRequestURI());
        res.setContentType(contentType);
        fc.doFilter(req, res);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Filter Destory.");
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.contentType=config.getInitParameter("contentType");
		System.out.println("Filter initialized.");

	}

}
