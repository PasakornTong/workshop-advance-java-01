package org.example.workshop01.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCircularBufferTest {

    CircularBuffer cb = new SimpleCircularBuffer();

    @Test
    @DisplayName("Default size should be 10")
    public void create_buffer_with_default_size(){
        cb.create();
        assertEquals(10, cb.getSize());
    }

    @Test
    @DisplayName("Create with size 5 should be 5 by specified")
    public void create_buffer_with_specific_size(){
        final int SPECIFIC_SIZE = 5;
        cb.create(SPECIFIC_SIZE);
        assertEquals(SPECIFIC_SIZE, cb.getSize());
    }
}