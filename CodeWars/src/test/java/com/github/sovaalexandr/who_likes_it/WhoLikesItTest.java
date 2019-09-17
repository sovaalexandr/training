package com.github.sovaalexandr.who_likes_it;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhoLikesItTest
{

    @Test
    void likes()
    {
        WhoLikesIt target = new WhoLikesIt();

        assertEquals("no one likes this", target.likes());
        assertEquals("Peter likes this", target.likes("Peter"));
        assertEquals("Jacob and Alex like this", target.likes("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", target.likes("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", target.likes("Alex", "Jacob", "Mark", "Max"));
    }
}