package unifrontEnd;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
	
	
	public String stringInput(String msg)
	{
		
		displayInputInfo(msg);
		Scanner sc=new Scanner(System.in);
		String value=sc.nextLine();
		return value;
	}
	
	public String longIn(String msg) 
	{
		
		displayInputInfo(msg);
		Scanner sc=new Scanner(System.in);
		String value=sc.next();
                int r= regex(value);
		if(r==0) {
			System.out.println("Invalid Number Enter Proper PhoneNumber");
			longIn(msg);
		}
		return value;
	}


	public int regex(String value)
	{
		int r=0;
		String regex= "[0-9]{10}";
     	        Pattern pattern=Pattern.compile(regex);
     	        Matcher match= pattern.matcher(value);
     	        if(match.matches())
		{
     		    r=1;
     	        }
     	        return r;
	}

	private void displayInputInfo(String msg)
	{
		System.out.println("Enter "+msg+": ");
	}

}
