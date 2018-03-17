package com.javapoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	
	@RequestMapping(value= {"/","submit"},method=RequestMethod.GET)
	public String submitshowform(){
		return "submit";
	}
}
