package org.example.workshop01;

import org.example.workshop01.utils.CircularBuffer;
import org.example.workshop01.utils.SimpleCircularBuffer;

public class Workshop01App {

    public static void main(String[] args) {
        CircularBuffer cb = new SimpleCircularBuffer();
        System.out.println(cb.getSize());
    }
}
