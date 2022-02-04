package oops.Interface;

public class Runner {

	public static void main(String[] args) 
	{
		
		Book obj=new FirstEdition();
		obj.Title();
		obj.Author();
		obj.method1();
		
		
		Book obj1=new SecondEdition();
		obj1.Title();
		obj1.Author();
		obj1.method1();
		
		System.out.println(Book.publisher);
		

	}

}
