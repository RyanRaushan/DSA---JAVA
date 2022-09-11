package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {23, 12, 1};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int j = 0;
        for (int i = m; i < m+n; i++){
            
            nums1[i] = nums2[j];
            j++;
        }
        
        Arrays.sort(nums1);
    }
}
