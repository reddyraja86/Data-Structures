package ArrayList;

public class ArrayListRaju {

	private int dataArray[];
	private int size = 0;
	private int loadFactor;

	public ArrayListRaju(int loadFactor) {
		this.loadFactor = loadFactor; // pass the load factor from your arraylist
		dataArray = new int[loadFactor]; // create initial data sturcture with the given loadfactor
	}

	/**
	 * Methods Available =============================== 
	 * public void add(data);
	 * public void add (index,data); 
	 * public boolean remove(index) public int
	 * get(index)
	 * length()
	 * 
	 * 
	 * Underlying data structure is Array
	 */

	/*
	 * Add element to the Array when the list size is extended it will create a new
	 * array with load factor size and copy the element to the new Array
	 * 
	 * time complexity o(n) when the underlying array list size is filled up and we
	 * need to create a new array with the double load factor size and copy the
	 * elements
	 * 
	 * worst case creating new array and copying N elements There might be some
	 * space vastage as we may create more than what the size is required
	 * 
	 * 
	 */
	public void add(int data) {
		if (size < dataArray.length) {
			dataArray[size] = data;
		} else {
			// Array filled up so create an array with double size and copy the elements to
			// new array
			int[] tempArray = new int[dataArray.length + loadFactor]; // New Array with the current array + load factor
			// TODO : check how many times the array will increment its size
			for (int i = 0; i < dataArray.length; i++) {
				tempArray[i] = dataArray[i];
			}
			dataArray = tempArray;
			dataArray[size] = data;
		}
		size++;
	}

	/**
	 * 
	 * THIS METHOD WILL ADD ELEMENT IN PARTICULAR INDEX Worst case it will move the elements to N positions O(n)
	 * 
	 **/

	public void add(int index, int data) {
		// Check the array index with in the avaialble elements in array
		if (index < size) {
			// This will check by adding an array at a particular position will shift the
			// elements to the right  position this might increase the array size
			if (size > dataArray.length) {
				// We need to create a new array and copy those elements
				int[] tempArray = new int[dataArray.length + loadFactor]; // New Array with the current array + load
																			// factor
				// TODO : check how many times the array will increment its size
				for (int i = 0; i < dataArray.length; i++) {
					tempArray[i] = dataArray[i];
				}
				dataArray = tempArray;
			}

			for (int i = size; i <=  index; i--) {
				dataArray[i] = dataArray[i++];
			}
			dataArray[index] = data;
			// TODO How it is working with out incrementing the size variable
		} else {
			System.out.println("----------Adding at last index----------");
			add(data);
		}

	}
	
	/**
	 * REMOVE THE ELEMENT AT AN INDEX 
	 * 
	 * Shifts the elements to the left side 
	 * Time complexity worst case it will take O(N) time to when we remove first element as we need to move all the lements to left side
	 * 	 
	 */
	public void remove(int index) {
		if(index<size) {
			for(int i=index ; i<size ;i++) {
				dataArray[i] = dataArray[i+1];
			}
			size--;
		}else {
			System.out.println("--- Cannot remove elements out if index ----");
		}
		
	}

	public int get(int index) {
		return dataArray[index];
	}

	public int size() {
		// return size==0?0:size-1;
		return size;
	}

}
