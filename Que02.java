class Circle{
	public double center;
	public double radius;

	public Circle(double center, double radius){
		this.center = center;
		this.radius = radius;
	}

	public Circle(){
		System.out.println("The radius of circle is "+radius +" and the center is "+ center);
	}


public class Que02{
	public static void main(String args[]){
		Circle c = new Circle(4.0, 5.9);
		new Circle();
	}
}
