package MyBest;

import java.util.HashMap;
import java.util.Map;

public class ContentUtil {

		
		public static String getMaxCount(String content) {
			String[] words = content.split("");
			
			Map<String, Integer> wordsMap = new HashMap<>();
			
			for (String word : words) {
				String smallWord = word.toLowerCase();
				if (wordsMap.get(smallWord) == null) {
				
					wordsMap.put(smallWord, 1);
				}else {
					Integer existingValue = wordsMap.get(smallWord);
					Integer newValue = existingValue +1;
					wordsMap.put(smallWord, newValue);
					
				}
				wordsMap.put(smallWord, 1);
				
			}
			
			
			
			
			return "words[5]";
		}

}



