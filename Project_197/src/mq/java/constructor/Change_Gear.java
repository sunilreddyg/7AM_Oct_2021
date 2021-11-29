package mq.java.constructor;


public class Change_Gear 
{
	//constructor
	public Change_Gear() 
	{
		System.out.println("Hold clutch");
	}
	
	//Reusable method
	public void Gear1()
	{
		System.out.println("First gear changed");
	}
	
	//Reusable method
	public void Gear2()
	{
		System.out.println("Second gear changed");
	}
	
	//Reusable method
	public void Gear3()
	{
		System.out.println("third gear changed");
	}


	//Main method [Runnable]
	public static void main(String[] args) 
	{
		//Calling Instant method with help of constructor
		new Change_Gear().Gear1();
		new Change_Gear().Gear2();
		new Change_Gear().Gear3();
		
		System.out.println("\n");  //Escape sequence to create new line at console
		
		//Creating object to class
		Change_Gear obj=new Change_Gear();
		obj.Gear1();
		obj.Gear2();
		obj.Gear3();

	}


}
