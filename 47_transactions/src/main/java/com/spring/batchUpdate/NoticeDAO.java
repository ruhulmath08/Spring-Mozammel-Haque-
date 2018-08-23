package com.spring.batchUpdate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
	
	
	//Insert list of notice
	@Transactional(readOnly=true)
	public int[] createListNotice(List<Notice> notice) {
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(notice.toArray());
		return jdbc.batchUpdate("insert into notices (id, name, email, text) values (:id, :name, :email, :text)", params);
	}
}
