package com.apress.pss.servlets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = -7108628936470886786L;
	
	@WebServlet(urlPatterns={"/hello"})
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			response.getWriter().write("Hello World");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	*/
@Controller
public class HelloWorldServlet {

	@RequestMapping({ "/hello" })
	public ModelAndView doGet() {
		ModelAndView mv = new ModelAndView("hello");
		return mv;
	}

}
