package test.JavaPrograms;

import java.util.Scanner;

public class TestData {

	public static void main(String[] args) {
		int a =  0;
		int b =  0;
		int c =  0;
		int d =  0;
		int e =  0;
		
		for (int i = 1; i<=17; i++ ) {
		// TODO Auto-generated method stub
		System.out.println("Enter Total Loan Account");
		
		Scanner s = new Scanner(System.in);
		
		int totalLoanAcnt = s.nextInt();
		
		System.out.println("Loan Type Count");
		
		Scanner s1 = new Scanner(System.in);
		
		int loanCount = s1.nextInt();
		
		
										
				if(totalLoanAcnt > 20 || loanCount >=4 ) {
					a++;
					boolean f = (totalLoanAcnt > 20);
					boolean f1 = (loanCount >=4 );
					System.out.println("A");
					System.out.println("totalLoanAcnt "  + f);
					System.out.println("loanCount "  + f1);
				} else if (totalLoanAcnt > 10 || loanCount == 3 ) {
					b++;
					boolean f = (totalLoanAcnt > 10);
					boolean f1 = (loanCount ==3 );
					System.out.println("B");
					System.out.println("totalLoanAcnt "  + f);
					System.out.println("loanCount "  + f1);
				} else if (totalLoanAcnt >=5  || loanCount == 2 ) {
					c++;
					boolean f = (totalLoanAcnt >=5);
					boolean f1 = (loanCount ==2 );
					System.out.println("C");
					System.out.println("totalLoanAcnt "  + f);
					System.out.println("loanCount "  + f1);
				} else if (totalLoanAcnt > 0 || loanCount == 1 ) {
					d++;
					boolean f = (totalLoanAcnt >=0);
					boolean f1 = (loanCount ==1);
					System.out.println("D");
					System.out.println("totalLoanAcnt "  + f);
					System.out.println("loanCount "  + f1);
				}  else {
					e++;
				}			
				
				
			
		}
		
		
		System.out.println("A " + a);
		System.out.println("b " + b);
		System.out.println("c " + c);
		System.out.println("d " + d);
		System.out.println("e " + e);

	}

}
