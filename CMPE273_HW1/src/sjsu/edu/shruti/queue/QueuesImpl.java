package sjsu.edu.shruti.queue;
import java.io.*;

class QueuesImpl 
{

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String[] students = new String[10];
    int front = 0, rear = 0, count = 0;
	String item;


    void addStudent(String item, int noOfStudents) //enqueue
   {
    	
            if (count < noOfStudents)
            {
                students[rear] = item;
                rear++;
                count++;
            }
            else
            {
                System.out.println("Waitlist is Full !!");
            }
       
        
    }

    String deleteStudent(int noOfStudents) //dequeue
    {
        String item = null;
    	if (count != 0) 
        {
    		item = students[front];
            System.out.println("Moved " + students[front] +" from the waitlist to confirm list");
            front++;
            count--;
        } else 
        {
            System.out.println("Waitlist is Empty");
        }
        if (rear == noOfStudents) 
        {
            rear = 0;
        }
		return item;
    }

    void displayWaitlist() 
    {
        int j = 0;
        if (count != 0)
        {
        	for (int i = front; j < count; i++,j++) 
            {
                System.out.println((i+1)+") " + students[i]);
            }
        } else 
        {
        	System.out.println("\nNo Students in the waitlist\n");
        }
        
    }
}

