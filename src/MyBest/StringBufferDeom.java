package MyBest;

public class StringBufferDeom 
{
	public static void main(String[] args) {
	//Create StringBuffer object
    StringBuffer sb = new StringBuffer("Cat eats rats");

    /* public String substring(int startIndex): It returns the
     * substring starting from the index startIndex
     */
    String substr = sb.substring(4);
    {
    System.out.println("Substring starting from index 6: "+substr);
    }
    /* public String substring(int startIndex, int endIndex): It 
     * returns substring starting from startIndex and ending at 
     * endIndex-1.
     */
    String substr2 = sb.substring(5,12);
    {System.out.println("Substring: From Index 5 to 12 : "+substr2);

}}}