package com.apiDevlopment2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.apiDevlopment2.entities.Lead;

import com.apiDevlopment2.repository.LeadRepository;

@Service
public class LeadService_Impl implements LeadService {
//	 	@Autowired
//	    private apiConfig myAppConfig;

//	    public void doSomething() {
//	        String myVariable1 = myAppConfig.getValue1();
////	        String myVariable2 = myAppConfig.getMyVariable2();
//	        // Use myVariable1 and myVariable2
//	        
//	    }
//	 private String v1 = "qinsight";
//	 private String v2 = myVariable1;
	
	@Autowired
	private LeadRepository leadRepo;
	
	
	@Value("${api.value1}")
	private String v1;
	
	
	@Override
	public void saveOneLead(Lead lead) {
		System.out.println(v1);
		leadRepo.save(lead);
		
		
	}

	@Override
	public List<Lead> listLeads() {
		List<Lead> leads = leadRepo.findAll();
		System.out.println(v1);
		return leads;
	}

	@Override
	public void deletelead(long id) {
		leadRepo.deleteById(id);
		
	}

}
