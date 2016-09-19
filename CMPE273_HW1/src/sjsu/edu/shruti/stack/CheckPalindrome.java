package sjsu.edu.shruti.stack;
import java.util.Stack;
import java.util.Scanner;

class CheckPalindrome 
{
	 static Stack<Character> stack =new Stack<Character>();
	 static String reverseString = "";

    public static void main(String[] args)
    {

    	System.out.print("Enter any string to check if its a Palindrome or not:");
        Scanner input=new Scanner(System.in);
        String originalString = input.nextLine();
        
       // Stack<Character> stack = new Stack<Character>();

        stack= pushInStack(originalString);
        reverseString = prepareReverseString(stack);
        displayResult(originalString, reverseString);

    }

    protected static String prepareReverseString(Stack<Character> stack)
	{
		while (!stack.isEmpty()) 
        {
            reverseString = reverseString+stack.pop();
        }
		return reverseString;
	}

	protected static Stack<Character> pushInStack(String inputString) 
	{
		for (int i = 0; i < inputString.length(); i++) 
        {
            stack.push(inputString.charAt(i));
        }
		return stack;
	}

	protected static void displayResult(String inputString, String reverseString) 
	{
		if (inputString.equals(reverseString))
            System.out.println("The input String "+inputString+" is a palindrome.");
        else
            System.out.println("The input String "+inputString+" is not a palindrome.");
	}
}