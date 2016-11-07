package it.alfasoft.francesca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrimoTestController {
	
	@RequestMapping("/primo.php")
	public ModelAndView ilMiotodoPrimo(){
		
		ModelAndView model=new ModelAndView("primoEsempio/TestView1");
		
		model.addObject("msg", "benvenuto !!!");
		
		return model;
		
	}

}
