package com.bridgelabz.stacks;

public class StacksQueMain {
    public static void main(String[] args) {
        StackOperation s1 = new StackOperation();
        System.out.println("Welcome to Stack List");
        s1.addElement();
        System.out.println("Peek");
        s1.peek();
        s1.pop();
        System.out.println("Welcome to Queue List");
        s1.queueData();
        System.out.println("Pop");
        s1.deQueueData();



    }
}
