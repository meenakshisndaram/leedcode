package median;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7,11};
        int[] nums2 = {2, 4, 6, 8, 10};

        // Merge and sort the arrays
        int[] mergedArray = mergeAndSortArrays(nums1, nums2);

        // Print the merged and sorted array
        System.out.print("Merged and Sorted Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        // Find and print the median
        double median = findMedian(mergedArray);
        System.out.println("\nMedian: " + median);
    }

    // Method to merge and sort two arrays
    public static int[] mergeAndSortArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] mergedArray = new int[n + m];
        int k = 0;

        // Merge both arrays
        for (int i = 0; i < n; i++) {
            mergedArray[k++] = nums1[i];
        }
        for (int j = 0; j < m; j++) {
            mergedArray[k++] = nums2[j];
        }

        // Sort the merged array (using Bubble Sort here)
        for (int i = 0; i < mergedArray.length - 1; i++) {
            for (int j = 0; j < mergedArray.length - i - 1; j++) {
                if (mergedArray[j] > mergedArray[j + 1]) {
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j + 1];
                    mergedArray[j + 1] = temp;
                }
            }
        }

        return mergedArray;
    }

    // Method to find the median
    public  static double findMedian(int[] mergedArray) {
        int length = mergedArray.length;

        if (length % 2 == 1) {
            // Odd length: Return the middle element
            return mergedArray[length / 2];
        } else {
            // Even length: Return the average of the two middle elements
            int mid1 = mergedArray[(length / 2) - 1];
            int mid2 = mergedArray[length / 2];
            return (mid1 + mid2) / 2.0;
        }
    }
}
