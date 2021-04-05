package com.madhan;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class RegisterFilter
 */
public class RegisterFilter implements Filter {

    /**
     * Default constructor. 
     */
    public RegisterFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		String uname=request.getParameter("uname2");
		String umail=request.getParameter("umail");
		String upwd=request.getParameter("upwd2");
		String upwd2=request.getParameter("upwd3");
		int len=uname.length();
		int len1=umail.length();
		if((len>=5&&len<=15)&&upwd.equals(upwd2)||(len1>=7&&len1<=15))
		{		
			chain.doFilter(request, response);
		}
		else {
			HttpServletResponse res=(HttpServletResponse)response;
			res.sendRedirect("Register.jsp");
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
