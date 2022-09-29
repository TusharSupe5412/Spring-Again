package com.springcore.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl {
	
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		
		String sql = "insert into springjdbc.student (id,name,city) values(?,?,?)";
		int result = this.jdbcTemplate.update(sql,student.getId(),student.getName(),student.getCity());
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	
	
	

}
