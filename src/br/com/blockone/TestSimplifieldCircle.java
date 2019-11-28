package br.com.blockone;

public class TestSimplifieldCircle {

	public static void main(String[] args) {
		SimplifieldCircle c1 = new SimplifieldCircle();
		c1.setRadius(1.0);		
		System.out.println("The circumference of radius ("+ c1.getRadius() +") is " + c1.getCircumference());
		
		SimplifieldCircle c2 = new SimplifieldCircle(2.0);
		System.out.println("The circumference of radius ("+ c2.getRadius() +") is " + c2.getCircumference());	
	}
}