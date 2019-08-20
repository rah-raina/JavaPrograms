package test.JavaPrograms;

import java.util.Scanner;

public class AverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		float avg;
		
		int sum = a + b + c;
		
		avg = (sum)/3;
		
		int rem = (sum)%3;
		
		System.out.println(avg);
		System.out.println(rem);
	}

}
