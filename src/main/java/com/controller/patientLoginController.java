package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dregister.dao.PLDao;
import com.mfrp.model.PloginModel;

@Controller
@ComponentScan("com.dregister.dao")
public class patientLoginController {

	@Autowired	
	public PLDao Pldao;
	
	@GetMapping("/patientlogin")
	public ModelAndView patientlogin(@RequestParam("password") String password, @RequestParam("id") int id, ModelAndView model) {
		
		PloginModel patientLoginCheck= Pldao.patientLoginCheck(id,password);
		
		if(patientLoginCheck!=null) {
			
			String str="Login Sucessfull";
			model.addObject("message", str);
			model.setViewName("display-patient-login");
		}
		else
		{
			String str="Login UnSucessfull";
			model.addObject("message",str);
			model.setViewName("admin-error");
		}
		
		return model;
		
	}
		
		
	
}
