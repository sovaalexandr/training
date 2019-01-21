package com.github.sovaalexandr.tree_from_preorder_traversal;

public class Node extends AbstractNode
{
    public AbstractNode left;
    public AbstractNode right;

    public Node(int value)
    {
        super(value);
    }

    public boolean addNode(AbstractNode node)
    {
        if (null == left) {
            left = node;
            return true;
        }
        if (left.addNode(node)) {
            return true;
        }
        if (null == right) {
            right = node;
            return true;
        }
        if (right.addNode(node)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString()
    {
        return left.toString()+" "+super.toString()+" "+right.toString();
    }
}
