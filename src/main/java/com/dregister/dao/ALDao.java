package com.dregister.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mfrp.model.AloginModel;
import com.mfrp.model.registrationModel;

@Repository
public class ALDao {
	
	@Autowired
	public JdbcTemplate jdbctemplate;
	
	public AloginModel adminLoginCheck(int id, String password) {
		
		String sql= "select * from adminlogin where admin_id=? and password=?";
		
		List<AloginModel> admin= jdbctemplate.query(sql, new Object[] {id, password}, new RowMapper<AloginModel>() {
			
			@Override 
			public AloginModel mapRow(ResultSet rs, int rowNum) throws SQLException{
				
				AloginModel admin =new AloginModel();
				admin.setId(rs.getInt("admin_id"));
				admin.setPassword(rs.getString("password"));
				return admin;
			}
				
				
			});
			if(admin.isEmpty()) {
				return null;
			}
			return admin.get(0);
			
			}
	
	
		
	}
	


