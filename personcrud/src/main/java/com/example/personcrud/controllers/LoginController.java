package com.example.personcrud.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.personcrud.models.Persons;



@Controller
public class LoginController {
	
	@RequestMapping(method=RequestMethod.GET,value="/display")
	public String demo(Model model) {
		Persons p1 = new Persons("1","anil","Hyd");
		Persons p2 = new Persons("2","sunil","Chn");
		Persons p3 = new Persons("3","kamal","Blr");
		List<Persons> persons = Arrays.asList(p1,p2,p3);
		model.addAttribute("persons", persons);
		return "demo";
	}
	
	@GetMapping("/")
	public String loginpage() {
		return "login";
	}
	
	@PostMapping("/validate")
	//public String validate(HttpServletRequest request) {
		public ModelAndView validate(@RequestParam(value="lid", defaultValue="admin", required=true) String username, 
				@RequestParam("pwd") String  passwd) {
		//String username = request.getParameter("lid");
		//String passwd = request.getParameter("pwd");
		if(username.equals("admin") && passwd.equals("admin"))
			return new ModelAndView("success");
		else
			return new ModelAndView("login");
	}

}
