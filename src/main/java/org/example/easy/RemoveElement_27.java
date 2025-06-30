package org.example.easy;

import java.util.Arrays;

public class RemoveElement_27 {

    public int removeElement(int[] nums, int val) {
        if(nums.length ==0){
            return 0;
        }
        if(nums.length == 1){
            if(nums[0] == val){
                return 0;
            }
            return 1;
        }
        int left = 0;
        int right = nums.length - 1;
        int count = nums.length;
        outer: while (left < count){
            if(nums[left] == val){
                count--;
                while (nums[right] == val && left < right){
                    count--;
                    right--;
                    if(left>=right){
                        break outer;
                    }
                }
                nums[left] = nums[right];
                right--;
                left++;
            }
            else if(nums[right] == val){
                right--;
                count--;
            }
            else {
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2,2,3};
        int k = 2;

        RemoveElement_27 app = new RemoveElement_27();
        System.out.println(app.removeElement(arr, k));
    }
}
