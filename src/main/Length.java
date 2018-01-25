package main;

public class Length {

	private int maxLength;

	/**
	 * @param input String for which you want longest word
	 * @return The longest word.
	 */
	public String findLongestWord(String input) {
		String longestWord = "";
		String[] words = input.split("\\s+");
		maxLength =words[0].length();
		for(int i=0; i<words.length; i++){
			if(maxLength < words[i].length()){
				longestWord = words[i];
				maxLength = words[i].length();
			}
		}
		System.out.println("Longest Word : "+longestWord);
		return longestWord;
	}

	/**
	 * @return The maximum length of the word.
	 */
	public int getMaxLength() {
		System.out.println("Maximum length of the word : "+maxLength);
		return maxLength;
	}
}
