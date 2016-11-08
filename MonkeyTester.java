/**
 * Brandon Hedges
 * Software Quality Assurance 
 * Deliverable 3
 */


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MonkeyTester 
{	
	/**
	 * Start at the Hoodpopper homepage
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		
	}
	
	/**
	 * Test goal - Test to make sure "on_sp" appears in the tokenized string when a space is entered.
	 * 
	 * This test starts at the Hoodpopper homepage. 
	 * Then the Webdriver enters a space into the code box and clicks the tokenize button. 
	 * The test then gets the tokenized string that is generated inside the code tag and 
	 * checks it for "on_sp" to make sure that the "on_sp" token shows up.
	 */
	@Test
	public void tokenizeSpaceTest() 
	{	
		
	}
		
}
