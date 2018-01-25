package unit;

import static org.junit.Assert.*;
import org.junit.Test;
import main.Length;

public class LongestWordTest {

	private String input = "The cow jumped over the moon.";

	/**
	 * Testing the functionalities in Length.class
	 */
	@Test
	public void testAdd() {
		Length len = new Length();
		assertEquals("jumped",len.findLongestWord(input)); 
		assertEquals(6,len.getMaxLength());
	}

}
