package com.example.personcrud.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.personcrud.models.Customer;
import com.example.personcrud.models.Persons;

import jakarta.validation.Valid;



@Controller
public class LoginController {
	
	public List<Persons> persons = new ArrayList<>();
	
	public LoginController() {
		Persons p1 = new Persons("1","anil","Hyd");
		Persons p2 = new Persons("2","sunil","Chn");
		Persons p3 = new Persons("3","kamal","Blr");
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
	}
	
	@PostMapping("/postData")
	/*public String postData(Model model,@RequestParam("id")String id,
	@RequestParam("name")String name, @RequestParam("city") String city)
	*/
	 public String postData(
	            @Valid @ModelAttribute("person") Persons person,
	            BindingResult theBindingResult, Model model) 

	{
		
		 if (theBindingResult.hasErrors()) {
	            return "addform";
	        }
	        else {
	            
		//Persons p = new Persons(id,name,city);
		persons.add(person);
		model.addAttribute("persons", persons);
	        }
		return "demo";
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("person", new Persons());

        return "addform";
	}
	
	
	
	@GetMapping("/searchData")
	public String searchData(Model model, @RequestParam("lid") String lid) {
		
		List<Persons> prs = persons.stream()
				
				.filter(p -> p.id.equals(lid))
				.map(p->p).collect(Collectors.toList());
		
		model.addAttribute("persons", prs);
		return "searchdisplay";
	}
	
	@GetMapping("/search")
	public String searchData() {
		
		return "search";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/display")
	public String demo(Model model) {
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
