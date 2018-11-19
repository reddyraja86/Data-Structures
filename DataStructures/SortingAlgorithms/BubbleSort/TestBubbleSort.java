package BubbleSort;

public class TestBubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[] ={5,15,2,10,4};
		BubbleSort sort = new BubbleSort();
		int[] srtdArray  = sort.bubbleSort(data);
		
		System.out.println(srtdArray);
	}

}
