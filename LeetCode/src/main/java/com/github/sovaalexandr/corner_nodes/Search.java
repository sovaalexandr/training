package com.github.sovaalexandr.corner_nodes;

import java.util.StringJoiner;

/**
 * {@see https://practice.geeksforgeeks.org/problems/leftmost-and-rightmost-nodes-of-binary-tree/1}
 */
public class Search
{
    public String cornerNodes(Edge[] edges) {
        Node root = null;
        for (Edge edge: edges) {
            final Node vertex0 = new Node(edge.vertex0);
            if (null == root) {
                root = vertex0;
            }
            final Node vertex1 = new Node(edge.vertex1);
            if ('L' == edge.indicator) {
                root.addLeftAfter(vertex0, vertex1);
            } else if ('R' == edge.indicator) {
                root.addRightAfter(vertex0, vertex1);
            }
        }

        StringJoiner corners = new StringJoiner(" ");
        for (
                Node left = root, right = root;
                null != left || null != right;
                left = null == left ? null : left.left, right = null == right ? null : right.right) {
            if (left == right) { // root
                corners.add(String.valueOf(left.value));
                continue;
            }
            if (null != left) {
                corners.add(String.valueOf(left.value));
            }
            if (null != right) {
                corners.add(String.valueOf(right.value));
            }
        }
        return corners.toString();
    }
}
