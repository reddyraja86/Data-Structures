package Stack;

public class ReverseString {
	
	char data[];
	
	public ReverseString(String s) {
		data = s.toCharArray();
	}
	
	//Using Stack implementation
	public String reverString() {
		Stack s= new Stack();
		for(Character c : data) {
			s.push(c);
		}
		String temp = "";
		for(int i=0;i<data.length;i++) {
			temp=temp+(char)s.pop();
		}
		
		return temp;
	}
	
	
	//Using Array 
	public String reverString2() {
		int start =0,end =data.length-1; 
		while(start<end) {
			char temp = data[start];
			data[start]  = data[end];
			data[end] = temp;
			start++;
			end--;
		}
		
		String temp = "";
		for(int i=0;i<data.length;i++) {
			temp=temp+data[i];
		}
		
		return temp;
	}

}
