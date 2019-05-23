package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class RegistrationController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
  public ModelAndView showRegister(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		
		System.out.println("in controller");
		 
		/*
		 * ModelAndView mav = new ModelAndView("register"); mav.addObject("user", new
		 * Object()); return mav;
		 */
    String message = "Welcome to Spring MVC!";
    
    ModelAndView mv = new ModelAndView("welcome");
	mv.addObject("message", message);
	//mv.addObject("name", name);
	return mv;
	
  }
	/*
	 * @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	 * public ModelAndView addUser(HttpServletRequest request, HttpServletResponse
	 * response,
	 * 
	 * @ModelAttribute("user") User user) { //userService.register(user); return new
	 * ModelAndView("welcome", "firstname", user.getFirstname()); }
	 */
}