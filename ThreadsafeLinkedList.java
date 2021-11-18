package com.company;

import java.util.LinkedList;

public class ThreadsafeLinkedList {
    public static Object object = new Object();
    public ThreadsafeLinkedList(){
        this.list = new LinkedList<>();
    }
    private LinkedList<Integer>list;

    public void addAtPosition(int index, int element) {
        synchronized (object){
            list.add(index, element);
        }
    }

    public void removeAtPosition(int index, int element) {
        synchronized (object){
            list.remove(index);
        }
    }

    public int getFirst() {
        synchronized (object){
            return list.getFirst();
        }
    }

    public int getLast() {
        synchronized (object){
            return list.getLast();
        }

    }

    public int size() {
        synchronized (object){
            return list.size();
        }
    }
}