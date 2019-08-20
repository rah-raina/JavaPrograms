package test.OOPS.inheritance;

public class testInheritance extends ParentObject {
	
	testInheritance t = new testInheritance();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass p = new ParentClass("Rahul", 31);
		ChildClass c = new ChildClass("Chitra", 30);
		
		
		
		System.out.println("Parent call" + p.getAge() + p.getName());
		System.out.println("Child call" +c.getAge() + c.getName() );
		
		c.parentMethod(30);
		c.parentmethod();
		c.parentmethod1();
		p.parentmethod();
		p.parentmethod1();

	}

	public void tt() {
		System.out.println(t.defaultd);
		
	}
}
