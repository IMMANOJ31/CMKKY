package infosys;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        right = left = null;
    }
}
public class BinaryTree {

    public static int height(TreeNode root){
        if (root == null){
            return  0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight,rightHeight);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);

        System.out.println("Height of tree: "+height(treeNode));
    }
}
