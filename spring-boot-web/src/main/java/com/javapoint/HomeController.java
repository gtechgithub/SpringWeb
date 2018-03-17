package com.javapoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		
		ModelAndView  model =  new ModelAndView();
		model.addObject("title","spring security home page");
		model.addObject("message","this is the welcome page!!");
		model.setViewName("welcome");
		return model;
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		
		ModelAndView  model =  new ModelAndView();
		model.addObject("title","spring security admin page");
		model.addObject("message", "This is protected page!");		
		model.setViewName("admin");
		
		
		return model;
	}

}
