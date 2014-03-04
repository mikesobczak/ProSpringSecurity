package com.apress.pss.terrormovies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public interface AdminController {

	@RequestMapping(method = RequestMethod.POST, value = "/movies")
	@ResponseBody
	public abstract String createMovie(@RequestBody String movie);
	
	@RequestMapping(method = RequestMethod.GET, value = "/movies")
	@ResponseBody
	public abstract String createMovie();
	
}

