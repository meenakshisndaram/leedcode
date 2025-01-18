package Numberof1Bits;

class Solution {
    public int hammingWeight(int n) {
        int count = 0; // To count the number of set bits
        while (n != 0) {
            count += n & 1; // Add 1 to count if the least significant bit is 1
            n >>>= 1; // Unsigned right shift (fills the leftmost bit with 0)
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 11; // Example number
        System.out.println("Input: " + n);
       // System.out.println("Binary: " + Integer.toBinaryString(n)); // Print binary representation
        System.out.println("Hamming Weight: " + solution.hammingWeight(n));
    }
}
