package StringsUtils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class StringsUtilsTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StringsUtilsTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( StringsUtilsTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testGetMaximumOccurringCharacter()
    {
        assertTrue( StringsUtils.getMaximumOccurringCharacter("aaaabvcddd") == 'a' );
    }
    
    public void testRemoveCharFromString(){
    	assertTrue(StringsUtils.removeCharFromString("aaaaaaaaaaaaaaaaaAjay","a").equals("Ajy")) ;
    }
    
    public void testGetFirstNonRepeatingCharacter(){
    	assertTrue(StringsUtils.getFirstNonRepeatingCharacter("aaaaaaaaaa\n") =='\n');
    }
    
    public void testIsPalindrome(){
    	assertTrue(StringsUtils.isPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa") == false);
    }
    
    public void testWordCountInString(){
    	assertTrue(StringsUtils.wordCountInString("Hello this is ajay Patel") == 5 );
    }
 
}
