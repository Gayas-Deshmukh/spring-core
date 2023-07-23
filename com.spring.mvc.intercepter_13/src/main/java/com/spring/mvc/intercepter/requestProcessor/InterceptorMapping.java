package com.spring.mvc.intercepter.requestProcessor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

// Interceptor are use to handle/process the request 

public class InterceptorMapping extends HandlerInterceptorAdapter
{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception 
	{
		// it will executed before controller call
		String parameter = (String)request.getParameter("name");
		
		System.out.println("In Pre Handle....");
		
		if (parameter != null && parameter.startsWith("A"))
		{
			response.setContentType("text/html");
			response.getWriter().print("<h1>Invaid Request.... </h1>");
			return false;
		}
		
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception 
	{
		// it will executed after controller call & before view renders
		System.out.println("In Post Handle....");
		super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception 
	{
		// it will executed after view renders
		System.out.println("After view render....");
		super.afterCompletion(request, response, handler, ex);
	}
}
