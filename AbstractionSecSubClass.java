package test.OOPS.abstraction;

public class AbstractionSecSubClass extends AbstractionSuperClass {

	public AbstractionSecSubClass(String name, int pay) {
		super(name, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void testAbstractMethods() {
		
		int sal = getPayment() * 8;
		
		System.out.println("Implementation of Abstract method in Child Class " + sal + " of "+ getEmpName());
		
	}

}
