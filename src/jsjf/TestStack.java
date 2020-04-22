package jsjf;

import jsjf.exceptions.EmptyCollectionException;

/**
 * TestStack is a test application that completely tests the ArrayStack class
 * @author Matthew Golden
 * @version 1.0
 * Programming Project 4 - ArrayStack_MDG
 * Spring/2020
 */
public class TestStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayStack DEFAULT = new ArrayStack();
		System.out.println(DEFAULT.isEmpty());
		System.out.println(DEFAULT.toString());
		try {
			DEFAULT.pop();
		}
		catch (EmptyCollectionException e)
		{
			System.out.println("EXCEPTION: Cannot do pop operation while stack is empty");
		}
		ArrayStack<Object> stack = new ArrayStack<Object>(4);
		
		Object element = new Object();
		Object element1 = new Object();
		Object element2 = new Object();
		Object element3 = new Object();
		Object element4 = new Object();
		
		System.out.println(stack.isEmpty());
		
		stack.push(element);
		stack.push(element1);
		stack.push(element2);
		stack.push(element3);
		stack.push(element4);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.toString());
		
		System.out.println("\n" + stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.size());
		try {
		System.out.println(stack.peek());
		}
		catch (EmptyCollectionException e) {
			System.out.println("EXCEPTION: Cannot do peek operation while stack is empty");
		}
		
		try {
			System.out.println(stack.pop());
		}
		catch (EmptyCollectionException e) {
			System.out.println("EXCEPTION: Cannot do pop operation while stack is empty");
		}
		
	}//end main
}//end class
