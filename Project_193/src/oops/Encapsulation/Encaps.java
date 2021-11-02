package oops.Encapsulation;

public class Encaps 
{
	
	private String name;
	private String email;
	public String employeeid="MQ001";
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
		System.out.println("New Name Setup Successfull");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
		System.out.println("Employee ID modified by User -> Sunil");
	}
	
	
	

}
