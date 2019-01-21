package com.github.sovaalexandr.maximum_length_chain_of_pairs;

public class RootNode extends Node
{
    @Override
    public String path()
    {
        return "";
    }

    @Override
    protected ContainerNode newNode(Pair pair)
    {
        return ContainerNode.of(pair);
    }
}
