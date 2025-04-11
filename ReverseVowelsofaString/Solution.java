package ReverseVowelsofaString;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        Solution solution = new Solution();
        String result = solution.reverseVowels(s);
        System.out.println(result); // Output: AceCreIm
    }
}
