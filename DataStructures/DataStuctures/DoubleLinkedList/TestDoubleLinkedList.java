package DoubleLinkedList;

public class TestDoubleLinkedList {

	public static void main(String[] args) {

		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		doubleLinkedList.add(10);
		doubleLinkedList.add(20);
		doubleLinkedList.add(30);
		doubleLinkedList.add(40);
		doubleLinkedList.add(50);
		
		for(int i=0;i<doubleLinkedList.size;i++){
			System.out.println(doubleLinkedList.get(i));
		}
		
		doubleLinkedList.add(2,300);
		
		System.out.println();
		
		for(int i=0;i<doubleLinkedList.size;i++){
			System.out.println(doubleLinkedList.get(i));
		}
		
	}

}
