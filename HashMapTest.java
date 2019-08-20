package test.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("A","Rahul");
		hm.put("B","Raina");
		hm.put("C","Chitra");
		
		Iterator<Map.Entry<String, String>> itr = hm.entrySet().iterator(); 
        
		while(itr.hasNext()) {
			Map.Entry<String,String> entry = itr.next();
			
			System.out.println(entry);
			
		}
		
		 for (Map.Entry<String,String> entry : hm.entrySet())  
	            System.out.println("Key = " + entry.getKey() + 
	                             ", Value = " + entry.getValue()); 
	    } 

}
