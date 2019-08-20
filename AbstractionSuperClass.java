package test.OOPS.abstraction;

public abstract class AbstractionSuperClass {
	
	private String empname;
	private int payment; 
	
	public AbstractionSuperClass(String name, int pay) {
		
		this.empname = name;
		this.payment = pay;
	}
	
	public abstract void testAbstractMethods() ;
	
	public void testNonAbstractMethods() {
		
		System.out.println("Non Abstract Method");
	}
	
	public String getEmpName() {
		return empname;
	}
	
	public int getPayment() {
		return payment;
	}

}
