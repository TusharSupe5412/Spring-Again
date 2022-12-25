package spring.contact.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import spring.contact.model.Contact;

public class ContactDaoImpl implements ContactDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public ContactDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int save(Contact c) {
		
		String sql = "Insert into contact(name, email, address, phone)values(?,?,?,?)";
		return jdbcTemplate.update(sql, c.getName(),c.getEmail(),c.getAddress(),c.getPhone());
		
	}

	@Override
	public int update(Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Contact getContact(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Contact> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
