package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dregister.dao.reportDao;
import com.mfrp.model.clinicModel;
import com.mfrp.model.issue;
import com.mfrp.model.registrationModel;

@Controller
@ComponentScan("com.dregister.dao")
public class reportFormController {

	@Autowired
	public reportDao reportdao;

	@PostMapping("/postissue")
	public String addClinic(@ModelAttribute("user") issue user, Model model) {
		System.out.println("->" + user);
		boolean issuee = reportdao.issue(user);

		System.out.println("-->" + issuee);

		List<issue> li = reportdao.getIssueId(user.getIssue());
		issue disp = li.get(li.size() - 1);
		model.addAttribute("user1", disp);

		if (issuee) {
			model.addAttribute("message", "Your report Sucessfully send to Admin ");
			model.addAttribute("clinicDetailsAdded", user);
			return "report_sucess";
		}
		return "error-page";
	}

	@GetMapping("/techincalissues")
	public ModelAndView getIssues(ModelAndView model) {
		List<issue> alltechinalissues = reportdao.getTechnicalIssues();
		System.out.println(alltechinalissues);
		
		model.addObject("issuelist", alltechinalissues);
		model.setViewName("issue-list-all");
		return model;

	}

	@PostMapping("/postresolution")
	public String postResolution(@ModelAttribute("issue") issue user, Model model) {

		boolean issuee = reportdao.getResolution(user);

		System.out.println("-->" + issuee);

		if (issuee) {
			model.addAttribute("message", "Your report Sucessfully send to Admin ");
			model.addAttribute("clinicDetailsAdded", user);
			return "resolution_sucess";
		}
		return "error-page";
	}

	@GetMapping("/getRResolution")
	public ModelAndView getRRResolution(@RequestParam("id") int id,@RequestParam("userid") int userid, ModelAndView model) {
		System.out.println("-->" + id);
		List<issue> idresolution1 = reportdao.getidconfirm(id,userid);
		System.out.println("-->" + idresolution1);
		
		if(idresolution1 != null) {
			
			List<issue> idresolution = reportdao.idResolution(id);
			System.out.println("-->" + idresolution);
				if(idresolution!= null) 
					{
				
					//String resolution = idresolution2.getModel().getResolution();
					model.addObject("list", idresolution);
					model.setViewName("view_resolution");
					}
				else {
					model.setViewName("resolution_status");
					}
		}

		else
		{
			model.setViewName("invalid_request");
		}

		return model;
	}
}
