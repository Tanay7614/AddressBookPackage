package controller;

import java.util.List;

import services.AddressBookService;
import unifrontEnd.Person;

public class AddressBookController
{
    private AddressBookService addressBookService=new AddressBookService();
	
	public void addContact(Person person) 
	{
		addressBookService.addContactService(person);
	}

	public List<Person> viewContact() 
	{
		return addressBookService.viewContactService();
	}

        public int updateController(String name, String lastName)
	{
		int result =addressBookService.updateService(name,lastName);
		return result;
	}

	public int updateController(int ch,String name) 
	{
		int r=addressBookService.updateService(ch,name);
		return r;
	}
	
	public int deleteContact(Person person, String name) 
	{
		int result=addressBookService.deleteService(person,name);	
		return result;
		
	}

	
}
