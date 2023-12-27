package com.dregister.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



import com.mfrp.model.registrationModel;


@Repository
public class DLDao {
	
	@Autowired
	public JdbcTemplate jdbctemplate;
	
		public registrationModel doctorLoginCheck(int idd, String password) {
		
		String sql="select * from userregistration where idd= ? and password=?";
		
			List<registrationModel> doctor= jdbctemplate.query(sql, new Object[] {idd, password}, new RowMapper<registrationModel>() {
			
			@Override 
			public registrationModel mapRow(ResultSet rs, int rowNum) throws SQLException{
				
				registrationModel doctor =new registrationModel();
				doctor.setId(rs.getInt("idd"));
				doctor.setPassword(rs.getString("password"));
				doctor.setCategory(rs.getString("category"));
				doctor.setFirst_name(rs.getString("first_name"));
				doctor.setLast_name(rs.getString("last_name"));
				return doctor;
			}
		
	});
		
				if(doctor.isEmpty()) {
						return null;
					}
					return doctor.get(0);
	}
		
		
	

}
