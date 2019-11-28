package br.com.blockone;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1.0f, 2.0f);
		System.out.println("The area of rectangle is " + r1.getArea());
		System.out.println("The perimeter of rectangle is " + r1.getPerimeter());
		System.out.println(r1.toString());
		
		Rectangle r2 = new Rectangle();
		r2.setLenght(3.0f);
		r2.setWidth(4.0f);
		System.out.println("The area of rectangle is " + r2.getArea());
		System.out.println("The perimeter of rectangle is " + r2.getPerimeter());
		System.out.println(r2.toString());
	}
}