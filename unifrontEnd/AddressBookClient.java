package unifrontEnd;

import java.util.List;
import java.util.Scanner;

import controller.AddressBookController;

public class AddressBookClient {
	AddressBookController addressBookController=new AddressBookController();
	Utility utility=new Utility();
	 Person person=new Person();
	Scanner sc=new Scanner(System.in);
	 
	public void createContact() 
	{
		
		 String firstName=utility.stringInput("First Name");
		 String lastName=utility.stringInput("Last Name");
		 String cityName=utility.stringInput("City Name");
		
		 String phoneNumber=utility.longIn("Phone Number");
		
		 person=new Person(firstName,lastName,cityName,phoneNumber);
		 addressBookController.addContact(person);
		 
	 }
		
    public void view()
	{
		List<Person> personList=addressBookController.viewContact();
		for(Person p:personList) {
			System.out.println(p);
		}
	}

	public void update() {
		
		System.out.println("Enter first name");
		String firstName=sc.next();
		System.out.println("Enter last name");
		String lastName=sc.next();
		int result=addressBookController.updateController(firstName,lastName);
		if(result==1) {
			System.out.println("Select field to edit details");
			System.out.println(" 1-FirstName\n 2-LastName\n 3-City\n 4-phoneNumber");
			int ch =sc.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter New Data");
			       String name=sc.next();
			       int r=addressBookController.updateController(ch,name);
			       if(r==1) {
			    	   System.out.println("Data Updated SuccessFully");
			       }
			       break;
					
			case 2:System.out.println("Enter New Data");
	                       String name1=sc.next();
	                       int r1=addressBookController.updateController(ch,name1);
	                       if(r1==1)
			       {
		    	           System.out.println("Data Updated SuccessFully");
		               }
	                       break;
			case 3:System.out.println("Enter New Data");
		               String city=sc.next();
		               int r2=addressBookController.updateController(ch,city);
		               if(r2==1) {
			    	   System.out.println("Data Updated SuccessFully");
			       }
		               break;
			case 4:System.out.println("Enter New Data");
	                       String phoneNumber=sc.next();
	                       if(utility.regex(phoneNumber)==1)
	                       {
	                          int r3=addressBookController.updateController(ch,phoneNumber);
	                          if(r3==1)
	                             {
			    	         System.out.println("Data Updated SuccessFully");
			             }
	                       }else {
	            	             System.out.println("Invalid PhoneNumber Enter Upto 10 digit");
	                       }
	                       break;
	                       default:System.out.println("Invalid Choice");
			}
		}
		else {
			System.out.println("Invalid Data Enter Proper Data");
		     }

	}
	

	public void delete()
	{
		System.out.println("Enter FirstName of person to Delete contact");
		String name=sc.next();
		int result=addressBookController.deleteContact(person,name);
		if(result==1) {
			System.out.println("Contact Deleted Successfully");
		}else {
			System.out.println(name+" Name is not present in the list");
		}
		
	}

}
