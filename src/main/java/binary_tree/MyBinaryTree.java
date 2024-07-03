package binary_tree;

public class MyBinaryTree {

}

class TreeNode {
    String val;
    TreeNode left;
    TreeNode right;

    public TreeNode(String val) {
        this.val = val;
    }
    public TreeNode(String val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode TN(String val) {
        return new TreeNode(val);
    }

    public static TreeNode TN(String val, TreeNode left, TreeNode right) {
        return new TreeNode(val, left, right);
    }

}
