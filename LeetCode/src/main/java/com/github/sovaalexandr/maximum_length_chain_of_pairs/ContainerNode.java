package com.github.sovaalexandr.maximum_length_chain_of_pairs;

public class ContainerNode extends Node
{
    private final Pair pairAB; // Each node contains pair. Pairs could be placed after pairs (as children).

    protected ContainerNode(final Pair pairAB)
    {
        this.pairAB = pairAB;
    }

    public static ContainerNode of(final Pair pair) {
        return new ContainerNode(pair);
    }

    /**
     * A pair (c, d) can follow another pair (a, b) if b < c.
     * {@see https://www.geeksforgeeks.org/dynamic-programming-set-20-maximum-length-chain-of-pairs/}
     *
     * @param pairCD
     * @return bool
     */
    public boolean canFallow(final Pair pairCD) {
        return this.pairAB.b < pairCD.a;
    }

    @Override
    public String path()
    {
        return "("+pairAB.a+", "+pairAB.b+")";
    }

    @Override
    protected ContainerNode newNode(Pair pair)
    {
        return ChildNode.of(pair, this);
    }
}
