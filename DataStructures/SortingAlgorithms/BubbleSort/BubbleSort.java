package BubbleSort;

public class BubbleSort {
	
	

	public int[] bubbleSort(int data[]){
		
		int i= data.length;
		while(i!=0){
			int j=1;
			while(j<i){
				if(data[j-1] > data[j]){
					int temp = data[j-1];
					data[j-1] = data [j];
					data[j] = temp;
				}
				j++;
			}
			i--;
		}
		
		return data;
	}
	
	
}
