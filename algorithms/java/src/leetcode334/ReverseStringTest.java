package leetcode334;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {
	
	private ReverseString testObj = new ReverseString();

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testreverseString() {
		String s0 = null;
		String s1 = "";
		String s2 = "hello";
		
		assertNull(testObj.reverseString(s0));
		assertTrue("".equals(testObj.reverseString(s1)));
		assertTrue("olleh".equals(testObj.reverseString(s2)));
	}

}
