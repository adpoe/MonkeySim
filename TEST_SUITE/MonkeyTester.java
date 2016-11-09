/**
 * Brandon Hedges
 * Software Quality Assurance 
 * Deliverable 3
 */


import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.experimental.max.MaxCore;
import java.util.*;

public class MonkeyTester 
{	
	/**
	 * Test goal - To ensure that the monkey classes's generateId method 
	 * has the same output before and after performance modification.
	 * This test uses an input of 0 into generateID and compares 
	 * it's output to the same input in the updated method.
	 */
	@Test
	public void monkeyIDPinningTest0() 
	{	
		Monkey oldMonkey = new Monkey();
		MonkeyUpdated updatedMonkey = new MonkeyUpdated();
		
		int oldMonkeyID = oldMonkey.generateId(0);
		int updatedMonkeyID = updatedMonkey.generateId(0);
		
		assertEquals(oldMonkeyID, updatedMonkeyID);
	}
	
	/**
	 * Test goal - To ensure that the monkey classes's generateId method 
	 * has the same output before and after performance modification.
	 * This test uses an input of -1(To test negative input) into generateID and compares 
	 * it's output to the same input in the updated method.
	 */
	@Test
	public void monkeyIDPinningTestNeg() 
	{	
		Monkey oldMonkey = new Monkey();
		MonkeyUpdated updatedMonkey = new MonkeyUpdated();
		
		int oldMonkeyID = oldMonkey.generateId(-1);
		int updatedMonkeyID = updatedMonkey.generateId(-1);
		
		assertEquals(oldMonkeyID, updatedMonkeyID);
	}
	
	/**
	 * Test goal - To ensure that the monkey classes's generateId method 
	 * has the same output before and after performance modification.
	 * This test uses an input of 100(To test normal input that is not an edge case) into generateID and compares 
	 * it's output to the same input in the updated method.
	 */
	@Test
	public void monkeyIDPinningTestNormal() 
	{	
		Monkey oldMonkey = new Monkey();
		MonkeyUpdated updatedMonkey = new MonkeyUpdated();
		
		int oldMonkeyID = oldMonkey.generateId(100);
		int updatedMonkeyID = updatedMonkey.generateId(100);
		
		assertEquals(oldMonkeyID, updatedMonkeyID);
	}
	
	/**
	 * Test goal - To ensure that the monkey classes's generateId method 
	 * has the same output before and after performance modification.
	 * This test uses an input of MaxInt(To test the maximum possible integer input) into generateID and compares 
	 * it's output to the same input in the updated method.
	 */
	@Test
	public void monkeyIDPinningTestMax() 
	{	
		Monkey oldMonkey = new Monkey();
		MonkeyUpdated updatedMonkey = new MonkeyUpdated();
		
		int oldMonkeyID = oldMonkey.generateId(Integer.MAX_VALUE);
		int updatedMonkeyID = updatedMonkey.generateId(Integer.MAX_VALUE);
		
		assertEquals(oldMonkeyID, updatedMonkeyID);
	}
	
	/**
	 * Test goal - To ensure that the monkey classes's generateId method 
	 * has the same output before and after performance modification.
	 * This test uses an input of MinInt(To test the minimum possible integer input) into generateID and compares 
	 * it's output to the same input in the updated method.
	 */
	@Test
	public void monkeyIDPinningTestMin() 
	{	
		Monkey oldMonkey = new Monkey();
		MonkeyUpdated updatedMonkey = new MonkeyUpdated();
		
		int oldMonkeyID = oldMonkey.generateId(Integer.MIN_VALUE);
		int updatedMonkeyID = updatedMonkey.generateId(Integer.MIN_VALUE);
		
		assertEquals(oldMonkeyID, updatedMonkeyID);
	}
	

	
	/**
	 * Pinning test stringify with 100
	 */
	@Test
	public void stringifyResultsPinningTestZero() 
	{	
		Monkey oldMonkey = new Monkey();
		Monkey oldMonkey2 = new Monkey();
		
		MonkeyUpdated updatedMonkey = new MonkeyUpdated();
		MonkeyUpdated updatedMonkey2 = new MonkeyUpdated();
		
		String oldString = MonkeySim.stringifyResults(0, oldMonkey, oldMonkey2);
		String newString = MonkeySimUpdated.stringifyResults(0, updatedMonkey, updatedMonkey2);
		
		assertEquals(oldString, newString);
	}
	
	/**
	 * Pinning test stringify with neg
	 */
	@Test
	public void stringifyResultsPinningTestNeg() 
	{	
		Monkey oldMonkey = new Monkey();
		Monkey oldMonkey2 = new Monkey();
		
		MonkeyUpdated updatedMonkey = new MonkeyUpdated();
		MonkeyUpdated updatedMonkey2 = new MonkeyUpdated();
		
		String oldString = MonkeySim.stringifyResults(-1, oldMonkey, oldMonkey2) ;
		String newString = MonkeySimUpdated.stringifyResults(-1, updatedMonkey, updatedMonkey2);
		
		assertEquals(oldString, newString);
	}
	
	/**
	 * Pinning test stringify with 100
	 */
	@Test
	public void stringifyResultsPinningTestNormal() 
	{	
		Monkey oldMonkey = new Monkey();
		Monkey oldMonkey2 = new Monkey();
		
		MonkeyUpdated updatedMonkey = new MonkeyUpdated();
		MonkeyUpdated updatedMonkey2 = new MonkeyUpdated();
		
		String oldString = MonkeySim.stringifyResults(100, oldMonkey, oldMonkey2);
		String newString = MonkeySimUpdated.stringifyResults(100, updatedMonkey, updatedMonkey2);
		
		assertEquals(oldString, newString);
	}
	
	/**
	 * Pinning test stringify with Max int
	 */
	@Test
	public void stringifyResultsPinningTestMax() 
	{	
		Monkey oldMonkey = new Monkey();
		Monkey oldMonkey2 = new Monkey();
		
		MonkeyUpdated updatedMonkey = new MonkeyUpdated();
		MonkeyUpdated updatedMonkey2 = new MonkeyUpdated();
		
		String oldString = MonkeySim.stringifyResults(Integer.MAX_VALUE, oldMonkey, oldMonkey2);
		String newString = MonkeySimUpdated.stringifyResults(Integer.MAX_VALUE, updatedMonkey, updatedMonkey2);
		
		assertEquals(oldString, newString);
	}
	
	/**
	 * Pinning test stringify with Min int
	 */
	@Test
	public void stringifyResultsPinningTestMin() 
	{	
		Monkey oldMonkey = new Monkey();
		Monkey oldMonkey2 = new Monkey();
		
		MonkeyUpdated updatedMonkey = new MonkeyUpdated();
		MonkeyUpdated updatedMonkey2 = new MonkeyUpdated();
		
		String oldString = MonkeySim.stringifyResults(Integer.MIN_VALUE, oldMonkey, oldMonkey2);
		String newString = MonkeySimUpdated.stringifyResults(Integer.MIN_VALUE, updatedMonkey, updatedMonkey2);
		
		assertEquals(oldString, newString);
	}
		
}
