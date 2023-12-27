package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dregister.dao.clinicDao;
import com.mfrp.model.clinicModel;
import com.mfrp.model.registrationModel;

@Controller
@ComponentScan("com.dregister.dao")
public class clinicController {

	@Autowired
	public clinicDao clinicdao;
	

	@PostMapping("/PostClinicDetails")
	public String addClinic(@ModelAttribute("clinicdetails") clinicModel user, Model model) {
		System.out.println("->" + user);
		boolean clinicDetailsAdded = clinicdao.clinicDetails(user);

		System.out.println("-->" + clinicDetailsAdded);
		
		List<clinicModel> li = clinicdao.getClinicId(user.getClinic_name(),user.getAvailability());
		clinicModel disp = li.get(li.size()-1);
		model.addAttribute("user", disp);

		if (clinicDetailsAdded) {
			model.addAttribute("message", "New User Created Successfully");
			model.addAttribute("clinicDetailsAdded", user);
			return "clinicSucess";
		}
		return "error-page";
	}

	@GetMapping("/AvailabilityDoctors")
	public ModelAndView getDoctorDetail(@RequestParam("locality") String locality, ModelAndView model) {
		System.out.println("-->" + locality);
		List<clinicModel> availabilityDoctors = clinicdao.availabilityDoctors(locality);
		System.out.println("-->" + availabilityDoctors);
		model.addObject("list", availabilityDoctors);
		model.setViewName("availability-doctors");
		return model;

	}
	@GetMapping("/SpecalityDoctors")
	public ModelAndView getSpecalityDetail(@RequestParam("speciality") String speciality, ModelAndView model) {
		System.out.println("-->" + speciality );
		List<clinicModel> specalityDoctors = clinicdao.specalityDoctors(speciality);
		System.out.println("-->" + specalityDoctors);
		model.addObject("list", specalityDoctors);
		model.setViewName("specality-doctors");
		return model;

	}
	

}
