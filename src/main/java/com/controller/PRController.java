package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dregister.dao.Pdao;
import com.mfrp.model.Pregister;

@Controller
@ComponentScan("com.dregister.dao")
public class PRController {
	
	@Autowired
	public Pdao pdao;
	
	@PostMapping("/postPatientDetails")
	public String postPatientDetails(@ModelAttribute("patientdetails") Pregister user, Model model) {
		
		
		System.out.println("->" + user);
		boolean patientDetails = pdao.patientDetails(user);
		
		System.out.println("-->" + patientDetails);
		
		if(patientDetails)
		 {
			model.addAttribute("message", "New User Created Successfully");
			return "display-page";
		}
		return "error-page";
		
	}
		
		
		
	}
	


