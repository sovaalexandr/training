package com.github.sovaalexandr.corner_nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest
{

    @Test
    void cornerNodes()
    {
        Search target = new Search();
        String result;

        Edge[] edges0 = {
                new Edge(15, 10, 'L'),
                new Edge(10, 8, 'L'),
                new Edge(10, 12, 'R'),
                new Edge(15, 20, 'R'),
                new Edge(20, 16, 'L'),
                new Edge(20, 25, 'R'),
        };
        result = target.cornerNodes(edges0);
        assertEquals("15 10 20 8 25", result);


        Edge[] edges1 = {
                new Edge(1, 2, 'R'), new Edge(2, 3, 'R'),
        };
        result = target.cornerNodes(edges1);
        assertEquals("1 2 3", result);
    }
}