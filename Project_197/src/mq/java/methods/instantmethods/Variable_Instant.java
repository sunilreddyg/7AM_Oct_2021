package mq.java.methods.instantmethods;

public class Variable_Instant
{
	//Global Variables [Instant Variables]
	String name="MQ-DSNR";
	int c=10;
	
	
	
	

	public static void main(String[] args)
	{
			/*
			 * Object Creation syntax in order to call instant Methods
			 * 
			 * 			ClassName obj=new ClassName();
			 * 			Datatype ref=obj.VariableName;
			 */
			Variable_Instant var=new Variable_Instant();
			String Cname=var.name;
			System.out.println(Cname);
	}

}
