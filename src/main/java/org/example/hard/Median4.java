package org.example.hard;

/**
 * <p><b>4. Median of Two Sorted Arrays</b></p>
 * <p>Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.</p>
 * <p> url: <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/description/">leetcode</a> </p>
 */
public class Median4 {

    public static void main(String[] args) {
        double medianSortedArrays = findMedianSortedArrays(new int[]{}, new int[]{});
        System.out.println(medianSortedArrays);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length + nums2.length;

        boolean even = (n + 1) % 2 == 0;

        int index1 = 0;
        int index2 = 0;
        int lastVal = 0;
        Boolean skip = null;

        if (index1 == nums1.length) {
            skip = false;
        }
        if (index2 == nums2.length) {
            skip = true;
        }

        for (int i = 0; i < n; i++) {
            int current;
            if ((skip != null && skip) || ((index2 != nums2.length && index1 != nums1.length) && nums1[index1] < nums2[index2])) {
                current = nums1[index1++];
                if (index1 == nums1.length) {
                    skip = false;
                }
            } else {
                current = nums2[index2++];
                if (index2 == nums2.length) {
                    skip = true;
                }
            }
            if (even) {
                if (i == ((n + 1) / 2) - 1) {
                    return current;
                }
            } else {
                if (i == (n + 1) / 2) {
                    return (double) (lastVal + current) / 2;
                }
            }
            lastVal = current;
        }

        return 0d;
    }
}
