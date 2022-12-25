package spring.contact.dao;

import java.util.List;

import spring.contact.model.Contact;

public interface ContactDao {

	public int save(Contact contact);

	public int update(Contact contact);

	public Contact getContact(Integer id);

	public int delete(Integer id);

	public List<Contact> list();

}
