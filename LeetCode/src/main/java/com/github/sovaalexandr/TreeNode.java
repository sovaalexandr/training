package com.github.sovaalexandr;

public class TreeNode
{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TreeNode treeNode = (TreeNode) o;

        if (val != treeNode.val) {
            return false;
        }
        if (left != null ? !left.equals(treeNode.left) : treeNode.left != null) {
            return false;
        }
        return right != null ? right.equals(treeNode.right) : treeNode.right == null;
    }
}
