package sjsu.edu.shruti.interfaces;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInterface {

	 
	 @Test 
	 public void testDot() 
	 {
		 shape dottedLines = new dottedLines(); 
		 String dottedlines = dottedLines.Draw();
		 Assert.assertEquals("..................................",dottedlines);
	 } 
	 
	 @Test
	 public void testDashedLine()
	 {
		 shape dashedLine = new dashedLines();
		 String dashedline = dashedLine.Draw();
		 Assert.assertEquals("-----------------------------------", dashedline);
	 }  

}
