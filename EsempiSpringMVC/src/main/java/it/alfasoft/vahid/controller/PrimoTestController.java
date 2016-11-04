package it.alfasoft.vahid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrimoTestController {
	
	@RequestMapping("/primo")
	public ModelAndView ilMiotodoPrimo(){
		
		ModelAndView model=new ModelAndView("TestView1");
		return model;
		
	}

}
