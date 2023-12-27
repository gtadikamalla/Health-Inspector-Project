package com.dregister.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mfrp.model.prescriptionModel;

@Repository
public class prescriptionDao {
	@Autowired	
	public JdbcTemplate jdbctemplate;
	public boolean insertPrescriptionDetails(prescriptionModel user) {
		
		String sql="insert into prescription() values(?,?,?,?,?,?,?,?,?)";
		int update = jdbctemplate.update(sql, new Object[] {user.getId(),user.getSymptoms(),user.getDiagnosis(),user.getTreatment_planned(),user.getPrescription(),user.getRevisit_required(),user.getNext_revisit_date(),user.getFrequency_revisit(),user.getPappointmentid()});
			
		if(update>0)
		{
			
			return true;
		}
		return false;
		
		}
	
	public List<prescriptionModel> getAllPrescriptionDetails() {
		String sql = "select * from prescription";
		List<prescriptionModel> query = jdbctemplate.query(sql, new RowMapper<prescriptionModel>() {

			@Override
			public prescriptionModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				prescriptionModel user = new prescriptionModel();
				user.setId(rs.getInt("id"));
				user.setSymptoms(rs.getString("symptoms"));
				user.setDiagnosis(rs.getString("diagnosis"));
				user.setTreatment_planned(rs.getString("treatment_planned"));
				user.setPrescription(rs.getString("prescription"));
				user.setRevisit_required(rs.getString("revisit_required"));
				user.setNext_revisit_date(rs.getString("next_revisit_date"));
				user.setFrequency_revisit(rs.getInt("frequency_revisit"));
				user.setPappointmentid(rs.getLong("pappointmentid"));
										
				return user;
			}
		});
		return query;
	}
}
