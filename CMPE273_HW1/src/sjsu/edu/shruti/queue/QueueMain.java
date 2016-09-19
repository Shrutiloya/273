package sjsu.edu.shruti.queue;
import java.io.IOException;
import java.util.Scanner;

class QueueMain 
{

    public static void main(String arg[]) 
    {
        Scanner inputChoice = new Scanner(System.in);
        int choice;
        QueuesImpl queue = new QueuesImpl();
        System.out.println("Enter the maximum capacity for the course :");
        int noOfStudents = inputChoice.nextInt();
	  
        System.out.println("\n\t\tWaitlist Queue for Subject 273:");
        do {
                System.out.println("\n1.Add to Waitlist\n2.Remove from Waitlist and confirm the seat \n3.Display the Waitlist\n4.Exit\n");
                System.out.println("Enter your choice : ");
              	choice = inputChoice.nextInt();
				switch (choice) {
                    case 1:
                    	   System.out.println("Enter Student name :");
                    	   String item = inputChoice.next();
                    	   queue.addStudent(item,noOfStudents);
                    	   break;
                    case 2:
                        queue.deleteStudent(noOfStudents);
                        break;
            
                   case 3:
                        queue.displayWaitlist();
                        break;
                }
            } while (choice != 4);
        
        inputChoice.close();
    }
}