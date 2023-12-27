package com.dregister.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mfrp.model.clinicModel;

@Repository
public class clinicDao {
	@Autowired
	public JdbcTemplate jdbctemplate;

	public boolean clinicDetails(clinicModel user) {

		System.out.println("-++" + user);

		String sql = "INSERT INTO clinicdetails VALUES ( ?, ?, ?, ?, ?, ?,?,?,?, ?)";
		System.out.println("***" + jdbctemplate);

		int update = jdbctemplate.update(sql,
				new Object[] { user.getClinic_id(), user.getClinic_name(), user.getAddress(),
						user.getFacilities_available(), user.getContact_number(), user.getWebsite(), user.getPincode(),
						user.getSpeciality(), user.getAvailability(), user.getId() });
		if (update > 0) {
			return true;
		}
		return false;
	}

	public List<clinicModel> availabilityDoctors(String locality) {
		System.out.println("-->Inside Dao" + locality);
		String sql = "select * from clinicdetails where  pincode = ?";
		List<clinicModel> query = jdbctemplate.query(sql, new Object[] { Double.parseDouble(locality) }, new RowMapper<clinicModel>() {

			@Override
			public clinicModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				clinicModel user = new clinicModel();

				user.setClinic_id(rs.getString("clinic_id"));
				user.setClinic_name(rs.getString("clinic_name"));
				user.setAddress(rs.getString("address"));
				user.setContact_number(rs.getLong("contact_number"));
				user.setFacilities_available(rs.getString("facilities available"));
				user.setWebsite(rs.getString("website"));
				user.setPincode(rs.getLong("pincode"));
				user.setSpeciality(rs.getString("speciality"));
				user.setAvailability(rs.getString("availability"));
				user.setId(rs.getInt("id"));

				return user;
			}
		});
		System.out.println("-->dao" + query);
		return query;
	}
	
	public List<clinicModel> specalityDoctors(String speciality) {
		System.out.println("-->Inside Dao" + speciality);
		String sql = "select * from clinicdetails where  speciality = ?";
		List<clinicModel> query = jdbctemplate.query(sql, new Object[] {speciality }, new RowMapper<clinicModel>() {

			@Override
			public clinicModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				clinicModel user = new clinicModel();

				user.setClinic_id(rs.getString("clinic_id"));
				user.setClinic_name(rs.getString("clinic_name"));
				user.setAddress(rs.getString("address"));
				user.setContact_number(rs.getLong("contact_number"));
				user.setFacilities_available(rs.getString("facilities available"));
				user.setWebsite(rs.getString("website"));
				user.setPincode(rs.getLong("pincode"));
				user.setSpeciality(rs.getString("speciality"));
				user.setAvailability(rs.getString("availability"));
				user.setId(rs.getInt("id"));

				return user;
			}
		});
		System.out.println("-->dao" + query);
		return query;
	}
	
	public List<clinicModel> getClinicId(String clinic_name, String availability) {
		
		String sql = "select * from clinicdetails where  clinic_name = ? and availability=?";
		List<clinicModel> query = jdbctemplate.query(sql, new Object[] {clinic_name,availability }, new RowMapper<clinicModel>() {

			@Override
			public clinicModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				clinicModel user = new clinicModel();

				user.setClinic_id(rs.getString("clinic_id"));
				user.setClinic_name(rs.getString("clinic_name"));
				user.setAddress(rs.getString("address"));
				user.setContact_number(rs.getLong("contact_number"));
				user.setFacilities_available(rs.getString("facilities available"));
				user.setWebsite(rs.getString("website"));
				user.setPincode(rs.getLong("pincode"));
				user.setSpeciality(rs.getString("speciality"));
				user.setAvailability(rs.getString("availability"));
				user.setId(rs.getInt("id"));

				return user;
			}
		});
		System.out.println("-->dao" + query);
		return query;
	}
	
	
	
}
