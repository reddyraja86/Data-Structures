package ArrayList;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayListRaju a = new ArrayListRaju(5);

		for (int i = 0; i < 7; i++) {
			a.add(i);
		}

		printArray(a);
		
		a.add(4, 10);
		
		System.out.println("-----After adding '10' at index 1 ---------");
		
		printArray(a);
		
		a.add(100);
		
		printArray(a);
		
		a.add(40, 200);
		
		printArray(a);
		
		a.remove(4);

		printArray(a);
	}

	public static void printArray(ArrayListRaju a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + "    ");

		}
		System.out.println();
	}

}
