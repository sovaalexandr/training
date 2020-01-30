package com.github.sovaalexandr.search_insert_position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void searchInsert0() {
        assertEquals(2, (new SearchInsertPosition()).searchInsert(new int[] {1,3,5,6}, 5));
    }
    @Test
    void searchInsert1() {
        assertEquals(1, (new SearchInsertPosition()).searchInsert(new int[] {1,3,5,6}, 2));
    }
}