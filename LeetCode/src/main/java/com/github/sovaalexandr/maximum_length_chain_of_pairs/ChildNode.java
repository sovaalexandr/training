package com.github.sovaalexandr.maximum_length_chain_of_pairs;

public class ChildNode extends ContainerNode
{
    private final ContainerNode parent;

    private ChildNode(final Pair pair, final ContainerNode parent)
    {
        super(pair);
        this.parent = parent;
    }

    public static ContainerNode of(final Pair pair, final ContainerNode parent) {
        return new ChildNode(pair, parent);
    }

    @Override
    public String path()
    {
        return parent.path()+"; "+super.path();
    }

    @Override
    public ContainerNode newNode(Pair pair)
    {
        return new ChildNode(pair, this);
    }
}
