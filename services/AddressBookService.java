package services;
import java.util.List;
import repository.AddressBookRepository;
import unifrontEnd.Person;

public class AddressBookService {
   
    private AddressBookRepository addressBookRepository = new AddressBookRepository();
	
    public void addContactService(Person person) 
    {
		 addressBookRepository.saveContact(person);	
	}

    public List<Person> viewContactService()
    {
		return addressBookRepository.viewContactRepo();
	}
  
    public int updateService(Person person, String name) 
    {
	     int result=addressBookRepository.updateRepository(person,name);
	     return result;
    }
	

	public int deleteService(Person person, String name)
	{
		 		
		int result=addressBookRepository.deleteData(person,name);
		return result;
		
	}

	public int updateService(String data1, Person person) 
	{
		int result=addressBookRepository.updateRepository(data1,person);
		return result;
		
	}

}
