package repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import database.AddressBookSQl;

import unifrontEnd.Person;

public class AddressBookRepository {
	
    private List<Person> addressBooklist=new ArrayList<>();
    int p;
    public void saveContact(Person person1)
    {
    	
    	Connection con=AddressBookSQl.getConnection();
    	String sql=String.format("insert into person(firstName, lastName,cityName,phoneNumber)" + "values('%s','%s','%s','%s')", person1.firstName,person1.lastName,person1.cityName,person1.phoneNumber);
    	try {
			
    	       Statement statement=con.createStatement();
	       statement.executeUpdate(sql);
            }  catch (SQLException e) {
	       e.printStackTrace();
            }
    }
        
    public List<Person> viewContactRepo()
    {
    	Connection con=AddressBookSQl.getConnection();
    	String sql=String.format("select * from person");
    	try {
			Statement statement=con.createStatement();
			ResultSet resultset=statement.executeQuery(sql);
			while(resultset.next())
			  {
				  int id=resultset.getInt(1);
				  String firstname=resultset.getString(2);
				  String lastname=resultset.getString(3);
				  String cityname=resultset.getString(4);
				  String phoneno=resultset.getString(5);
				  addressBooklist.add(new Person(id,firstname,lastname,cityname,phoneno));
			  }
			}catch (SQLException e) {
			 e.printStackTrace();
		        }
	return addressBooklist;
     }

	
        public int updateRepository(String firstname,String lastName)
	{
    	        int result=0;
		Connection con=AddressBookSQl.getConnection();
		String sql=String.format("select * from person");
    	        try {
		      Statement statement=con.createStatement();
		      resultset=statement.executeQuery(sql);
		      while(resultset.next()) 
		      {
			 if(resultset.getString(2).equalsIgnoreCase(firstname))
			 {
			    if(resultset.getString(3).equalsIgnoreCase(lastName))
			    {					   
			       p= resultset.getInt(1);
			       result=1;
			       return result;
		            }
			 }
		       }
		     } catch (SQLException e) {					
		       e.printStackTrace();
		     }
		       return result;
	}
	
	public int updateRepository(int ch,String name) {
		int result=0;
		Connection con=AddressBookSQl.getConnection();
		if(ch==1) 
		{
		    try {
			    String sql=String.format("update person set firstName=? where id=?");
			    PreparedStatement pst=con.prepareStatement(sql);					
			    pst.setString(1, name);
			    pst.setInt(2, p);
			    pst.executeUpdate();
			    result=1;
			    return result;
			   }  catch (SQLException e) {
			      e.printStackTrace();
		        }
		}
		if(ch==2)
		{
			String sql=String.format("update person set  lastName=? where id=?");
			  try {
					PreparedStatement pst=con.prepareStatement(sql);
					pst.setString(1, name);
					pst.setInt(2, p);
					pst.executeUpdate();
					result=1;
					return result;
			      } catch (SQLException e) {
				e.printStackTrace();
			      }
	        }
		if(ch==3)
		{
			String sql=String.format("update person set cityName=? where id=?");
			  try {
					PreparedStatement pst=con.prepareStatement(sql);
					
					pst.setString(1, name);
					pst.setInt(2, p);
					pst.executeUpdate();
					result=1;
					return result;
				   } 
			       catch (SQLException e) {
			       e.printStackTrace();
			       }
		 }
		 if(ch==4) 
		 {
			 String sql=String.format("update person set phoneNumber=? where id=?");			
			 try {
					PreparedStatement pst=con.prepareStatement(sql);
					pst.setString(1, name);
					pst.setInt(2, p);
					pst.executeUpdate();
					result=1;
			     } catch (SQLException e) {
			       e.printStackTrace();
			     }
			 
		  }
			return result;
	          }


	public int deleteData(Person person, String name) 
	{
		int result=0;
		Connection con=AddressBookSQl.getConnection();
		String sql=String.format("select * from person");
                try {
    		     Statement statement=con.createStatement();
		     ResultSet resultset=statement.executeQuery(sql);
		     while(resultset.next()) 
		     {
			 if(resultset.getString(2).equalsIgnoreCase(name))
			 {
				 String sql1=String.format("delete from person where firstName=?");
				 PreparedStatement pst=con.prepareStatement(sql1);
				 pst.setString(1, name);
				 pst.executeUpdate();
				 result=1;
			 }
		     }
		    }            catch (SQLException e) {
			         e.printStackTrace();
		    }
		    return result;
	 }

}
