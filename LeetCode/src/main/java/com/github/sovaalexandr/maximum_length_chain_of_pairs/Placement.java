package com.github.sovaalexandr.maximum_length_chain_of_pairs;

public class Placement
{
    public final ContainerNode place;
    public int depth;

    public Placement(ContainerNode place, int depth)
    {
        this.place = place;
        this.depth = depth;
    }
}
