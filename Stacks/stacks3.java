package Stacks;
import java.util.*;

// Write a second loop to remove a value from the second and third stacks and display each pair
// of values on a separate output line. Continue until the stacks are empty. Show the output.

public class stacks3 {
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

      while (!(stack1.isEmpty())) {
          stack3.push(stack1.pop()); // stack 3 will have the values in reverse order
      }
      
      while (!(stack2.isEmpty()) && !(stack3.isEmpty())) 
      {
          System.out.println("stack 2 : \n" + stack2.pop());
          System.out.println("stack 3 : \n" + stack3.pop());
          System.out.println(" ");
      }
    }
}
