package com.apress.pss.servlets;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReadDB {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping({ "/readDB" })
	@ResponseBody
	public String doGet() {
		
		int temp = jdbcTemplate.queryForInt("select count(*) from USERS");
		System.out.println ("USERS = " + temp);
		return "<html><body>" + "check log" + "</body></html>";
	}

}
