package spring.contact.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import spring.contact.model.Contact;

class ContactDaoTest {
	
	private DriverManagerDataSource dataSource;
	private ContactDao dao;

	@Test
	void testSave() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("admin");
		
		dao = new ContactDaoImpl(dataSource);
		
		Contact contact = new Contact("Tushar Supe","tsupe@gmail.com","kalyan","8329308132");
		int result = dao.save(contact);
		
		assertTrue(result>0);
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testGetContact() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testList() {
		fail("Not yet implemented");
	}

}
