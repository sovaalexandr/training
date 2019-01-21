package com.github.sovaalexandr.corner_nodes;

public class Node
{
    public final int value;
    public Node left;
    public Node right;

    public Node(int value)
    {
        this.value = value;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Node node = (Node) o;

        return value == node.value;
    }

    public boolean addLeftAfter(Node vertex0, Node vertex1)
    {
        if (equals(vertex0)) {
            left = vertex1;
            return true;
        }
        if (null != left && left.addLeftAfter(vertex0, vertex1)) {
            return true;
        }
        if (null != right && right.addLeftAfter(vertex0, vertex1)) {
            return true;
        }

        return false;
    }

    public boolean addRightAfter(Node vertex0, Node vertex1)
    {
        if (equals(vertex0)) {
            right = vertex1;
            return true;
        }
        if (null != left && left.addRightAfter(vertex0, vertex1)) {
            return true;
        }
        if (null != right && right.addRightAfter(vertex0, vertex1)) {
            return true;
        }

        return false;
    }
}
