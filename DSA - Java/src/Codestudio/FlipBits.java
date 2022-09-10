package Codestudio;

public class FlipBits {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0 ,0, 1};
        System.out.println(flipBits(arr, arr.length));
    }
// This is optimized solution in this solution time complexity is O(N).
    public static int flipBits(int[] arr,int n) {
        int maxOnes = 0;
        int countOnes = 0;
        int currMax = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == 1){
                countOnes++;
            }
            
            int val = 0;
            if (arr[i] == 1){
                val = -1;
            }else{
                val = 1;
            }
            currMax = Math.max(val, currMax+val);
            maxOnes = Math.max(maxOnes, currMax);
        }
        maxOnes = Math.max(0, maxOnes);
        return (countOnes + maxOnes);
	}

    // This is Brute force solution in this solution time complexity is O(N^2).
    public static int flipBits0(int[] arr,int n) {
        int maxOnes = 0;
        int countOnes = 0;
        
        for (int i = 0; i < n; i++){
            if (arr[i] == 1){
                countOnes++;
            }
            
            int count0 = 0, count1 = 0;
            for (int j = i; j < n; j++){
                if (arr[j] == 0){
                    count0++;
                }
                if (arr[j] == 1){
                    count1++;
                }
                maxOnes = Math.max(maxOnes, count0-count1);
            }
        }
        return (countOnes + maxOnes);
    }
}
