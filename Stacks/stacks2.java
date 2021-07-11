package Stacks;
import java.util.*;

public class stacks2 {
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

        while(!(stack1.isEmpty()))
        {
            stack3.push(stack1.pop()); // stack 3 will have the values in reverse order
        }
        
        // this pops the third stack and returns opposite stack
        //while(!(stack3.isEmpty()))
        // {
        //     System.out.println(stack3.pop());
        // }
    }
}
