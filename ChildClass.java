package test.OOPS.inheritance;

public class ChildClass extends ParentClass {
	
	
	
	public ChildClass(String n, int a) {
		super(n, a);
		// TODO Auto-generated constructor stub
	}

	public void parentMethod(int val) {
		System.out.println("Parent Method in child class with " + val);
	}
	
}
