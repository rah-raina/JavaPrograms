package test.OOPS.inheritance;


public class ParentClass {
	
	private String name;
	
	private int age; 
	
	public ParentClass(String n , int a){
		
		this.name = n;
		this.age = a;	
		
	}
	
	public void parentmethod(){
		System.out.println("Parent Method");
	}
	
	public void parentmethod1(){
		System.out.println("Parent Method 1");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
