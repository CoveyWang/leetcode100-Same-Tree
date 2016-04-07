public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(4);
        treeNode1.left=treeNode2;
        treeNode3.left=treeNode4;
        System.out.println(solution.isSameTree(treeNode1,treeNode3));

    }
}
