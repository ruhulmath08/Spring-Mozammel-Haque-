package com.spring._addingUpdateMethod;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.object.MappingSqlQueryWithParameters;
import org.springframework.stereotype.Component;

@Component("noticeDAO")
public class NoticeDAO {

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	// Display all notice
	public List<Notice> getNotices() {
		return jdbc.query("SELECT * FROM notices", new RowMapper<Notice>() {

			public Notice mapRow(ResultSet rs, int rowNum) throws SQLException {
				Notice notice = new Notice();
				notice.setId(rs.getInt("id"));
				notice.setName(rs.getString("name"));
				notice.setEmail(rs.getString("email"));
				notice.setText(rs.getString("text"));
				return notice;
			}
		});
	}
	
	// Display a single notice
	public Notice getNotice(int id) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);
		return jdbc.queryForObject("SELECT * FROM notices where id = :id", params, new RowMapper<Notice>() {

			public Notice mapRow(ResultSet rs, int rowNum) throws SQLException {
				Notice notice = new Notice();
				notice.setId(rs.getInt("id"));
				notice.setName(rs.getString("name"));
				notice.setEmail(rs.getString("email"));
				notice.setText(rs.getString("text"));
				return notice;
			}
		});
	}
	
	//Delete notice from database based on id
	public boolean delete(int id) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);
		return jdbc.update("delete from notices where id = :id",  params) == 1;
	}
	
	//Insert one notice in database
	public boolean create(Notice notice) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(notice);
		return jdbc.update("insert into notices (name, email, text) values (:name, :email, :text)", params) == 1;
	}
	
	//Update an existing notice in database.
	public boolean update(Notice notice) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(notice);
		return jdbc.update("update notices set name = :name, email = :email, text = :text where id = :id", params) == 1;
	}
}
