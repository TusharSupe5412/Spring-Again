package com.springjdbc.DaoImpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.Dao.StudentDao;
import com.springjdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {

		String sql = "insert into springjdbc.student (id,name,city) values(?,?,?)";

		int result = this.jdbcTemplate.update(sql, student.getId(), student.getName(), student.getCity());
		return result;
	}

	public int update(Student student) {

		String query = "Update student set name = ?, city = ? where id=?";

		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}

	public Student getStudent(int studentId) {

		String sql = "select * from springjdbc.student where id = ?";

		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(sql, rowMapper, studentId);
		return student;
	}

	public List<Student> getStudentList() {

		String sql = "select * from springjdbc.student";

		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> list = this.jdbcTemplate.query(sql, rowMapper);
		return list;
	}

}
