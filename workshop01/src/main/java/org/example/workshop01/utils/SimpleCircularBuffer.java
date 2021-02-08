package org.example.workshop01.utils;

public class SimpleCircularBuffer implements CircularBuffer {

    private String[] data;
    private int writeIndex;
    private int readIndex;
    private int maxSize;
    private static final int DEFAULT_SIZE = 10;

    public SimpleCircularBuffer(){
        this.create();
    }

    public void create(){
        this.data = new String[DEFAULT_SIZE];
    }
    public void create(int size){
        
    }
    public void write(String input){

    }
    public String read(){
        return null;
    }
    public int getSize(){
        return 0;
    }
    public boolean isEmpty(){
        return false;
    }
    public boolean isFull(){
        return false;
    }
}