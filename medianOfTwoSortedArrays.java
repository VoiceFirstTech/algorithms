class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] finalNums = new int[nums1.length + nums2.length];
        int i1 = 0;
        int i2 = 0;
        // Combine arrays
        for (int i = 0; i < finalNums.length; i++) {
            if (i1 >= nums1.length) {
                finalNums[i] = nums2[i2];
                i2++;
            } else if (i2 >= nums2.length) {
                finalNums[i] = nums1[i1];
                i1++;
            } else if (nums1[i1] < nums2[i2]) {
                finalNums[i] = nums1[i1];
                i1++;
            } else {
                finalNums[i] = nums2[i2];
                i2++;
            }
        }
        // Find Median
        double median = 0;
        if (finalNums.length % 2 == 0) {
            median = (double)(finalNums[(finalNums.length / 2) - 1] + finalNums[finalNums.length / 2]) / 2;
        } else if (finalNums.length == 1) {
            median = finalNums[0];
        } else {
            median =  finalNums[finalNums.length / 2];
        }
        return median;
    }
}
