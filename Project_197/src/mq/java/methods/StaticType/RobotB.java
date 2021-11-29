package mq.java.methods.StaticType;

public class RobotB 
{
	//Reusable method with static specifier
	public static void method1()
	{
		System.out.println("Method1 Executed");
	}
	
	//Reusable method with static specifier
	public static  void method2()
	{
		System.out.println("Method2 executed");
	}

	public static void main(String[] args) 
	{
		//Calling static methods with in class
		method1();
		method2();

	}

}
