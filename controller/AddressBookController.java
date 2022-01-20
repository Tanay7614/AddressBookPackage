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

	public int updateContact(Person person,String name)
	{
		 int result=addressBookService.updateService(person,name);	
		 return result;
	}

	public int deleteContact(Person person, String name) 
	{
		int result=addressBookService.deleteService(person,name);	
		 return result;
		
	}

	public int updateContact(String data1, Person person) 
	{
		int result=addressBookService.updateService(data1,person);	
		return result;
	}
}
