package isbalancedtree;

class TreeNode8 {
    int val;
    TreeNode8 left;
    TreeNode8 right;

    TreeNode8() {}
    TreeNode8(int val) {
        this.val = val;
    }
    TreeNode8(int val, TreeNode8 left, TreeNode8 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution15 {
    public boolean isBalanced(TreeNode8 root) {
        return height(root) != -1;
    }

    private int height(TreeNode8 node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = height(node.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Solution15 sol = new Solution15();


        TreeNode8 root1 = new TreeNode8(3);
        root1.left = new TreeNode8(9);
        root1.right = new TreeNode8(20, new TreeNode8(15), new TreeNode8(7));

        System.out.println("Is balanced (Example 1): " + sol.isBalanced(root1)); // Output: true


        TreeNode8 root2 = new TreeNode8(1);
        root2.left = new TreeNode8(2, new TreeNode8(3, new TreeNode8(4), new TreeNode8(4)), null);
        root2.right = new TreeNode8(2);

        System.out.println("Is balanced (Example 2): " + sol.isBalanced(root2)); // Output: false
    }
}
