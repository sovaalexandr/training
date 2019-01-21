package com.github.sovaalexandr.tree_from_preorder_traversal;

/**
 * {@see https://practice.geeksforgeeks.org/problems/construct-tree-from-preorder-traversal/1}
 */
public class ConstructTree
{
    public AbstractNode constructTree(int[] pre, char[] preLN)
    {
        AbstractNode root = null;
        for (int i = 0; i < pre.length; i++) {
            AbstractNode current = null;
            final char indicator = preLN[i];
            final int value = pre[i];
            if ('N' == indicator) {
                current = new Node(value);
            }
            if ('L' == indicator) {
                current = new Leaf(value);
            }
            if (null == root) {
                root = current;
                continue;
            }
            root.addNode(current);
        }
        return root;
    }
}
