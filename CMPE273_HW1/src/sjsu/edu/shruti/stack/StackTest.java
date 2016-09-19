package sjsu.edu.shruti.stack;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StackTest 
{
	Stack<Character> stack;
	 @Before 
	 public void initialize() 
	 {
		stack = new Stack<Character>();
		stack.push('S');
		stack.push('H');
		stack.push('R');
		stack.push('U');
		stack.push('T');
		stack.push('I');
		 
	 } 

	@Test
	public void testPushInStack()
	{
		Stack actual = CheckPalindrome.pushInStack("SHRUTI");
		
		Assert.assertEquals(stack, actual);
	}

	@Test
	public void testPrepareReverseString()
	{
		String actual =CheckPalindrome.prepareReverseString(stack);
		String expected ="ITURHS";
    	 Assert.assertEquals(expected,actual);
	}

}