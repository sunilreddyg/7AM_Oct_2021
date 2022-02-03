package oops.encapsulation;

public class Encaps 
{
	
	public String EmloyeeID="MQE001";
	
	private String name;
	private String email;
	
	public String getName()
	{
		System.out.println(name+"  is accessed");
		return name;
	
	}
	public void setName(String name) 
	{
		this.name = name;
		System.out.println(name+" is trying to login");
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	
	

}
