package sjsu.edu.shruti.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 
public class ElectronicBrands
{
	static ArrayList<String> electronicBrands;
 
  public static void main(String[] args)
  {
	electronicBrands = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    int choice;
    System.out.println("\n\t\tPlease select one of the options below:");
    do {
            System.out.println("\n1.Add\n2.Delete \n3.Sort\n4.Search\n5.Display list\n6.Exit");
            System.out.println("\nEnter your choice : ");
          	choice = input.nextInt();
			switch (choice) 
			{
                case 1:	System.out.println("Enter the Brand name to add in the list: ");
                		String name = input.next();
                		electronicBrands = addBrand(electronicBrands, name);
                		break;
                case 2:
                		System.out.println("Enter the name to delete : ");
                		String name1 = input.next();
                		removeBrand(name1);
                		break;
                   
        
               case 3:
            	   		Collections.sort(electronicBrands);
            	   		System.out.println("Alphabetically Sorted Brands list contains : " + electronicBrands);
            	   		break;
                    
               case 4:
            	   		System.out.println("Enter the name to search : ");
            	   		String name2 = input.next();
            	   		int index = Collections.binarySearch(electronicBrands,name2);
            	   		System.out.println("Brand"+name2+" found at position: " + (index+1));
            	   		break;
            	   		
               case 5:
            	   		displayList();
            	   		break;
            }
        } while (choice != 6);
		
    
 }
	
	private static void displayList() 
	{
		for (int i = 0; i < electronicBrands.size(); i++) 
		{
			String value = electronicBrands.get(i);
			System.out.println("\t"+(i+1)+") " + value);
		}
	}
	
	private static void removeBrand(String name)
	{
		electronicBrands.remove(name);
		System.out.println("Entry deleted from the list!!! ");
	}
	
	protected static ArrayList<String> addBrand(ArrayList<String> electronicBrands,String name)
	{
		
		electronicBrands.add(name);
		System.out.println("Entry added to the list ");
		return electronicBrands;
	}
}
     
