/**
 * 
 */
package com.packt.patterninspring.chapter10.bankapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.packt.patterninspring.chapter10.bankapp.model.User;

/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home (){
		return "home";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create (){
		return "addUser";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String saveUser (User user, ModelMap model){
		model.put("user", user);
		return "addUser";
	}
}