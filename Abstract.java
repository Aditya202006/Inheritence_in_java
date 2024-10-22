//  Write a JAVA program for abstract class to find araes of differnt shapes

import java.util.*;
abstract class A
{
	abstract void circle(double r);
	abstract void triangle(int h, int b);
	abstract void square(int a);
}
class Shapes extends A
{
	void circle(double r)
	{
		System.out.println("Area of Circle is " +(3.14*r*r));
	}
	void triangle(int h, int b)
	{
		System.out.println("Area of Triangle is " +(0.5*h*b));		 
	}
	void square(int a)
	{
		System.out.println("Area of Square is " +(a*a));		 
	}
	public static void main(String args[])
	{
		Shapes obj=new Shapes();
		obj.circle(1.5);
		obj.triangle(2,5);
		obj.square(4);
	}
}


Output:
Area of Circle is 7.064
Area of Triangle is 5.0
Area of Square is 16
