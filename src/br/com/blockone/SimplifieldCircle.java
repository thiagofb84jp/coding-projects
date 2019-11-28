package br.com.blockone;

public class SimplifieldCircle {

	private double radius;
	
	
	public SimplifieldCircle() {
		
	}
	
	public SimplifieldCircle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getCircumference() {
		return Math.PI * radius;
	}

	@Override
	public String toString() {
		return "SimplifieldCircle [radius=" + radius + "]";
	}
}