package Array;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[] nums = {1,3,6,4,9,7};

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted array is:"+Arrays.toString(nums));
    }
}
