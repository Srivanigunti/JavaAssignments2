import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTest 
{
	private Date date;
	
	@Before
	public void setUp()
	{
		date = new Date(18,11,1996);
	}

	@Test
	public void testForDate()
	{
		String result =date.toString();
		assertEquals("18/11/1996",result);
	}
	
	@Test
	public void testForOnlyDate()
	{
		boolean result = date.isSmaller(date);
		assertTrue(result);
	}
	
	@Test
	public void testForDifferenceDate()
	{
		int expected[] = {14,5,24};
		assertArrayEquals(expected,date.diff(date));
	}
}
