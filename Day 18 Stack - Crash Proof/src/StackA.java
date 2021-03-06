import java.util.Stack;

//My stack created for day 16 - 19
public class StackA {
	
	//make a new stack 
	Stack<Integer> myStack = new Stack<Integer>();

	//function to push
	public Stack Push(int newNumber) {
		//add the number to the stack
		myStack.push(newNumber);
		
		//return the stack
		return myStack;
	}
	
	//function to "pop"
	public Stack Pop() {
		//remove the number from the stack
		myStack.pop();
		
		//return the stack
		return myStack;
	}

	//function to "peek"
	public Stack Peek() {
		//get the top number of the stack
		myStack.peek();
		
		//return the stack
		return myStack;
	}
	
	//function to clear the stack
	public Stack Clear() {
		//clear the stack
		myStack.clear();
		
		//return the stack
		return myStack;
	}
}

