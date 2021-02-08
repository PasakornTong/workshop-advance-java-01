package org.example.workshop01;

public class Workshop01App {

    public static void main(String[] args) {
        CircularBuffer circularBuffer = new CircularBuffer(10);
        int size = circularBuffer.getSize();
        System.out.println(size);
    }
}
