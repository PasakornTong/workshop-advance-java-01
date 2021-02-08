package org.example.workshop01.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCircularBufferTest {

    CircularBuffer cb = new SimpleCircularBuffer();

    @Test
    @DisplayName("Default size should be 10")
    public void create_buffer_with_default_size(){
        cb.create();
        assertEquals(10, cb.getSize());
        assertEquals(true , cb.isEmpty());
    }

    @Test
    @DisplayName("Create with size 5 should be 5 by specified")
    public void create_buffer_with_specific_size(){
        final int SPECIFIC_SIZE = 5;
        cb.create(SPECIFIC_SIZE);
        assertEquals(SPECIFIC_SIZE, cb.getSize());
        assertEquals(true , cb.isEmpty());
    }

    @Test
    @DisplayName("Read data after been writen should be the same")
    public void read_data_after_writen_should_same(){
        final String WRITEN_DATA = "Test data";
        cb.create();
        cb.write(WRITEN_DATA);
        assertEquals(false , cb.isEmpty());
        String readData = cb.read();
        assertEquals(WRITEN_DATA, readData);
        assertEquals(true , cb.isEmpty());
    }

    @Test
    @DisplayName("Read data after been writen should be the same by sequence")
    public void read_data_after_writen_should_same_sequence(){
        final String[] DATA_SERIES = {"1","2","3","4","5","6","7"};
        cb.create();
        for(int i=0; i<2; i++){
            for (String data : DATA_SERIES) {
                cb.write(data);
            }
            for (String data : DATA_SERIES) {
                assertEquals(data, cb.read());
            }
        }
    }
}