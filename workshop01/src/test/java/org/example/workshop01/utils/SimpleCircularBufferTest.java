package org.example.workshop01.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCircularBufferTest {

    @DisplayName("Default size should be 10")
    @Test
    public void create_buffer_with_default_size(){
        CircularBuffer cb = new SimpleCircularBuffer();
        assertEquals(10, cb.getSize());
    }

}