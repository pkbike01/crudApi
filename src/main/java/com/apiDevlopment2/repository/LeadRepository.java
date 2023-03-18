package com.apiDevlopment2.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiDevlopment2.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {
//	public List<Lead> findByName(String name);

}
