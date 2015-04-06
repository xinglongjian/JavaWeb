package com.xinglongjian.valves;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.catalina.Valve;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.ValveBase;

public class SimpleLoggingValve extends ValveBase {

	@Override
	public void invoke(Request request, Response response) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		String remoteAddress=request.getRemoteAddr();
		String requestUri=request.getRequestURI();
		
		System.out.println("URI"+requestUri+" accessed from remote address:"+remoteAddress);
		
		Valve nextValve=getNext();
		if(nextValve!=null)
			nextValve.invoke(request, response);

	}

}
