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
  
    
	public int updateService(String name, String lastName) 
	{
		int result=addressBookRepository.updateRepository(name,lastName);
		return result;
	}

	public int updateService(int ch,String name) {
		int r=addressBookRepository.updateRepository(ch,name);
		return r;
	}

	public int deleteService(Person person, String name)
	{
		int result=addressBookRepository.deleteData(person,name);
		return result;
	}

	
}
