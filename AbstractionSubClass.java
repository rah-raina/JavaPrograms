package test.OOPS.abstraction;

public class AbstractionSubClass extends AbstractionSuperClass{
	
	private int workingHours;

	public AbstractionSubClass(String name, int pay, int workinghr) {
		super(name, pay);
		this.workingHours = workinghr;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void testAbstractMethods() {
		
		int sal = getPayment() * workingHours;
		
		System.out.println("Implementation of Abstract method in Child Class " + sal + " of "+ getEmpName());
		
	}

}
