package sjsu.edu.shruti.generic;

import org.junit.Assert;
import org.junit.Test;

public class GenericMethodTest {

	@Test
	public void testPlusSum() 
	{
		int output = (int) GenericMethod.plus(4, 5);
		Assert.assertEquals(9, output);
	}
	
	@Test
	public void testPlusConcatenation()
	{
		String output = (String) GenericMethod.plus("Shruti ", "Loya");
		Assert.assertEquals("Shruti Loya", output);
	}

}
