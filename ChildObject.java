package test.OOPS.inheritance;

public class ChildObject extends ParentObject { 
	
	ChildObject() {
		System.out.println("child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildObject c = new ChildObject();
		System.out.println("-----prints parent and child-----------");
		ParentObject p = new ParentObject();
		System.out.println("-----prints parent-----------");
		ParentObject p1 = new ChildObject();
		System.out.println("-------prints parent and child---------");
		
		ChildObject c2 = (ChildObject) p1;
		System.out.println("-------prints parent and child ---------");
		
		/*ChildObject c1 = (ChildObject) new  ParentObject(); 
		System.out.println("-------prints parent and error of casting ---------");
		
		
		*/
		
	}

}

