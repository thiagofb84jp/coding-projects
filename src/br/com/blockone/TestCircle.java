package br.com.blockone;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
		System.out.println(c1.toString());

		Circle c2 = new Circle(2.0);
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
		System.out.println(c2.toString());
		System.out.println("To String = " + c2);
		
		Circle c3 = new Circle(3.0, "blue");
		System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea() + " and " + c3.getColor() + " color");
		
		Circle c4 = new Circle();
		c4.setRadius(4.0);
		System.out.println("Radius is: " + c4.getRadius());
		
		c4.setColor("yellow");
		System.out.println("Color is: " + c4.getColor());
		
		System.out.println("Area is: " + c4.getArea());
	}
}