package StringsUtils;

/***
 * Utility class which provides many common operations on String manipulation.
 * @author ajay.patel
 *
 */
public class StringsUtils 
{
    /***
     * getMaximumOccuringCharacter(final String inputString)
     * Finds maximum occurring character in given inputString
     * @param inputString
     * @return char
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
	
	
}
