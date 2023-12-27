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

import com.dregister.dao.prescriptionDao;
import com.mfrp.model.clinicModel;
import com.mfrp.model.prescriptionModel;

@Controller
@ComponentScan("com.dregister.dao")
public class prescriptionController {
	
	
	@Autowired
	public prescriptionDao daoImpl;
	@PostMapping("/postPrescriptionDetails")
	public String addPrescriptionDetails(@ModelAttribute("prescriptiondetails") prescriptionModel user, Model model) {
		boolean insertprescriptionDetails = daoImpl.insertPrescriptionDetails(user);

		if (insertprescriptionDetails) {
			return "prescription-Details";
		}
		return "error";
	}
	@GetMapping("/getAllPrescriptionDetails")
	public  ModelAndView getAllPrescriptionDetail(ModelAndView model) {
		List<prescriptionModel> allPrescriptionDetails = daoImpl.getAllPrescriptionDetails();
		System.out.println(allPrescriptionDetails);
		model.addObject("prescriptionlist", allPrescriptionDetails);
		model.setViewName("DisplayPrescription");
		return model;
	}

	
	

}
