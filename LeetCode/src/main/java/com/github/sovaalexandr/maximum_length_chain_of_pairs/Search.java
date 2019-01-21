package com.github.sovaalexandr.maximum_length_chain_of_pairs;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * {@see https://www.geeksforgeeks.org/dynamic-programming-set-20-maximum-length-chain-of-pairs/}
 */
public class Search
{
    public String findLongestSubsequence(final Stream<Pair> sequence) {
        return findDeepestPlacement(sequence)
                .map(placement -> "The longest subSequence is " + placement.place.path() + " and it's length is " + placement.depth)
                .orElse("Couldn't find any subsequence on supplied input");

    }

    public int findLongestSubsequenceLength(final Stream<Pair> sequence) {
        return findDeepestPlacement(sequence).map(placement -> placement.depth).orElse(0);
    }

    private Optional<Placement> findDeepestPlacement(final Stream<Pair> sequence) {
        final RootNode tree = new RootNode();
        final Function<Pair, Placement> addPair = tree::addPair; // Force optimization to use same closure several times
        return sequence.map(addPair).reduce((left, right) -> left.depth > right.depth ? left : right);
    }
}
