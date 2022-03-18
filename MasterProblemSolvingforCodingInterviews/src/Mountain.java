public class Mountain {
    /**
     * Given an integer array arr, return the length of the longest subarray, 
     * which is a mountain. Return 0 if there is no mountain subarray.
     * Input: arr = [2,1,4,7,3,2,5]
     * Output: 5
     * Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
     */
    public static void main(String args[]) {
        System.out.println("==== Mountain ====");
        int arr[] = { 5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4 };
        mountainSOlution(arr);
        findPeakElements(arr);
    }
    /**
     * 
     *  Solution : For problmes like mountai and peaks
     *  1. Find all the peack elemen ( Element with left is low and right is low)
     *  2. From the peak count  all element whcih are high from left side
     *  3. From the peak count alll elements which are low on right side
     *  4. Add left and right count
     *  
     * Follow the above for all the peak eleements 
     */

    public static void mountainSOlution(int arr[]) {


    }
    static void findPeakElements(int arr[]){
        int maxMountainHeight = 0;
        if(arr.length>1){
            for(int i=1;i<arr.length-1;i++){
                if((arr[i-1]<arr[i]) && (arr[i+1] <arr[i])){
                    System.out.println(arr[i]);
                    int height = findLengthOfThePeak(i, arr);
                    maxMountainHeight = (height > maxMountainHeight)  ? height:maxMountainHeight ;
                }
            }
        }
        System.out.println( "Maximum Mountain Height is ======="+maxMountainHeight);
    }
    static int findLengthOfThePeak(int index, int arr[]){
        int length=0;
        int i=index-1;
        int j =index+1;
        int prevValue = arr[index];
        while (i>=0){
            if(arr[i]<prevValue){
                prevValue = arr[i];
                i--;
                length++;
            }
            else{
                break;
            }
            
        }
         prevValue = arr[index];
        while(j<arr.length){
            if(arr[j]<prevValue){
                prevValue = arr[j];
                j++;
                length++;
            }
            else{
                break;
            }
        }
        System.out.println( "Length of the peak"+arr[index]+"is----"+ (length+1));
        return length+1;
    }
}
