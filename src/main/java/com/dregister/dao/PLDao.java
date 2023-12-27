package com.dregister.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mfrp.model.AloginModel;
import com.mfrp.model.PloginModel;

@Repository
public class PLDao {
	
	@Autowired
	public JdbcTemplate jdbctemplate;
	
	public PloginModel patientLoginCheck(int id, String password) {
		
		String sql="select id, password from pregister where id=? and password=?";
		
List<PloginModel> patient= jdbctemplate.query(sql, new Object[] {id, password}, new RowMapper<PloginModel>() {
			
			@Override 
			public PloginModel mapRow(ResultSet rs, int rowNum) throws SQLException{
				
				PloginModel patient =new PloginModel();
				patient.setId(rs.getInt("id"));
				patient.setPassword(rs.getString("password"));
				return patient;
			}
		
	});
		
				if(patient.isEmpty()) {
						return null;
					}
					return patient.get(0);
	
	

	
}
}
