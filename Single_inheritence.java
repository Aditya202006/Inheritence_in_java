// Write a java program to implement single inheritence.

class A{
	public void methodA(){
		System.out.println("Parent Class");
	}
 }
class B extends A{
	public void methodB(){
		System.out.println("Child Class");
	}
 public static void main(String args[]){
 	B obj = new B();
 	obj.methodA();
 	obj.methodB();
   }
}

// Output:
Parent Class
Child Class
