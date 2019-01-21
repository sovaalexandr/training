package com.github.sovaalexandr.shots;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShotsTest
{

    @Test
    void solve()
    {
        final Shots shots = new Shots();
        Assertions.assertEquals(
                shots.solve(List.of('a', 'b', 'c', 'd', 'a', 'e', 'f', 'g', 'h', 'i', 'j', 'e')),
                List.of(5, 7)
                );
        Assertions.assertEquals(
                shots.solve(List.of('z', 'z', 'c', 'b', 'z', 'c', 'h', 'f', 'i', 'h', 'i')),
                List.of(6, 5)
        );
    }
}