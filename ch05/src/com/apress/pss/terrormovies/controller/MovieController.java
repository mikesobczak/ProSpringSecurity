package com.apress.pss.terrormovies.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.apress.pss.terrormovies.model.Movie;
import com.apress.pss.terrormovies.service.MoviesService;

@Controller
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private MoviesService moviesService;
	
	private Map<Integer, String[]> likedMovies;
	
	public MovieController(){
		likedMovies = new HashMap<Integer, String[]>();
		likedMovies.put(1, new String[]{"Die Hard", "Lethal Weapon"});
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{name}")
	@ResponseBody
	public String getMovieByName(@PathVariable String name)
	{
		System.out.println ( "movie: " + name );
		
		Movie movie = moviesService.getMovieByName(name);
		
		return "<html><body>" + movie.toString() + "</body></html>";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/new")
	public String showForm()
	{
		return "newMovies";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/new")
	public String showForm(@RequestParam String csvMovies)
	{
		String [] movies = csvMovies.split(",");
		moviesService.addNewMovies(new ArrayList<String>(Arrays.asList(movies)));
		return "newMovies";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public ModelAndView getAllMovies()
	{
		ModelAndView mv = new ModelAndView("allMovies");
		mv.addObject("movies", moviesService.getAllMovies());
		return mv;
	}
	
}
