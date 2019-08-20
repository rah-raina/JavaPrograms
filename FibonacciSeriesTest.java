package test.JavaPrograms;

import java.util.Scanner;

public class FibonacciSeriesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		
		System.out.println("Enter num " + num);
		
		int a = 0;
		
		int b = 1;
		
		int c= 0;
		
		// 0,1,1,2,3,5
		
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i<num;i++){
			
			
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}

	}

}
