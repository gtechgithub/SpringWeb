package com.javapoint;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("Employee")
public class HomeController {

	 /**
	   * This creates a new address object for the empty form and stuffs it into
	   * the model
	   */
	  @ModelAttribute("Employee")
	  public Employee populateUser() {
		System.out.println("Inside the model attribute populateUser");
		Employee emp = new Employee();
	    return emp;
	  }


	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping(value="/createEmployee", method=RequestMethod.GET)
	public ModelAndView createEmployeeMethod() {

		populateUser();
		ModelAndView model = new ModelAndView();
		model.setViewName("createEmployee");
		return model;
	}

	//URI should be : createEmployee/creating?param1=all
	@RequestMapping(value="/createEmployee/{creating}", method=RequestMethod.POST)
	public ModelAndView createEmployeeMethod(@PathVariable(value="creating" , required = true) String creatingPathVariable,
			                                 @RequestParam(value="param1" , required =  true) String param1RequestParam,
			                                 @ModelAttribute("Employee") Employee emp) {

		if(emp.getId() > 1) {
			System.out.println("id is created");
		}
		
		ModelAndView model = new ModelAndView();
		model.setViewName("successEmployee");
		model.addObject("message", "employee successfully added");
		return model;
	}
	
	@RequestMapping(value="/showEmployee", method=RequestMethod.GET)
	public ModelAndView showEmployeeMethod(@SessionAttribute("Employee") Employee emp) {

		ModelAndView model = new ModelAndView();
		model.setViewName("showEmployee");
		return model;
	}

	
	
}
