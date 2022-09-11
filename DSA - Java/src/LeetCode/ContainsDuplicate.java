package LeetCode;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {2, 3, 45, 56, 76, 2, 3, };
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
                
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
