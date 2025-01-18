package sametree;

class  TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2() {}

    TreeNode2(int val) {
        this.val = val;
    }

    TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution6{
    public boolean isSameTree(TreeNode2 p, TreeNode2 q) {

        if (p == null && q == null) {
            return true;
        }


        if (p == null || q == null) {
            return false;
        }


        return (p.val == q.val)
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {

        TreeNode2 p1 = new TreeNode2(1, new TreeNode2(2), new TreeNode2(3));
        TreeNode2 q1 = new TreeNode2(1, new TreeNode2(2), new TreeNode2(3));


        TreeNode2 p2 = new TreeNode2(1, new TreeNode2(2), null);
        TreeNode2 q2 = new TreeNode2(1, null, new TreeNode2(2));

        Solution6 solution = new Solution6();


        System.out.println("Example 1: " + solution.isSameTree(p1, q1)); //

        System.out.println("Example 2: " + solution.isSameTree(p2, q2)); //
    }
}
