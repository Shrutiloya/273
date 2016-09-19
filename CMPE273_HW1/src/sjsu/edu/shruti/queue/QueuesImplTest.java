package sjsu.edu.shruti.queue;
import java.util.Queue;
import org.junit.Assert;
import org.junit.Test;

public class QueuesImplTest 
{
	QueuesImpl que = new QueuesImpl();
	@Test
	public void testEnqueue() 
	{
		que.addStudent("Jill",4);
		Assert.assertEquals("Jill", que.deleteStudent(4));
	}
	
}
