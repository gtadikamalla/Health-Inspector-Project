package com.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mfrp.model.Pregister;
import com.mfrp.model.appointmentModel;
import com.mfrp.model.clinicModel;
import com.mfrp.model.issue;
import com.mfrp.model.prescriptionModel;
import com.mfrp.model.registrationModel;

@Controller
public class homeController {

	@RequestMapping("/")
	public String gethomepage() {
		return "index";
	}

	@RequestMapping("/AdminLogin")
	public String getadminpage() {
		return "adlogin";

	}

	@RequestMapping("/reportForm")
	public ModelAndView getreportform(ModelAndView model, @ModelAttribute("issue") issue issue) {

		model.setViewName("report_form");
		return model;
	}

	@RequestMapping("/PatientLogin")
	public String getpatientpage() {
		return "palogin";

	}

	@RequestMapping("/userlogin")
	public String getdoctorlogin() {
		return "dologin";
	}

	@RequestMapping("/NewUserRegistration")
	public ModelAndView getDoctorRegistration(ModelAndView model,
			@ModelAttribute("username") registrationModel dregister) {
		List<String> gender = Arrays.asList("Male", "Female");
		model.addObject("genderOne", gender);
		model.setViewName("user-registration");
		return model;
	}

	@RequestMapping("/addClinicDetails")
	public ModelAndView getClinicDetails(ModelAndView model, @ModelAttribute("clinicdetails") clinicModel clinicmodel) {

		List<String> professionList = Arrays.asList("Surgeon", "Pharmacy", "Psychiatrist", "Cardiologist",
				"Dermatologist");

		model.addObject("professionList", professionList);

		model.setViewName("add-clinic-details");
		return model;

	}

	@RequestMapping("/appointmentbooking")
	public ModelAndView appointmentBooking(ModelAndView model, @ModelAttribute("username") appointmentModel dregister) {

		model.setViewName("appointmentForm");
		return model;
	}

	@RequestMapping("/prescription")
	public ModelAndView getPrescription(ModelAndView model,
			@ModelAttribute("PrescriptionDetails") prescriptionModel Prescription) {

		model.setViewName("prescriptionForm");
		return model;
	}

	@RequestMapping("/searchstatus")
	public String getstatuslist() {
		return "searchstatus";
	}

	@RequestMapping("/postResolution/{id}")
	public ModelAndView resolution(ModelAndView model,@PathVariable("id") int id,
			@ModelAttribute("user") issue issuess) {
		model.addObject("id", id);
		model.setViewName("resolution_form");
		return model;
	}
	
	
}
