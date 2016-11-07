package it.alfasoft.francesca.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrazioneFormRequestParamController {
	
	
	@RequestMapping(value="/formCliente.html",method=RequestMethod.GET)
	public ModelAndView chidereForm(){
		
		ModelAndView model=new ModelAndView("RegistrazioneFormRequestParam/FormRegistrazioneClienteRequestParam");
		
		return  model;
	}
	
	
	// prende i parametri uno per uno 
//	@RequestMapping(value="/registraCliente.html",method=RequestMethod.POST)
//	public ModelAndView RegistraForm(@RequestParam("nome") String n,
//			                         @RequestParam("cognome") String cgn,
//			                         @RequestParam("eta") int et
//			                             ){
//		
//		ModelAndView model=new ModelAndView("RegistrazioneFormRequestParam/HomePageCliente");
//		et++;
//		model.addObject("msg", n+" "+cgn+" "+et);
//		
//		return  model;
//	}
	
	// prende tutti parametri che vengno passati e li mette in una mappa
	@RequestMapping(value="/registraCliente.html",method=RequestMethod.POST)
	public ModelAndView RegistraForm(@RequestParam Map<String,String> mappaParametri){
		
		ModelAndView model=new ModelAndView("RegistrazioneFormRequestParam/HomePageCliente");
	    
		String n=mappaParametri.get("nome");
		String cgn=mappaParametri.get("cognome");
		int et = Integer.parseInt(mappaParametri.get("eta"));
		
		model.addObject("msg", n+" "+cgn+" "+et);
		
		return  model;
	}


}
