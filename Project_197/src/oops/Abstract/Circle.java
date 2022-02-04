package oops.Abstract;

public class Circle extends Shape
{

	@Override
	void draw() 
	{
		System.out.println("Child Circle class is executed");
	}
	
	
	public static void main(String args[])
	{
			System.out.println(Shape.name);
			
			Shape obj=new Circle();
			obj.draw();
			obj.corners();
			
			
		
	}

}
