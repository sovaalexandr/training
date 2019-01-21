package com.github.sovaalexandr.maximum_length_chain_of_pairs;

public class Pair
{
    public final int a;
    public final int b;

    public Pair(int a, int b)
    {
        if (!(a < b)) { // Fundamental business rule
            throw new RuntimeException("Precondition failed: "+ a +"is not less than "+ b);
        }
        this.a = a;
        this.b = b;
    }
}
