import java.util.Scanner;
import java.util.Stack;

/*
 * 
 */
public class Solution {

	/*
	 * 
	 */
	static boolean parseInput(String input) {
	
		Stack<Character> stack = new Stack<Character>();
		char	c;
		
		// **** ****
		for (int i = 0; i < input.length(); i++) {
			
			// **** ****
			switch (c = input.charAt(i)) {
			case '{':
			case '(':
			case '[':
				stack.push(c);
				break;

			case '}':
				if (stack.isEmpty())
					return false;
				if (!stack.pop().equals('{'))
					return false;
				break;
			case ')':
				if (stack.isEmpty())
					return false;
				if (!stack.pop().equals('('))
					return false;
				break;
			case ']':
				if (stack.isEmpty())
					return false;
				if (!stack.pop().equals('['))
					return false;
				break;
			}
		}
		
		// **** check for remaining characters in the stack ****
		if (!stack.isEmpty())
			return false;	
		
		// **** ****
		return true;
	}
	
	
	/*
	 * 
	 */
	public static void main(String[] args) {
		
		// **** ****
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();

//			System.out.println("input ==>" + input + "<==");

			System.out.println(parseInput(input) ? "true" : "false");
		}
		
		// **** ****
		sc.close();
		
	}

}
