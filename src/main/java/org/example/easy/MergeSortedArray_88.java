package org.example.easy;

import java.util.Arrays;

public class MergeSortedArray_88 {

    public static void main(String[] args) {

        int[] a = {1};
        int[] b = {};

        MergeSortedArray_88 k = new MergeSortedArray_88();
        k.merge(a, 1, b, 0);
        System.out.println(Arrays.toString(a));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;

        while(k >= 0 && j >= 0){
            if (i >= 0 && nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}
