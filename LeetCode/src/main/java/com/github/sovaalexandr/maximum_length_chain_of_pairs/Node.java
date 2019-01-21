package com.github.sovaalexandr.maximum_length_chain_of_pairs;

import java.util.ArrayList;
import java.util.function.Predicate;

abstract public class Node
{
    private static final int INITIAL_CHILDREN = 10; // Configurable for empiric adjustments.

    private ArrayList<ContainerNode> children; // Not all roots have children so to save some bits we'll allocate it on demand.

    public Placement addPair(final Pair pair) {
        if (null == children) {
            children = new ArrayList<>(INITIAL_CHILDREN);
            return addToCurrentLevel(pair);
        }

        final Predicate<ContainerNode> canFollow = node -> node.canFallow(pair); // Optimization for re-using same closure.
        return children.stream().filter(canFollow).findFirst().map(node -> node.addPair(pair)).map(placement -> {
            placement.depth++;
            return placement;
        }).orElseGet(() -> addToCurrentLevel(pair));
    }

    abstract public String path();

    abstract protected ContainerNode newNode(Pair pair);

    private Placement addToCurrentLevel(Pair pair)
    {
        final ContainerNode node = newNode(pair);
        children.add(node);
        return new Placement(node, 1);
    }
}
