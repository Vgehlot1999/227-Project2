package lab2;

public class StringTest 
{
	public static void main(String[] args)
	{
		String message;
		
		message = "Hello, world!";
		System.out.println(message);
		
		int theLength = message.length();
		System.out.println(theLength);
		
		char theChar = message.charAt(0);
		System.out.println(theChar);
		
		theChar = message.charAt(1);
		System.out.println(theChar);
		
		/**
		 * the largest index that can be used without an error is 12.
		 * This is because while the length of the string is 13, a 
		 * string index will always start at 0.
		 */
		theChar = message.charAt(12);
		System.out.println(theChar);
		
		System.out.println(message.toUpperCase());
		
		System.out.println(message.substring(0,  5));
		
		System.out.println(message.replace('o', '*'));
	}
}

	

