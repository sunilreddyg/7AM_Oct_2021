package mq.java.methods.instantmethods;

public class RobotA 
{
	//Instant method 
	public void startwalk()
	{
		System.out.println("Walk started");
	}
	
	//instant method
	public void stopwalk()
	{
		System.out.println("Walking stopped");
	}
	
	public static void main(String[] args) 
	{
		 new RobotA().startwalk();
		 new RobotA().stopwalk();
	}
	
	
}

