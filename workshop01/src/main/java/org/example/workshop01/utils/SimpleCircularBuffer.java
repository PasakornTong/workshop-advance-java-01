package org.example.workshop01.utils;

public class SimpleCircularBuffer implements CircularBuffer {
    public static final int DEFAULT_SIZE = 10;

    private String[] data;
    private int writeIndex;
    private int readIndex;
    private int size;

    public void create(){
        this.create(DEFAULT_SIZE);
    }
    public void create(int size){
        this.data = new String[size];
        this.size = size;
    }
    public void write(String input){
        if(!this.isFull()) {
            this.data[this.writeIndex] = input;
            this.writeIndex = (this.writeIndex + 1) % this.size;
        }
    }
    public String read(){
        String rd = this.data[this.readIndex];
        this.readIndex = (this.readIndex + 1) % this.size;
        return rd;
    }
    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.readIndex == this.writeIndex;
    }
    public boolean isFull(){
        return this.readIndex == (this.writeIndex + 1) % this.size;
    }
}