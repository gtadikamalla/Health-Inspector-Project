package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dregister.dao.appointmentDao;
import com.mfrp.model.appointmentModel;
import com.mfrp.model.clinicModel;
import com.mfrp.model.registrationModel;

@Controller
@ComponentScan("com.dregister.dao")
public class appointmentControllers {
	
	@Autowired
	public appointmentDao appointmentdao;
	
		@PostMapping("/appointmentDetails")
		public String appointment(@ModelAttribute("username") appointmentModel user,Model model ) {
			System.out.println("->" + user);
			boolean appointmentDetails = appointmentdao.appointmentDetail(user);
			
			System.out.println("-->" + appointmentDetails);
			
			List<appointmentModel> li = appointmentdao.getappointmentid(user.getPatient_name());
			appointmentModel dispUser = li.get(li.size()-1);
			model.addAttribute("user", dispUser);
			
			if(appointmentDetails)
			 {
				model.addAttribute("message", "Thank You :) ");
				return "appointmentSucess";
			}
			return "error-page";
			
		}
		@GetMapping("/appointments")
		public ModelAndView ListlocalityClinic(@RequestParam("clinic_id") int clinic_id,  ModelAndView model) {
			List<appointmentModel> listappointment = appointmentdao.getLocalityAppointmentDetails(clinic_id); 
			System.out.println(listappointment);
			model.addObject("listappointment", listappointment);
			model.setViewName("appointmentlist");
			return model;
		}
		
		@RequestMapping(value="/acceptstatus", method = RequestMethod.GET)
		public String approveUser(@RequestParam String appointment_id ){
			boolean approveUser= appointmentdao.approveUser(appointment_id);
			if (approveUser) {
				return "appointmentlist";
			}
			return "appointmentlist";
		}
		@RequestMapping(value="/rejectstatus", method = RequestMethod.GET)
		public String rejectUser(@RequestParam String appointment_id ){
			boolean rejectUser= appointmentdao.rejectUser(appointment_id);
			if (rejectUser) {
				return "appointmentlist";
			}
			return "appointmentlist";
		}
		
		@GetMapping("/getAppointmentStatustDetails")
		public ModelAndView ListStatusAppointment(@RequestParam("appointment_id") int appointment_id, ModelAndView model) {
			List<appointmentModel> statusappointment = appointmentdao.getAppointmentStatustDetails(appointment_id); 
			System.out.println(statusappointment);
			model.addObject("statusappointment", statusappointment);
			model.setViewName("AppointmentStatus");
			return model;
		}
		
		
		}
	


