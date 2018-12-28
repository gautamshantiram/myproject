package MyBest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxAgeArray1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(40, "Shanti");
		map.put( 23, "Nisan");
		map.put(32, "Biplav");
		map.put(22, "Ganesh");
		map.put(33, "Abinash");
		map.put(30, "Mikesh");
		map.put(20, "Genete");
		map.put(35, "Indira");
		map.put(26, "Reema");
		map.put(27, "Ashif");
		map.put(32, "Rajan");
		map.put(55, "Ajay");
		
		int maxAge=(Collections.max(map.keySet())); 
        for (Entry<Integer, String> entry : map.entrySet()) { 
            if (entry.getKey()==maxAge) {
                System.out.println("The name with max age person in the list is :"+entry.getKey()+"  "+entry.getValue()); 

            }}}}
                
      
//		System.out.println("===================================================================================================");
//		System.out.println("Key without Value    -->  "+mp.keySet());
//		System.out.println("Value without Key    -->  "+mp.values());
//
//		System.out.println("===================================================================================================");
//
//		System.out.println("Value with Key  -->  "+mp);

	


