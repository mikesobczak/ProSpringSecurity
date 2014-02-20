package com.apress.pss.servlets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldServlet {

	@RequestMapping({ "/hello" })
	public ModelAndView doGet() {
		ModelAndView mv = new ModelAndView("hello");
		return mv;
	}
}
