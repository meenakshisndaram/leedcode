package maxDepthtree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        

        int maxDepth = (leftDepth > rightDepth) ? leftDepth : rightDepth;
        

        return maxDepth + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

         
        TreeNode root1 = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7) )
        );
        System.out.println("Example 1 Calculation:");
        System.out.println("Node 9 -> maxDepth = 1");
        System.out.println("Node 15 -> maxDepth = 1");
        System.out.println("Node 7 -> maxDepth = 1");
        System.out.println("Node 20 -> maxDepth = max(1, 1) + 1 = 2");
        System.out.println("Node 3 -> maxDepth = max(1, 2) + 1 = 3");
        System.out.println("Example 1 Output: " + solution.maxDepth(root1)); // Expected: 3


        TreeNode root2 = new TreeNode(1,
                null,
                new TreeNode(2)
        );
        System.out.println("\nExample 2 Calculation:");
        System.out.println("Node 2 -> maxDepth = max(0, 0) + 1 = 1");
        System.out.println("Node 1 -> maxDepth = max(0, 1) + 1 = 2");
        System.out.println("Example 2 Output: " + solution.maxDepth(root2)); // Expected: 2
    }}
