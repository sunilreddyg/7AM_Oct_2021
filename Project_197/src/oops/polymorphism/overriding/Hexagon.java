package oops.polymorphism.overriding;

public class Hexagon extends Shape
{
	
	@Override
	public void draw()
	{
		System.out.println(super.name);
		super.draw();
		
		System.out.println("Hexagon child class method");
	}
	
	
	

	public static void main(String[] args) {
		
		Shape shp=new Hexagon();
		shp.draw();
		
	}

}
