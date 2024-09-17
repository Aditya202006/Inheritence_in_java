// Write a program to implement Multi level inheritence

class A{
	public void methodA(){
		System.out.println("Parent class");
	}
}
class B extends A{
	public void methodB(){
		System.out.println("Child class");
	}
}
class C extends B{
	public void methodC(){
		System.out.println("Class C");
	}
}
class Demo{
	public static void main(String args[]){
		C obj = new C();
		obj.methodA();
		obj.methodB();
		obj.methodC();
	}
} 


//Output:
Parent class
Child class
Class C
