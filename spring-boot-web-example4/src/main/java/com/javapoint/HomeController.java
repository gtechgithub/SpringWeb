package com.javapoint;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	private EmployeeValidator validator;
	
	@RequestMapping(value="submit", method=RequestMethod.GET)
	public String submitSetupForm(Model model) {
		
		System.out.print("inside submit setup form");
		Employee emp = new Employee();
		model.addAttribute("employee", emp);
		return "submit";
	}

	
	@RequestMapping(value="submit", method=RequestMethod.POST)
	public String submitEmployee(@ModelAttribute("employee") Employee employee, BindingResult result) {
		
		validator.validate(employee, result);
		
		if (result.hasErrors()) {
			return "submit?error"; 
		}
		return "submit?success";
	}
}
