package Stacks;

import java.util.*;

                                    //QUESTION 1

// 1) Write a main function that creates three stacks of Integer objects. 
    //Store the numbers –1, 15, 23, 44, 4, 99 in the first two stacks. The top of each stack should store 99.


public class stacks 
{
    public static void main(String[] args)
    {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        stack1.push(-1);
        stack1.push(15);
        stack1.push(23);
        stack1.push(44);
        stack1.push(4);
        stack1.push(99);

        stack2.push(-1);
        stack2.push(15);
        stack2.push(23);
        stack2.push(44);
        stack2.push(4);
        stack2.push(99);

        // printing out what is inside of each stack
        while (!(stack1.isEmpty())) {
            System.out.println("stack 1: \n" + stack1.pop());
        }
        while (!(stack2.isEmpty())) {
          System.out.println("stack 2: \n" + stack2.pop());
        }  
    }
}
