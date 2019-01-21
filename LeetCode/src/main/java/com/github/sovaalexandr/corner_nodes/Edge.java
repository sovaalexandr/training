package com.github.sovaalexandr.corner_nodes;

public class Edge
{
    public final int vertex0;
    public final int vertex1;
    public final char indicator;

    public Edge(int vertex0, int vertex1, char indicator)
    {
        this.vertex0 = vertex0;
        this.vertex1 = vertex1;
        this.indicator = indicator;
    }
}
