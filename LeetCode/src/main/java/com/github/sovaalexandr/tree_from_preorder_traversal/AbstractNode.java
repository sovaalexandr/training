package com.github.sovaalexandr.tree_from_preorder_traversal;

abstract public class AbstractNode
{
    private final int value;

    public AbstractNode(int value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return String.valueOf(value);
    }

    abstract public boolean addNode(AbstractNode node);
}
