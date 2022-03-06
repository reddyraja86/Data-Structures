import java.util.HashSet;
import java.util.Set;

public class Pairs {

    public static void main(String args[])
    {

        
        System.out.println("====Hello world ======");


    }
    

    /**
     * naive method will take O(n^2)
     * If we use hasing then O(n) + additional Hash memory
     */

    private static methodOne(int a[],int sumNeeded){
        System.out.println("=====Method One =======");
        Set<Integer> s= new HashSet<>();
        for(int x:a){
            int valNeeded= sumNeeded-x;
            if(!s.contains(valNeeded) ){
                s.add(x);
            }
            else{
                System.out.println(x +" ----"+valNeeded);
            }
        }
        


    
    }
}
