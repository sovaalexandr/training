package com.github.sovaalexandr.persistent_bugger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersistentBuggerTest
{

    @Test
    void persistence()
    {
        PersistentBugger target = new PersistentBugger();

        assertEquals(3, target.persistence(39));
        assertEquals(0, target.persistence(4));
        assertEquals(2, target.persistence(25));
        assertEquals(4, target.persistence(999));
    }
}