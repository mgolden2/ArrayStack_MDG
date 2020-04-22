package jsjf;

import java.util.Scanner;
/**
 * Application is an application that reads a sentence from the user and prints the sentence with the characters in each word backwards. 
 * @author Matthew Golden
 * @version 1.0
 * Programming Project 4 - ArrayStack_MDG
 * Spring/2020
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		char c;
		
		do {
			scan = new Scanner(System.in);
			String s;
			System.out.print("Type a sentence: ");
			s = scan.nextLine();
			System.out.println("Reversed: " + reverseString(s));
			System.out.println("\nWould you like to enter another sentence?");
			c = scan.next().charAt(0);
			if(c != 'Y' && c != 'y')
				System.out.println("<GOODBYE>");
		}
		while(c == 'Y' || c == 'y');

	}//end main
	
	/**
	 * reverseString returns the same string entered except the words are return with their characters backward.
	 * @param s
	 */
	public static String reverseString(String s) {
		
		ArrayStack<Character> stack = new ArrayStack<Character>(s.length());
		String r = "";
		String[] arr = s.split(" ");
		for(int j = 0; j < arr.length; j++) {
			for(int i = 0; i < arr[j].length(); i++)
				stack.push(arr[j].charAt(i));
			for(int k = 0; k < arr[j].length(); k++)
				r += stack.pop();
			if(r.length() < s.length())
				r += " ";
		}
		return r;
		
	}//end reverseString
}//end class
