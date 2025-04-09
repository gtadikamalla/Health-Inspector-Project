package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dregister.dao.regvsave;
import jakarta.validation.Valid;

import com.mfrp.model.registrationModel;

@Controller
@ComponentScan("com.dregister.dao")
public class userRegistrationController {
	
	@Autowired
	public regvsave regvsavee;
	
	@PostMapping("/addUserDetail1")
	public String addUserDetail(@ModelAttribute("username") registrationModel user, BindingResult result, Model model) {

		if (!user.getPassword().equals(user.getConfirm_password())) {
			result.rejectValue("confirmPassword", "error.confirmPassword", "Passwords do not match.");
		}

		// If there are validation errors, return to the registration page
		if (result.hasErrors()) {
			return "user-registration"; // Replace with the name of your registration page template
		}
		
		String result_page=null;	
		String insertUserDetails = regvsavee.userDetails(user);
		System.out.println("-->" +insertUserDetails);
		List<registrationModel> li = regvsavee.getSinglePatientDetails(user.getFirst_name(),user.getCategory());
		registrationModel dispUser = li.get(li.size()-1);
		model.addAttribute("user", dispUser);
		model.addAttribute("insertion_error", insertUserDetails);
		if (insertUserDetails.equals("Inserted successfully")) {
			result_page = "display-page";
		} 
		else{
			result_page="existed-user";
		}
		return result_page;
	}
	
	
	
		  
		
		
	
	
	@GetMapping("/DoctorDetails")
	public  ModelAndView getAllDoctorDetail(ModelAndView model) {
		List<registrationModel> allDoctorDetails =regvsavee.getDoctorDetails();
		System.out.println(allDoctorDetails);
		model.addObject("userlist", allDoctorDetails);
		model.setViewName("doctor-list-all");
		return model;

	}	
	@GetMapping("/PatientDetails")
	public  ModelAndView getAllPatientDetail(ModelAndView model) {
		List<registrationModel> allPatientDetails =regvsavee.getPatientDetails();
		System.out.println(allPatientDetails);
		model.addObject("userlist", allPatientDetails);
		model.setViewName("patient-list-all");
		return model;

	}	
	
	
		
		
		
	}


