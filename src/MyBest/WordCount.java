package MyBest;

public class WordCount {
	//private static final String content1 = "the book is on the table";
	private static final String content2 = "In 2006, however, the film was a commercial flop. It "
			+ "grossed less than $70 million, a huge loss for a film that cost $76 "
			+ "million to make. At Oscar time, it was largely overlooked, "
			+ "earning three nominations but none for acting, directing, or for Best Picture. "
			+ "Its studio, Universal, never quite figured out how to sell it — an astoundingly "
			+ "bleak sci-fi picture devoid of fun gadgets or futuristic set design, in which"
			+ " Julianne Moore, the most marketable star, gets shot dead 28 minutes in. "
			+ "It debuted at the Venice Film Festival on September 3, 2006";
	
	public static void main(String[] args) {
		
		 String repeatedWord = ContentUtil.getMaxCount(content2);
		System.out.println(repeatedWord);
		//System.out.println(ContentUtil.);
	}
}
