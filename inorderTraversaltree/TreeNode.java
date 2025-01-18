package inorderTraversaltree;

import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solutions2{
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverseInorder(root, result);
        return result;
    }

    private void traverseInorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        traverseInorder(node.left, result);

        result.add(node.val);

        traverseInorder(node.right, result);
    }

    public static void main(String[] args) {
        // Create the binary tree
        // Tree structure:
        //              1
        //           /     \
        //          2       3
        //         / \        \
        //        4   5        8
        //           / \      /
        //          6   7    9

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);

        // Perform inorder traversal
        Solutions2 solution = new Solutions2();
        List<Integer> output = solution.inorderTraversal(root);

        // Print the output
        System.out.println("Inorder Traversal Output: " + output);
    }
}
