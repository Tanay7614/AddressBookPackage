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
		
		System.out.println("Update contact via\n 1-firstName \n 2-CityName\n 3-phoneNumber");
		int data=sc.nextInt();
		switch(data){
			      case 1: System.out.println("Enter first name of person");
			              String name=sc.next();
			              int result =addressBookController.updateContact(person,name);
			              if(result==1) 
			              {
			      			    System.out.println("Enter New Data");
			      			    String data1=sc.next();
			      			    int r=addressBookController.updateContact(data1,person); 
			      			    if(r==1) 
			      			    {
			      				      System.out.println("Data Updated Successfully");
			      			    }
			      		  }
			              else  {
			      			System.out.println(name+" Name is not present in the list");
			      		  }
			              break;
			     
			      case 2: System.out.println("Enter cityname of person");
	                      String name1=sc.next();
	                      int result1 =addressBookController.updateContact(person,name1);
	                      if(result1==1) {
	                    	   System.out.println("Enter New Data");
			      			    String data1=sc.next();
			      			    int r=addressBookController.updateContact(data1,person); 
			      			    if(r==1) 
			      			    {
			      				      System.out.println("Data Updated Successfully");
			      			    }
	               		    }
	                       else {
	               			System.out.println(name1+" Name is not present in the list");
	               		   }
	                       break;
			     
			      case 3: System.out.println("Enter phoneNumber of person");
                           String name2=sc.next();
                           int result2 =addressBookController.updateContact(person,name2);
                           if(result2==1)
                           {
                        	   System.out.println("Enter New Data");
			      			   String data1=sc.next();
			      			    if(utility.regex(data1)==1)
			      			    {
			      			    	int r=addressBookController.updateContact(data1,person); 
				      			    if(r==1)
				      			    {
				      				      System.out.println("Data Updated Successfully");
				      			    }
			      			    }
			      			    else 
			      			    {
			      			    	System.out.println("Enter proper phoneNumber upto 10-Digit");
			      			    }
			      			    
                   		   }
                           else {
                   			System.out.println(name2+" PhoneNumber is not present in the list");
                   		   }
                           break;
                           
                  default:  System.out.println("Inavalid Choice");
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
