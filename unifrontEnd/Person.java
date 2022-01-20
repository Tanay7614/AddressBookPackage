package unifrontEnd;

public class Person {
	public int id;
	public String firstName;
	public String lastName;
	public String cityName;
	public String phoneNumber;
	
	
    public Person(int id,String firstName, String lastName, String cityName, String phoneNumber) {
    	this.id=id;
    	this.firstName=firstName;
		this.lastName=lastName;
		this.cityName=cityName;
		this.phoneNumber=phoneNumber;
	}
    
    public Person() {
		
	}
    
    public Person(String firstName2, String lastName2, String cityName2, String phoneNumber2) {
    	this.firstName=firstName2;
		this.lastName=lastName2;
		this.cityName=cityName2;
		this.phoneNumber=phoneNumber2;
	}

	public String getFirstName() {
		return firstName;
	}

    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}

    public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    public String getCityName() {
		return cityName;
	}

    public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", cityName=" + cityName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
}
