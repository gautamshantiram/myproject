package MyBest;

public class StringDemo {
	
		public static void main(String args[]) {
		       String str1 = "A";
		       String str2 = "a";
		       String str3 = "A";

		       
		       System.out.println("str1 compare to str2---> "+str1.compareToIgnoreCase(str2));

		       
		      //System.out.println(str1.compareTo( str3 );

		       int k = str2.compareTo("compareTo method example");
		       System.out.println("str2 & string argument comparison: "+k);
		int j =str3.compareTo(str1);
	       System.out.println("str3 & str1 argument comparison: "+j);

		
		
	   }
	
	
	
	
	
	
	
	

}
