package com.apiDevlopment2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apiDevlopment2.entities.Lead;
import com.apiDevlopment2.services.LeadService;

@Controller
public class LeadController {
	
	
	@Autowired
	private LeadService leadService;
	
	
	@RequestMapping("/view")
	public String viewPage() {
		return "new_regis";
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead, Model model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	
//	@RequestMapping("/listAll")
//	public String listAllLeads(ModelMap model) {
//		List<Lead> leads = leadService.listLeads();
//		model.addAttribute("leads",leads);
//		return "list_leads";
//	}

}
