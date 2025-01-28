package powerof2;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        for (; n > 1; n /= 2) {
            if (n % 2 != 0) {
                return false;
            }
        }

        return true; // If loop completes, n is a power of 2
    }

    public static void main(String... x) {
        int y = 8;
        Solution s = new Solution();
        boolean powerOf2 = s.isPowerOfTwo(y);
        System.out.println(powerOf2); // Outputs: true
    }
}
