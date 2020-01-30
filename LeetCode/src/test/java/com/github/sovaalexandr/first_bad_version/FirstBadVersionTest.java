package com.github.sovaalexandr.first_bad_version;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void firstBadVersion0() {
        assertEquals(4, new FirstBadVersion(4).firstBadVersion(5));
    }
    @Test
    void firstBadVersion1() {
        assertEquals(1, new FirstBadVersion(1).firstBadVersion(1));
    }
    @Test
    void firstBadVersion2() {
        assertEquals(2, new FirstBadVersion(2).firstBadVersion(2));
    }
    @Test
    void firstBadVersion3() {
        assertEquals(1702766719, new FirstBadVersion(1702766719).firstBadVersion(2126753390));
    }
    @Test
    void firstBadVersion4() {
        assertEquals(1, new FirstBadVersion(1).firstBadVersion(3));
    }
    @Test
    void firstBadVersion5() {
        assertEquals(2147483647, new FirstBadVersion(2147483647).firstBadVersion(2147483647));
    }
}