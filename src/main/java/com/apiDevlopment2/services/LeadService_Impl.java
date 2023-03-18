package com.apiDevlopment2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiDevlopment2.entities.Lead;
import com.apiDevlopment2.repository.LeadRepository;

@Service
public class LeadService_Impl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);
		
		
	}

	@Override
	public List<Lead> listLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public void deletelead(long id) {
		leadRepo.deleteById(id);
		
	}

}
