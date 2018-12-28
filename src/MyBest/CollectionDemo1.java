package MyBest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollectionDemo1 {
	public static void main(String args[]){  
	List <String> list = new ArrayList<String>();  
	list.add("Shanti");  
	list.add("Rajan");  
	list.add("Biblav");  
	list.add("Ganesh");  
	list.add("Genet"); 
	Collections.sort(list);
	
	
	for (String s:list) {
		System.out.println(s);
	}
	  
	
	}

}
