import java.util.ArrayDeque;
import java.util.Deque;

public class Palindrome{
  public static void main(String[] args){
    String input = "racecar"; // create input string

    Deque<Character> stack = new ArrayDeque<>(); // create a stack

    for (int i = 0; i < input.length(); i++) // push all characters from string into stack
        stack.push(input.charAt(i));

    String reversedString = "";
    while(!(stack.isEmpty())) // pop all characters from the stack until empty
        reversedString += stack.pop(); // as you pop, append each pop to a new string
    
    if (reversedString.equals(input)) // compare both strings, if .equals() then Palindrome
      System.out.println("Its a match");
    else
      System.out.println("not a match");
  }
}