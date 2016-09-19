package sjsu.edu.shruti.collection;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class TestCollections 
{

	@Test
	public void testAddbrand()
	{
		ElectronicBrands e = new ElectronicBrands();
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Shruti", "Loya"));
		ArrayList<String> actual =  new ArrayList<String>();
		e.addBrand(actual,"Shruti");
		e.addBrand(actual,"Loya");
				
		assertEquals(expected,actual);
	}

}
