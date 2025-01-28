package SUMMARYRANGES;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ranges;
        }

        int start = nums[0]; // Start of the current range

        for (int i = 1; i <= nums.length; i++) {
                 if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                             ranges.add(String.valueOf(start));
                } else {

                    ranges.add(start + "->" + nums[i - 1]);
                }
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }

        return ranges;
    }

    public static void main(String[] args) {
        int[] ar = {0, 1, 2, 4, 5, 7};
        // Expected output: ["0->2", "4->5", "7"]

        Solution solu = new Solution();
        List<String> summaryRanges = solu.summaryRanges(ar);
        System.out.println(summaryRanges);
    }
}
