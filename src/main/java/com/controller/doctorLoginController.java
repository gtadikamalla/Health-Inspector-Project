package com.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dregister.dao.DLDao;
import com.mfrp.model.registrationModel;


@Controller
@ComponentScan("com.dregister.dao")
public class doctorLoginController {
	
	@Autowired
	public DLDao dldao;
	
	@PostMapping("/doctor")
	public ModelAndView Userregister(@RequestParam("password") String password, @RequestParam("idd") int idd,
			ModelAndView model,HttpSession session) 
{
		registrationModel doctorCheck = dldao.doctorLoginCheck(idd, password);
		session.setAttribute("user",doctorCheck );
		
		if(doctorCheck != null )
		{
					if(doctorCheck.getCategory().equals("doctor"))
					{
								String str="Login Successful";
								model.addObject("message", str);
								model.addObject("doctor", doctorCheck);
								model.setViewName("display-doctor-login");
					}
					else if(doctorCheck.getCategory().equals("patient"))
					{
			
							String str="Login Successful";
							model.addObject("message", str);
							model.addObject("patient", doctorCheck);
							model.setViewName("patienthome");
					}
					
		}			
		else
		{
						String str="Login UNSuccessful";
						model.addObject("message", str);
						model.setViewName("error-page");
		}

		return model;
	}
	

	}
	

