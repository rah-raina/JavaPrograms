package test.Collections;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayProgram a = new ArrayProgram();
		
	//	a.createArray();

		a.maxNum();
	}
	
	
	private void stringArrayComparison() {
		// TODO Auto-generated method stub
		
		String str = "MUMMBAUI"; //MUBAI MBAUI
		
		String[] strArray = str.split("");
		String strArray1 = new String();
		
		for(int i = 0; i<strArray.length;i++) {
			if(!strArray1.contains(strArray[i])) {
				strArray1 = strArray1.concat(strArray[i]);
			}
			
		}
		
		System.out.println(strArray1);
		
	}
	
	
	private void stringPalindrom() {
		// TODO Auto-generated method stub
		
		String str = "MUBBUM"; //MUBAI MBAUI
		
		String[] strArray = str.split("");
		String strArray1 = new String();
		
		for(int i = strArray.length-1;i>=0;i--) {
			strArray1 = strArray1.concat(strArray[i]);
		}
		
		if(strArray1.equals(str) ) {
			System.out.println("PALINDROM");
		}
		
		
	}
	
	private void intPalindrom() {
		// TODO Auto-generated method stub
		
		int int1 = 120021; 
		
		int int3 = int1;
		
		int int2 = 0;  
		
		while(int1>0){
			int rem =  int1%10;
			
			int2 = int2 *10 + rem;
			
			int1 = int1/10; 
		}
		
		if(int3 == int2) {
			System.out.println("PALINDROM");
		}
		
		
	}
	
	private void maxNum() {
		// TODO Auto-generated method stub
		
		int[] int1 = new int[]{22,84,56};
		int largNo = int1[0] ;
		int smallNo = int1[0] ;
		
		for(int i = 0; i<int1.length-1;i++) {
			if(int1[i]>largNo) {
				largNo=int1[i];
			} 
		}
		
		
		System.out.println(largNo);
		
		for(int i = 0; i<int1.length-1;i++) {
			if(int1[i]<smallNo) {
				smallNo=int1[i];
			} 
		}
		
		System.out.println(smallNo);
		
		
	}
	
	public void createArray() {
		int[] numArray = new int[5];
		
		for(int i = 0 ; i < numArray.length;i++) {
			numArray[i] = (i+1)  + numArray[i];
		}
		
		
		for(int i = 0 ; i < numArray.length;i++) {
			System.out.println(numArray[i]);
			
		}
	}

}
