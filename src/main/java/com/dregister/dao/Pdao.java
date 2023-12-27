package com.dregister.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mfrp.model.Pregister;

@Repository
public class Pdao {

	@Autowired
	public JdbcTemplate  jdbctemplate;
	
	
	public boolean patientDetails(Pregister user) {
		
		System.out.println("-++" + user);
		
		String sql = "INSERT INTO pregister VALUES (?,?,?,?,?,?,?,?)";
		
		System.out.println("***" + jdbctemplate);
		
		int update = jdbctemplate.update(sql, new Object[] { user.getFirst_name(), user.getLast_name(), user.getDob(), user.getGender(), user.getContact_number(), user.getId(), user.getPassword(), user.getEmail() });
		if (update > 0) {
			return true;
		}
		return false;
		
	}
	
		
	}
	
	
