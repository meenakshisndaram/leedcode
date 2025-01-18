package regularexpressionmatching;

public class Solution {

    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Base case: Empty string matches empty pattern
        dp[0][0] = true;

        // Handle patterns with '*' that can match empty string
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sChar = s.charAt(i - 1);
                char pChar = p.charAt(j - 1);

                if (pChar == '.' || sChar == pChar) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pChar == '*') {
                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (sChar == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example Test Cases
        System.out.println(solution.isMatch("aa", "a"));        // Output: false
        System.out.println(solution.isMatch("aa", "a*"));       // Output: true
        System.out.println(solution.isMatch("ab", ".*"));       // Output: true
        System.out.println(solution.isMatch("aab", "c*a*b"));   // Output: true
        System.out.println(solution.isMatch("mississippi", "mis*is*p*.")); // Output: false

        // Additional Test Cases
        System.out.println(solution.isMatch("hello", "h.*o"));  // Output: true
        System.out.println(solution.isMatch("abcdef", ".*"));   // Output: true
        System.out.println(solution.isMatch("", "c*"));         // Output: true
        System.out.println(solution.isMatch("aaaa", "a*"));     // Output: true
        System.out.println(solution.isMatch("ab", ".*c"));      // Output: false
    }
}
