package test.OOPS.abstraction;

import test.OOPS.inheritance.ParentObject;

public class testAbstraction extends ParentObject{
	
	testAbstraction t = new testAbstraction();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractionSubClass ab = new AbstractionSubClass("Rahul", 2000, 5);
		AbstractionSecSubClass ab1 = new AbstractionSecSubClass("TRai", 9000);
		
		
		ab.testNonAbstractMethods();
		ab.testAbstractMethods();
		ab1.testNonAbstractMethods();
		ab1.testAbstractMethods();
		

	}
	
	public void testtt() {
		System.out.println(t.protectedp);
	}

}
