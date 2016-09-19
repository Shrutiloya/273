package sjsu.edu.shruti.generic;

import java.util.Scanner;

public class GenericMethod
{
	public static Object plus(Object a, Object b)
	{
		if (Integer.class.isInstance(a) && Integer.class.isInstance(b))
		{
			return Integer.parseInt(a.toString ()) + Integer.parseInt(b.toString());
		} 
		else if (String.class.isInstance(a) && String.class.isInstance(b))
		{
			return a.toString() + b.toString();
		}
		return null;
	}

	public static void main(String args[])
	{
		System.out.println("Enter your choice.");
		System.out.println("1. Sum");
		System.out.println("2. Concatenation");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if (choice == 1) 
		{
			System.out.println("Enter 2 numbers.\n");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = (int) plus(a, b);
			System.out.println("Your answer is " + sum + ".");
		} 
		else if (choice == 2)
		{
			System.out.println("Enter 2 strings.");
			String a = sc.next();
			String b = sc.next();
			String concatenation = plus(a, b).toString();
			System.out.println("Your answer is " + concatenation + ".");
		}
		else 
		{
			System.out.println("Invalid choice.");
		}
		sc.close();
	}

}