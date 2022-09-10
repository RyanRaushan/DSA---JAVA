package Codestudio;

public class MaximumSubarraySum{
    public static void main(String[] args) {
        int[] arr = {-1, -3, 3, 4, -5, 6, 1, -4, 9};
        System.out.println(maxSubarraySum(arr, arr.length));
    }

    public static long maxSubarraySum(int[] arr, int n) { 
        
        long maxSum = Long.MIN_VALUE;
        long currSum = 0;
        
        for (int i = 0; i < arr.length; i++){
            currSum = currSum + arr[i];
            
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            
            if (currSum < 0){
                currSum = 0;
            }
        }
        
        if (maxSum < 0){
            return 0;
        }
        else{
            return maxSum;
        }
    }

}