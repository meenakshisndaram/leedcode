package pascl;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascl = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                     row.add(1);
                } else {
                    List<Integer> prevRow = pascl.get(i - 1);
                    row.add(prevRow.get(j - 1) + prevRow.get(j)); // Sum of two numbers above
                }
            }
            pascl.add(row);
        }
        return pascl;
    }

    public static void main(String[] args) {
        Solution118 sol = new Solution118();
        int numRows = 6;
        List<List<Integer>> result = sol.generate(numRows);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}

