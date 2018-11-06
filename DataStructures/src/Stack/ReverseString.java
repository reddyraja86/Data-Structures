package Stack;

public class ReverseString {
	
	char data[];
	
	public ReverseString(String s) {
		data = s.toCharArray();
	}
	
	//Using Stack implementation
	public void reverString() {
		Stack s= new Stack();
		for(Character c : data) {
			s.push(c);
		}
		
		for(int i=0;i<data.length;i++) {
			data[i]=(char)s.pop();
		}
	}
	
	
	//Using Array 
	public void reverString2() {
		int start =0,end =data.length; 
		while(start<end) {
			char temp = data[start];
			data[start]  = data[end];
			data[end] = temp;
			start++;
			end--;
		}
	}

}
