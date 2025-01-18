package lengthOfLongestSubstring;

import java.util.HashSet;

class Solution23 {
    public int lengthOfLongestSubstring(String s) {
        // Create a HashSet to store characters of the current window
        HashSet<Character> set = new HashSet<>();

        int left = 0, right = 0, maxLength = 0;
System.out.println(s.length());
        // Use the sliding window technique
        while (right < s.length()) {
            // If the character is not in the set, add it and move right pointer
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);

            }
            // If character is in the set, remove the leftmost character and move left pointer
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}
class Mainn {
    public static void main(String[] args) {
        Solution23 solution = new Solution23();

        // Example 1
        String input1 = "abcabcbb";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(input1)); // Output: 3

        // Example 2
        String input2 = "bbbbb";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(input2)); // Output: 1

        // Example 3
        String input3 = "pwwkew";
        System.out.println("Input: " + input3);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(input3)); // Output: 3

    }
}
