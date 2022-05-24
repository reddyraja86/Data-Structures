/**
 * 
 * Max rain trapped
 * Given n non-negative integers representing an elevation map where the width
 * of each bar is 1, compute how much water it is able to trap after raining.
 * 
 * Solution One :
 * Rain trapped at an index is = min(max(left) ,max(right)) - height(i)
 * for every element calculate max left and max right and find the water add all
 * the trapped water data
 * Timecomplexity : o(n^2)
 * 
 * Soltion Two :
 * Take two arrays of same length as input
 * In one array Calculate the max element from left at an index and store them
 * In second array Calculate the mx element from right at an index and store
 * them
 * Itereate thought array and find the trapped water
 * 
 * Time complexity : O(n)
 * Space Complexity : O(n)+o(n)
 * 
 * 
 */

public class RainTrap {

    public static void main(String[] args) {

    }
}
