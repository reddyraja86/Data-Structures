package Stack;

public class SolvePostfixExpression {
	String expression = "";

	public SolvePostfixExpression(String expression) {
		this.expression = expression;
	}

	public int solvePrefixExpression() {
		Stack s = new Stack();

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (Character.isDigit(ch)) {
				s.push(Character.getNumericValue(ch));
			}
			// Here it will be an operator
			else {
				int first = s.pop();
				int second = s.pop();
				if (ch == '+') {
					s.push(first + second);
				} else if (ch == '-') {
					s.push(first - second);
				} else if (ch == '*') {
					s.push(first * second);
				} else if (ch == '/') {
					s.push(first / second);
				}
			}
		}

		return s.pop();
	}

}
