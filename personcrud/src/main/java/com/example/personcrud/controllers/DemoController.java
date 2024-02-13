package com.example.personcrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class DemoController {
	
	@RequestMapping(value = "/test/{id}")
    public RedirectView handleTestRequest (Model model) {
        model.addAttribute("attr", "attrVal");
        model.addAttribute("testPath", "pathValue");

        RedirectView rv = new RedirectView();
        rv.setContextRelative(true);
        rv.setUrl("/test2/{testPath}/{id}");
        return rv;
    }

    @RequestMapping("test2/{testPath}/{id}")
    public String handleRequest (@PathVariable("testPath") String testPath,
                                 @PathVariable("id") String id,
                                 @RequestParam("attr") String attr,
                                 Model model) {

        model.addAttribute("testPath", testPath);
        model.addAttribute("id", id);
        model.addAttribute("attr", attr);
        return "my-page";
    }

}
