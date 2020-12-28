package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@GetMapping("/")
	public ModelAndView hello(ModelAndView mv) {
		mv.addObject("msg", "hello to spring mvc is chaged done corectly this time");
		System.out.println("sysout is changed by dev1 and dev2, working fine changed again");
		mv.setViewName("hello");
		return mv;
	}
}
