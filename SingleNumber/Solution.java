package SingleNumber;

class Solution {
    public int singleNumber(int[] nums) {
        int num = 0; // Initialize result as 0

         
        for (int n : nums) {
            num ^= n; // XOR operation
        }


        return num; // The single non-repeated number
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2}; // Test input
        Solution solution = new Solution();
        int nonRepeatNumber = solution.singleNumber(nums);
        System.out.println("The number that is not repeated is: " + nonRepeatNumber);
    }
}
