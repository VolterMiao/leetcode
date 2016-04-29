package leetcode338;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountingBitsTest {

	private CountingBits testObj;
	
	@Before
	public void setUp() throws Exception {
		testObj = new CountingBits();
	}
	
	@Test
	public void testCountBits() {
		int[] actuals = testObj.countBits(5);
		assertArrayEquals(new int[]{0,1,1,2,1,2}, actuals);
	}

}
