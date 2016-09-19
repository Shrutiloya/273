package sjsu.edu.shruti.array;
import org.junit.Assert;
import org.junit.Test;


public class NameArrayTest {

	@Test
	public void testMaxLengthName()
	{
		String[] names = new String[3];
		names[0] = "Jack";
		names[1] = "Raphael";
		names[2] = "Jo";
		NameArray.sortNamesByLength(3,names);
		Assert.assertEquals("Raphael", names[0]);
	}


}