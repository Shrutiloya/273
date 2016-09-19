package sjsu.edu.shruti.interfaces;
import java.util.Scanner;


public class lineInterface
{
         
    public static void main(String[] args)
    {
    	  Scanner inputChoice = new Scanner(System.in);
          int choice;
          System.out.println("\n\t\tLine Types:");
          do {
                  System.out.println("\n1.Dotted Line\n2.Dashed Line \n3.Star Line\n4.Exit\n");
                  System.out.println("Enter your choice : ");
                	choice = inputChoice.nextInt();
  				switch (choice) {
                      case 1:
                    	  shape dotLine=new dottedLines();
                          String dottedlines = dotLine.Draw();
                          System.out.println("..................................");
                          break;
                      case 2:
                    	  shape dashedLine=new dashedLines();
                          String dashedline = dashedLine.Draw();
                          System.out.println(dashedline);
                          break;
              
                     case 3:
                    	 shape starLine=new starLines();
                         String starline =starLine.Draw();
                         System.out.println(starline);
                          break;
                  }
              } while (choice != 4);
    		
          inputChoice.close();
    }
}
 
interface shape
 {      
     public String Draw();     
      
 }
 class dottedLines implements shape
 {
 
    public String Draw() 
    {
        String dottedlines ="..................................";
        return dottedlines;
    }
 } 
      
 class dashedLines implements shape
 {
 
    public String Draw() 
    {
    	 String dashedlines ="-----------------------------------";
    	 return dashedlines;
    }
 }      

 class starLines implements shape
 {
 
    public String Draw() 
    {
    	String starlines ="************************************";
    	return starlines;
    }
 }      
