package reversebits;

public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {

            int bit = n & 1;

            result = (result << 1) | bit;

            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int input = 0b00000010100101000001111010011100; // 43261596 in decimal
        int output = solution.reverseBits(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
