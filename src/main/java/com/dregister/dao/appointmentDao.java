package com.dregister.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



import com.mfrp.model.appointmentModel;


@Repository
public class appointmentDao {
	@Autowired
	public JdbcTemplate jdbctemplate;
	
public boolean appointmentDetail(appointmentModel user) {
		
		System.out.println("-++" + user);
		
		String sql = "INSERT INTO appointment VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		System.out.println("***" + jdbctemplate);
		
		int update = jdbctemplate.update(sql, new Object[] { user.getAppointmentId(), user.getPatient_name(), user.getPatient_locality(), user.getPurpose_of_visit(),user.getAge(),  user.getGender(), user.getContact_number(), user.getClinic_id(), "pending" });
		if (update > 0) {
			return true;
		}
		return false;
		
	}

public List<appointmentModel> getLocalityAppointmentDetails( int clinic_id) {
	String sql = "select * from appointment where appointmentId IN (Select appointmentId from appointment where clinic_id = ? and status='pending' );";

	List<appointmentModel> query = jdbctemplate.query(sql,new Object[] {clinic_id}, new RowMapper<appointmentModel>() {

		@Override
		public appointmentModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			appointmentModel user = new appointmentModel();
			user.setAppointmentId(rs.getInt("appointmentId"));
			user.setPatient_name(rs.getString("patient_name"));
			user.setPatient_locality(rs.getString("patient_locality"));
			user.setPurpose_of_visit(rs.getString("visit"));
			user.setClinic_id(rs.getInt("clinic_id"));
			user.setGender(rs.getString("gender"));
			user.setAge(rs.getInt("age"));
			user.setContact_number(rs.getLong("contact_number"));
			user.setStatus(rs.getString("status"));
			
			return user;
		}
	});
	return query;
}

public boolean approveUser(String appointment_id) {
	
	String sql="update appointment set status = ? where appointmentId=?";
	int update = jdbctemplate.update(sql, new Object[] {"APPROVED",appointment_id});
	
	if(update>0) {
		
		return true;
	}
	return false;
}
public boolean rejectUser(String appointment_id) {

String sql="update appointment set status = ? where appointmentId=?";
int update = jdbctemplate.update(sql, new Object[] {"REJECTED",appointment_id});

if(update>0) {
	
	return true;
}
return false;
}
public List<appointmentModel> getAppointmentStatustDetails( int appointment_id) {
	System.out.println("Inside Dao Contact--" + appointment_id);
	String sql = "select * from appointment where appointmentId IN (Select appointmentId from appointment where appointmentId = ?);";
	List<appointmentModel> query = jdbctemplate.query(sql,new Object[] {appointment_id}, new RowMapper<appointmentModel>() {

		@Override
		public appointmentModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			appointmentModel user = new appointmentModel();
			user.setAppointmentId(rs.getInt("appointmentId"));
			user.setPatient_name(rs.getString("patient_name"));
			user.setPatient_locality(rs.getString("patient_locality"));
			user.setPurpose_of_visit(rs.getString("visit"));
			user.setClinic_id(rs.getInt("clinic_id"));
			user.setGender(rs.getString("gender"));
			user.setAge(rs.getInt("age"));
			user.setContact_number(rs.getLong("contact_number"));
			
			user.setStatus(rs.getString("status"));
			return user;
		}
	});
	System.out.println("Insode ad0--->" + query);
	
	return query;
}

public List<appointmentModel> getappointmentid( String patient_name) {
	System.out.println("Inside Dao Contact--" + patient_name);
	String sql = "select * from appointment where patient_name=?;";
	List<appointmentModel> query = jdbctemplate.query(sql,new Object[] {patient_name}, new RowMapper<appointmentModel>() {

		@Override
		public appointmentModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			appointmentModel user = new appointmentModel();
			user.setAppointmentId(rs.getInt("appointmentId"));
			user.setPatient_name(rs.getString("patient_name"));
			user.setPatient_locality(rs.getString("patient_locality"));
			user.setPurpose_of_visit(rs.getString("visit"));
			user.setClinic_id(rs.getInt("clinic_id"));
			user.setGender(rs.getString("gender"));
			user.setAge(rs.getInt("age"));
			user.setContact_number(rs.getLong("contact_number"));
			
			user.setStatus(rs.getString("status"));
			return user;
		}
	});
	System.out.println("Insode ad0--->" + query);
	
	return query;
}
}
