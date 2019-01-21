package com.github.sovaalexandr.tree_from_preorder_traversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructTreeTest
{
    @Test
    void constructTree()
    {
        ConstructTree target = new ConstructTree();
        int[] pre = {10, 30, 20, 5, 15};
        char[] preLN = {'N', 'N', 'L', 'L', 'L'};
        AbstractNode node = target.constructTree(pre, preLN);
        Assertions.assertEquals("20 30 5 10 15", node.toString());
    }
}