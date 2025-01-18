package HappyNumber;

import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        // Set to track numbers that have been seen during the process
        HashSet<Integer> seen = new HashSet<>();
        
        // Repeat the process until we find a cycle or reach 1
        while (n != 1) {
            int sum = 0;
            // Calculate the sum of squares of digits
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            
            // If we've seen this sum before, there's a cycle, so return false
            if (seen.contains(sum)) {
                return false;
            }
            
            // Add the sum to the set of seen numbers
            seen.add(sum);
            
            // Update n to the sum of squares of its digits
            n = sum;
        }
        
        // If we reach 1, it's a happy number
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Happy number
        int n1 = 19;
        System.out.println("Is " + n1 + " a happy number? " + solution.isHappy(n1));
        
        // Test case 2: Not a happy number
        int n2 = 2;
        System.out.println("Is " + n2 + " a happy number? " + solution.isHappy(n2));
    }
}
