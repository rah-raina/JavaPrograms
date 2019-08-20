package test.JavaPrograms;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter string to check");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println(str);
		String rev = "";
		
		for(int i = str.length()-1; i>=0;i--) {
			rev = rev + str.charAt(i); 
			System.out.println(rev);
		}
		
		System.out.println(rev);
		
		if(rev.equals(str)) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}
	}

}
