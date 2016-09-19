package sjsu.edu.shruti.queue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueImplTest
{
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

@Before

public void setUpStreams() 
{
	System.setOut(new PrintStream(outContent));
	System.setErr(new PrintStream(errContent));
}

@Test

public void test()
{

	

//	Assert.assertEquals(expected, outContent.toString());

}

	/**

	* Initializes the list of Processes to be scheduled.

	* @return list of processes.

	*/

private List<Process> initializeProcesses()
{
	return null;

	
}

@After
public void cleanUpStreams() 
{

	System.setOut(null);

	System.setErr(null);

}

}

