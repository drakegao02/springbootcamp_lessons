package com.drakegao.springbootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainControllers {

	@RequestMapping(value = "/")
	public String Index() {
		return "index";
	}
	
	@RequestMapping(value = "/lesson_01", method = RequestMethod.GET)
	public String Lesson_01() {
		return "lesson_01";
	}
	
	@RequestMapping(value = "/lesson_02", method = RequestMethod.GET)
	public String Lesson_02(Model model) {
		model.addAttribute("myVar", "Say hello to the people");
		return "lesson_02";
	}
	
	@RequestMapping(value = "/lesson_03", method = RequestMethod.GET)
	public String Lesson_03() {
		return "lesson_03";
	}
}
