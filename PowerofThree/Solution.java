package PowerofThree;
class Solution {
    public boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }


        while (n % 3 == 0) {
            n /= 3;
        }


        return n == 1;
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("27 is power of three: " + sol.isPowerOfThree(27)); // true
        System.out.println("9 is power of three: " + sol.isPowerOfThree(9));   // true
        System.out.println("45 is power of three: " + sol.isPowerOfThree(45)); // false
        System.out.println("1 is power of three: " + sol.isPowerOfThree(1));   // true
        System.out.println("0 is power of three: " + sol.isPowerOfThree(0));   // false
    }
}
