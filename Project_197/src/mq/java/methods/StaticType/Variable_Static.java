package mq.java.methods.StaticType;


public class Variable_Static 
{
	//Global Variables [Static Variables]
	static String email="info.dsnr@gmail.com";
	static double price=10000.00;
	
	public static void main(String[] args) 
	{
		
		/*
		 * Sytax to Calling Static Variable 
		 * 		 DataType ref=ClassName.VariableName;
		 */
		String Cemail=Variable_Static.email;
		System.out.println(Cemail);
		
		System.out.println(Variable_Static.price);
		
		
	}

}
