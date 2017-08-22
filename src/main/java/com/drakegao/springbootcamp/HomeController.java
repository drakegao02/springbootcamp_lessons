package com.drakegao.springbootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/loadform", method = RequestMethod.GET)
	public String loadFormPage() {
		return "formtemplate";
	}
	
	@RequestMapping(value = "/processform")
	public String loadFromPage(@RequestParam("login") String login, Model model) {
		model.addAttribute("loginval", login);
		return "confirm";
	}
}
