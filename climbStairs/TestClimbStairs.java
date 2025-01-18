package climbStairs;

public class TestClimbStairs {
    public static void main(String[] args) {
        // Test cases
        int[] testCases = {1, 2, 3, 4, 5};

        System.out.println("Number of ways to climb stairs:");
        for (int n : testCases) {
            System.out.println("n = " + n + ", ways = " + climbStairs(n));
        }
    }

    public static int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int first = 0;  // Start with 0 for step 0
        int second = 1; // Start with 1 for step 1
        for (int i = 1; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
}
