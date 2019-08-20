package test.JavaPrograms;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter more than 2 digit number");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int a = num;
		
		//33
		//rem = 33/10 
		//b = b * 10 + rem,  
		//
		
		int rev = 0;
		
		while(num>0) {
		
		int rem = num%10;
		System.out.println(rem);
		
		
		rev = rev *10 + rem;
		System.out.println(rev);
		
		num = num/10;
		System.out.println(num);
		}		
		
		if(rev==a) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}
		
		
		

	}

}
