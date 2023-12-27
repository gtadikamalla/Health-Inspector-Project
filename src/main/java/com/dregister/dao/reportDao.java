package com.dregister.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mfrp.model.clinicModel;
import com.mfrp.model.issue;
import com.mfrp.model.registrationModel;
import com.mfrp.model.resolutionModel;

@Repository
public class reportDao {

	@Autowired
	public JdbcTemplate jdbctemplate;

	public boolean issue(issue user) {

		System.out.println("-++" + user);

		String sql = "INSERT INTO helpissue(issue,description,issue_user_id) VALUES (?,?,?)";
		System.out.println("***" + jdbctemplate);

		int update = jdbctemplate.update(sql, new Object[] { user.getIssue(), user.getDescription(), user.getUserid() });
		if (update > 0) {
			return true;
		}
		return false;
	}

	public List<issue> getIssueId(String issue) {

		String sql = "select * from helpissue where issue = ?";
		List<issue> query = jdbctemplate.query(sql, new Object[] { issue }, new RowMapper<issue>() {

			@Override
			public issue mapRow(ResultSet rs, int rowNum) throws SQLException {
				issue user = new issue();
				user.setId(rs.getInt("id"));
				user.setIssue(rs.getString("issue"));
				user.setDescription(rs.getString("description"));

				return user;
			}
		});
		System.out.println("-->dao" + query);
		return query;
	}

	public List<issue> getTechnicalIssues() {
		String sql = "select * from helpissue";
		List<issue> query = jdbctemplate.query(sql, new RowMapper<issue>() {

			@Override
			public issue mapRow(ResultSet rs, int rowNum) throws SQLException {
				issue user = new issue();
				user.setId(rs.getInt("id"));
				user.setIssue(rs.getString("issue"));
				user.setDescription(rs.getString("description"));
				user.setUserid(rs.getInt("issue_user_id"));
				return user;
			}
		});
		return query;
	}

	public boolean getResolution(issue user) {

		System.out.println("-++" + user);

		String sql = "INSERT INTO helpresolution(resolution,helpissue_id) values(?,?)";
		System.out.println("***" + jdbctemplate);

		int update = jdbctemplate.update(sql, new Object[] { user.getResolution(), user.getId() });
		if (update > 0) {
			return true;
		}
		return false;
	}
	
	
	
	public List<com.mfrp.model.issue> idResolution(int id) {
		System.out.println("-->Inside Dao" +id);
		String sql = "Select helpissue.id,helpresolution.resolution,helpissue.issue,helpissue.description  from helpissue  inner join helpresolution on helpissue.id = helpresolution.helpissue_id where helpissue.id= ? ";
		List<issue> query = jdbctemplate.query(sql, new Object[] {id}, new RowMapper<issue>() {

			@Override
			public issue mapRow(ResultSet rs, int rowNum) throws SQLException {
				issue user = new issue();
				user.setId(rs.getInt("id"));
				user.setIssue(rs.getString("issue"));
				user.setDescription(rs.getString("description"));
				resolutionModel model=new resolutionModel();
				
				model.setResolution(rs.getString("resolution"));
				user.setModel(model);
				
				return user;
			}
		});
		if(query.isEmpty()) {
			return null;
			}
		System.out.println("-->dao" + query);
		return query;
	}
	
	
	public List<issue> getidconfirm(int id,int userid) {
		String sql = "select * from helpissue where id=? and issue_user_id=?";
		List<issue> query1 = jdbctemplate.query(sql, new Object[] {id,userid}, new RowMapper<issue>() {

			@Override
			public issue mapRow(ResultSet rs, int rowNum) throws SQLException {
				issue user = new issue();
				user.setId(rs.getInt("id"));
				user.setIssue(rs.getString("issue"));
				user.setDescription(rs.getString("description"));
				user.setUserid(rs.getInt("issue_user_id"));
				return user;
			}
		});
		
		if(query1.isEmpty()) {
			return null;
			}
		return query1;
		
	}
}
