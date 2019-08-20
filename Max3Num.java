package test.JavaPrograms;

import java.util.Scanner;

public class Max3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("No are" + a + b + c);
		
		// 5,2,8
		
		if(a>b && a>c) {
			System.out.println(a +" is max");
		} else if(b>a && b>c){
			System.out.println(b + " is max");
		} else {
			System.out.println(c + " is max");
		}
		

	}

}
