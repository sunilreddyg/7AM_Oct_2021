package mq.java.conditional_statements;

public class SwitchCondition {

	public static void main(String[] args) 
	{
		
		String month="feb";
		
		switch (month) {
		case "jan":
			System.out.println("10% Discount available");
			break;
			
		case "feb":
			System.out.println("20% Discount available");
			break;
			
		case "mar":
			System.out.println("30% Discount available");
			break;
			
		case "apr":
			System.out.println("30% Discount available");
			break;
		

		default: System.out.println("No Discount Month");
			break;
		}

	}

}
