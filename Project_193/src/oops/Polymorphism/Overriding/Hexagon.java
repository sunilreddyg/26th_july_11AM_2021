package oops.Polymorphism.Overriding;

public class Hexagon extends Shape
{
	
	@Override
	public void draw()
	{
		super.draw();
		System.out.println("Hexagon child class method");
	}
	

	public static void main(String[] args) {
		
		Shape shp=new Hexagon();
		shp.draw();
	}

}
