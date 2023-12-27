package com.dregister.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mfrp.model.registrationModel;


@Repository
public class regvsave {
	 
	@Autowired
	public JdbcTemplate jdbctemplate;
	
	
	public String userDetails(registrationModel user) {
		
		
		String check = "Existing User";
		List<registrationModel> list = getSinglePatientDetails(user.getFirst_name(), user.getCategory());
		if(list.isEmpty()) {			
			String sql="insert into userregistration(first_name,last_name,dob,gender,contact_number,id,password,email,category) values(?,?,?,?,?,?,?,?,?)";
			int update = jdbctemplate.update(sql, new Object[] {user.getFirst_name(),user.getLast_name(),user.getDob(),user.getGender(),user.getContact_number(),user.getId(),user.getPassword(),user.getEmail(),user.getCategory()});
				
			if(update>0)
			{
				
				check = "Inserted successfully";
			}
		} else {
			for(registrationModel u : list) {
				System.out.println(u.getFirst_name()+" "+u.getCategory());
				if(u.getContact_number() == user.getContact_number() || u.getEmail().equals(user.getEmail())) {
					check = "Contact number or Email already exists";
				}
			}
		}
	
	return check;
	
	}
		
	
	
	
	public List<registrationModel> getDoctorDetails() {
		String sql = "select * from userregistration where category='doctor'";
		List<registrationModel> query = jdbctemplate.query(sql, new RowMapper<registrationModel>() {

			@Override
			public registrationModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				registrationModel user = new registrationModel();
				user.setIdd(rs.getInt("idd"));
				user.setFirst_name(rs.getString("first_name"));
				user.setLast_name(rs.getString("last_name"));
				user.setDob(rs.getString("dob"));
				user.setGender(rs.getString("gender"));
				user.setContact_number(rs.getLong("contact_number"));
				user.setId(rs.getInt("id"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setCategory(rs.getString("category"));
				
					
				
				
				return user;
			}
		});
		return query;
	}
	public List<registrationModel> getPatientDetails() {
		String sql = "select * from userregistration where category='patient'";
		List<registrationModel> query = jdbctemplate.query(sql, new RowMapper<registrationModel>() {

			@Override
			public registrationModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				registrationModel user = new registrationModel();
				user.setIdd(rs.getInt("idd"));
				user.setFirst_name(rs.getString("first_name"));
				user.setLast_name(rs.getString("last_name"));
				user.setDob(rs.getString("dob"));
				user.setGender(rs.getString("gender"));
				user.setContact_number(rs.getLong("contact_number"));
				user.setId(rs.getInt("id"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setCategory(rs.getString("category"));
				
					
				
				
				return user;
			}
		});
		return query;
	}
	public List<registrationModel> getSinglePatientDetails(String name,String category) {
		String sql = "select * from userregistration where category=? and first_name=?";
		
		List<registrationModel> query = jdbctemplate.query(sql, new Object[] {category,name},new RowMapper<registrationModel>() {

			@Override
			public registrationModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				registrationModel user = new registrationModel();
				user.setIdd(rs.getInt("idd"));
				user.setFirst_name(rs.getString("first_name"));
				user.setLast_name(rs.getString("last_name"));
				user.setDob(rs.getString("dob"));
				user.setGender(rs.getString("gender"));
				user.setContact_number(rs.getLong("contact_number"));
				user.setId(rs.getInt("id"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setCategory(rs.getString("category"));
				
				return user;
			}
		});
		return query;
		
	}
	

}
