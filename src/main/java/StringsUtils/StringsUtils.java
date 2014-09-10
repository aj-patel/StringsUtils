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
}
