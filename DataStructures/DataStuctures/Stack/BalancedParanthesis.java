package Stack;

import java.util.List;


/**
 * 
 * @author rrayappa
 * 
 * 
 * 	Balanced paranthesis when opening brace should have a valid closed parathesis
 * 
 * 	Vaid cases {[()]} or () or {()}
 * 
 *  Invalid cases   )( or [{)}]
 *  
 *   
 *   Approach
 *   		Iterate through all the characters
 *   		If we found {[( these characters  Add the  symbol to the stack
 *   		else 
 *   			 if list contains }]) characters 
 *   				The list is empty then it will be direct failure
 *   				 or
 *   				then pop the stack and check with the popped character it should be respective opening brace
 *   				or 
 *   			failure
 *   		After the process the stack should be empty
 *
 */

public class BalancedParanthesis {

	private String data;

	public BalancedParanthesis(String data) {
		this.data = data;
	}

	public boolean checkBalancedParanthesis() {
		Stack stack = new Stack();

		for (int i = 0; i < data.length(); i++) {
			char value = data.charAt(i);
			if (value == '{' || value == '[' || value == '(' || value == '}' || value == ']' || value == ')') {
				if (value == '{' || value == '[' || value == '(') {
					stack.push(data.charAt(i));
				} else {
					// If stack is empty and strig containe }]) directly then it is a  failure
					if (stack.isEmpty()) {
						return false;
					} else {
						char topValue = (char) stack.pop();
						if (value == '}' && topValue != '{') {
							return false;
						} else if (value == ']' && topValue != '[') {
							return false;
						} else if (value == ')' && topValue != '(') {
							return false;
						}
					}
				}

			}
		}
		//After this the stack should be Empty 
		if(stack.isEmpty()){
			return true;
		}
		return false;
	}

}
