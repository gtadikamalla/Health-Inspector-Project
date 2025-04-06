package com.controller;

import java.util.List;


import jakarta.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dregister.dao.ALDao;
import com.mfrp.model.AloginModel;
import com.mfrp.model.registrationModel;

@Controller
@ComponentScan("com.dregister.dao")
public class adminLoginController {
	
	@Autowired
	public ALDao aldao;
		
		@PostMapping("/admin")
		public ModelAndView adminlogin(@RequestParam("password") String password, @RequestParam("id") int id, ModelAndView model,HttpSession session) {
			
			
			AloginModel adminLoginCheck=aldao.adminLoginCheck(id,password);
			
			session.setAttribute("admin", adminLoginCheck);
			
			if(adminLoginCheck!= null) {
				String str="Login Sucessfull";
				model.addObject("message", str);
				model.setViewName("display-admin-login");
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


