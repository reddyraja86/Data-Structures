package Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		
		/**
		 * Test String Reversal
		 */
		//Using Stack Implementation
		ReverseString r = new ReverseString("ABCDEF");
		String reverse = r.reverString();
		
		System.out.println(reverse);
		
		//Using another method
		
		String  reverse1 = r.reverString2();
		
		System.out.println(reverse1);
		
		/**
		 * Test Balanced Parathesis
		 */
		
		BalancedParanthesis b = new BalancedParanthesis("{'{','(',')','}','[',']'}");
		System.out.println(b.checkBalancedParanthesis());	
		
		
	}

}
