package sjsu.edu.shruti.array;

import java.util.Scanner;
 
class NameArray 
{
  public static void main(String []args) 
  {
    int n;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of names to be compared:");
    n = input.nextInt();
    System.out.print("Enter " + n + " Names\n ");
   

    String[] names = new String[9];
    for(int i=0;i< n; i++)
    {
    	names[i] = input.next();
    }
    
        
    sortNamesByLength(n, names);
    System.out.println("\n\tThe Maximum length name is :"+names[0]);
    input.close();
  }

public static void sortNamesByLength(int n, String[] names)
{
	String tempStr;
	for (int i = 0; i < n - 1; i++)
    {
        for (int j= 0; j < n - i -1; j++) 
        {
            if(names[j+1].length() >(names[j].length())) 
            {
                tempStr = names[j];
                names[j] = names[j + 1];
                names[j + 1] = tempStr;
            }
        }
    }
}
}