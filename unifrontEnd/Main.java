package unifrontEnd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		AddressBookClient addressBookClient=new AddressBookClient();
		
		while(true) 
		{
		     System.out.println(" 1-Add\n 2-view\n 3-update\n 4-Delete\n 5-exit");
		     int ch=sc.nextInt();
		     switch(ch)
		     	{
		     		case 1:	addressBookClient.createContact();
		     				break;
		     		case 2: addressBookClient.view();
		     				break;
		     		case 3: addressBookClient.update();
		     		        break;
		     		case 4: addressBookClient.delete();
		     		        break;
		     		case 5: System.exit(0);
		     		default: System.out.println("Invalid choice");
		        }
		}
	}

   }
