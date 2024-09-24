//  Write a JAVA program for abstract class to find araes of differnt shapes

import java.util.*;
abstract class A
{
	abstract void Circle(double r);
	abstract void Triangle(int l, int b);
	abstract void Rectangle(int a);
}
class Shapes extends A
{
	void Circle(double r)
	{
		System.out.println("Area of Circle is " +(3.14*r*r));
	}
	void Triangle(int l, int b)
	{
		System.out.println("Area of Triangle is " +(0.5*l*b));		 
	}
	void Rectangle(int a)
	{
		System.out.println("Area of Rectangle is " +(a*a));		 
	}
	public static void main(String args[])
	{
		Shapes obj=new Shapes();
		obj.Circle(1.5);
		obj.Triangle(2,5);
		obj.Rectangle(4);
	}
}


Output:
Area of Circle is 7.064
Area of Triangle is 5.0
Area of Rectangle is 16
