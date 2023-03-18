package com.apiDevlopment2.services;

import java.util.List;

import com.apiDevlopment2.entities.Lead;

public interface LeadService {

	public void saveOneLead(Lead lead);

	public List<Lead> listLeads();

	public void deletelead(long id);
	
	

}
