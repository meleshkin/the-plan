package binary_tree;

import java.util.*;

import static binary_tree.TreeNode.TN;

public class BinaryTreeProblems {
    public static void main(String[] args) {
        TreeNode root = TN("F");

        TreeNode rootLeft = TN("B", TN("A"), TN("D", TN("C"), TN("E")));
        root.left = rootLeft;

        TreeNode rootRight = TN("G", null, TN("I", TN("H"), null));
        root.right = rootRight;


        TreeNode root2 = TN("F");

        TreeNode rootLeft2 = TN("B", TN("A"), TN("D", TN("C"), TN("E")));
        root2.left = rootLeft2;

        TreeNode rootRight2 = TN("G", null, TN("I", TN("H"), null));
        root2.right = rootRight2;

        //System.out.println(inorderTraversal(root));
        /*
        List<String> r =new ArrayList<>();
        inorderTraversalRec(root, r);
        System.out.println(r);
        */

        System.out.println(sameTree(TN("1", null, TN("2")), TN("1", null, TN("2"))));

    }

    public static boolean sameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
             return root2 == null;
        }
        if (root2 == null) return false;

        if (!Objects.equals(root1.val, root2.val)) {
            return false;
        }

        boolean isSameLeft = sameTree(root1.left, root2.left);
        boolean isSameRight = sameTree(root1.right, root2.right);

        return isSameLeft && isSameRight;

    }

    public static int maxDepthBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = maxDepthBinaryTree(root.left);
            int right = maxDepthBinaryTree(root.right);

            return Math.max(left, right) + 1;
        }
    }


    public static String sumOfLeftLeaves(TreeNode root) {
        return goSumOfLeftLeaves(root, false);
    }

    public static String goSumOfLeftLeaves(TreeNode root, boolean include) {
        if (root == null) {
            return "";
        }

        String v = "";
        if(include && root.left == null && root.right == null) {
           v = root.val;
        }
        String s1 = goSumOfLeftLeaves(root.left, false);
        String s2 = goSumOfLeftLeaves(root.right, false);
        return s1 + s2 + v;
    }


    public static java.util.List<String> levelOrderTraverse(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> stack = new LinkedList<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.poll();
            result.add(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }

        }

        return result;
    }


    public static void preorderTraversalRec(TreeNode root, List<String> res) {
        if (root != null) {
            res.add(root.val);
            preorderTraversalRec(root.left, res);
            preorderTraversalRec(root.right, res);
        }
    }

    public static void inorderTraversalRec(TreeNode root, List<String> res) {
        if (root != null) {
            inorderTraversalRec(root.left, res);
            res.add(root.val);
            inorderTraversalRec(root.right, res);
        }
    }

    public static java.util.List<String> postorder(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();

        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }

            if (node.right != null) {
                stack.add(node.right);
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static java.util.List<String> preorderTraversal(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode node = stack.pop();
            result.add(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return result;
    }
}
