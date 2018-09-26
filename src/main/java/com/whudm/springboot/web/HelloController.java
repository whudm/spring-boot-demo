package com.whudm.springboot.web;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String Hello(Model m) {
		m.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
		return "Hello";
	}

}
