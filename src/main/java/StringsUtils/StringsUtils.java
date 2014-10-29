package StringsUtils;

/**
 * Utility for operations on common String manipulation.
 * @author ajay.patel
 *
 */
public class StringsUtils 
{
	
	/***
	 * getMaximumOcurringCharacter(final String inputString)
	 * get the maximum occurring character in inputString
	 * @param inputString
	 * @return
	 */
	public static char getMaximumOccurringCharacter(final String inputString){
	   
	   if(inputString != null && inputString.length() !=0){
			final char[] inputStringArray= inputString.toCharArray();
			int countChar[] =new int[59]; 
			int maxOccurance = 0;
			int charToReturn=0;
			int index = 0;
			for (char i : inputStringArray) {
				index = (int)i -64;
				countChar[index]=(countChar[index])+1;
				if(maxOccurance < countChar[index]){
					maxOccurance=countChar[index];
					charToReturn=index+64;
				}
			}
			return (char)charToReturn;
		}
		else{
			throw new NullPointerException();
		}
   }
	
	/***
	 * getUniqueCharString(final String inputString)
	 * This method removes duplicate characters from the String
	 * @param inputString
	 * @return String 
	 */
	public static String getUniqueCharString(final String inputString){
		final char[] inputCharArray = inputString.toCharArray();
		final int countChar[] =new int[59]; 
		char[] outputArray = new char[inputCharArray.length];
		int index = 0;
		for (char c : inputCharArray) {
			if(countChar[((int)c -64)] ==1){
				outputArray[index]= c;
				index++;
			}
			countChar[((int)c -64)] = countChar[((int)c -64)]+1;	
		}
		return charArraytoString(outputArray);
	}
	
	/***
	 * Remove all the characters present in removalString from sourceString
	 * @param sourceString
	 * @param removalString
	 * @return
	 */
	public static String removeCharFromString(final String sourceString, final String removalString){
		final char[] removalCharArray = removalString.toCharArray();
		final char[] sourceArray = sourceString.toCharArray();
		final int countChar[] =new int[59]; 
		for (char c : removalCharArray) {
			if(countChar[((int)c -64)] ==0){
				countChar[((int)c -64)] = countChar[((int)c -64)]+1;
			}
		}
		for (int i=0;i<sourceArray.length;i++) {
			char c = sourceArray[i];
			if(countChar[((int)c -64)] !=0){
				sourceArray[i] ='\u0000';
			}
		}
		return charArraytoString(sourceArray);
	}
	
	/**
	 * getFirstNonRepeatingCharacter(final String inputString)
	 * API to find first non-repeating character in the input string(input is fairly a small string, use getFirstNonRepeatingCharacterFromStream(final String inputString) for StringStream
	 * @param inputString
	 * @return non-repeating character and if there is none, returns a space character
	 */
	public static char getFirstNonRepeatingCharacter(final String inputString){
		int count[]= new int[256];
		char inputChar[] = inputString.toCharArray();
		for (char c : inputChar) {
			count[(int)c] ++;
		}
		
		for (char c : inputChar) {
			if(count[(int)c] ==1){
				return c;
			}
		}
		return ' ';
	}
	
	/***
	 * isPalindrom(final String  inputString)
	 * API to find if inputString is a Palindrome
	 * @param inputString
	 * @return boolean
	 */
	public static boolean isPalindrome(final String  inputString){
		final char inputStringChar[] = inputString.toCharArray();
		final int length = (inputString.length());
		for (int i = 0; i < length/2; i++) {
			if(inputStringChar[i] != inputStringChar[length-i-1])
				return false;
		}
		return true;
	}
	
	
	/***
	 * charArraytoString(final char[] inputArray)
	 * API helps in creating String out of character array. Character array is scanned only for the available characters and empty characters are ignored.
	 * @param inputArray
	 * @return
	 */
	public static String charArraytoString(final char[] inputArray) {
		String finalResult = new String();
		for (char c : inputArray) {
			if(c !='\u0000'){
				finalResult=finalResult + ((Character)c).toString();
			}
		}
		return finalResult;
	}
	
	/***
	 * 
	 */
	public static int wordCountInString(final String inputString){
		return inputString.split("([\\W\\s]+)").length;
	}
	
	
	
}
