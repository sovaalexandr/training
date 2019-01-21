package com.github.sovaalexandr.tree_from_preorder_traversal;

public class Leaf extends AbstractNode
{
    public Leaf(int value)
    {
        super(value);
    }

    public boolean addNode(AbstractNode node)
    {
        return false;
    }
}
