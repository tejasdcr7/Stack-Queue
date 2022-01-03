package com.bridgelabz.stacks;

import java.util.LinkedList;
import java.util.Stack;

public class StackOperation {

    public static void addElement() {
        Stack list = new Stack();
        list.push(56);
        list.push(30);
        list.push(70);
        System.out.println(list);
    }
    public static void peek(){
        Stack list = new Stack();
        list.push(70);
        list.push(30);
        list.push(56);
        list.peek();
        System.out.println(list);
    }
    public static void pop(){
        System.out.println("Before pop");
        Stack list = new Stack();
        list.push(56);
        list.push(30);
        list.push(70);
        System.out.println(list);
        list.pop();
        System.out.println("After pop");
        System.out.println(list);
    }

    public static void queueData(){
        Stack list = new Stack();
        list.push(56);
        list.push(30);
        list.push(70);
        System.out.println(list);
    }
    public static void deQueueData(){
        Stack list = new Stack();
        list.push(56);
        list.push(30);
        list.push(70);
        System.out.println(list);
        System.out.println("Before Pop");
        list.pop();
        System.out.println("After Pop");
        System.out.println(list);

    }
}
