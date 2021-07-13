import java.util.ArrayDeque;
import java.util.Deque;

public class WordRev{
  public static void main(String[] args){
    String input = "my name is bobby "; // create input string
    input = input.strip();
    
    Deque<String> stack = new ArrayDeque<>(); // create a stack

    String tempString = "";

    // loop thru each char of the input
    for (int i = 0; i < input.length(); i++)
    {

        if (Character.isWhitespace(input.charAt(i))) // checks if current char is " "
        {
            stack.push(tempString);
            tempString = "";
        }
        tempString += input.charAt(i);

    }
    stack.push(tempString);
    
    while(!(stack.isEmpty()))
    {
        System.out.println("Stack: \n" + stack.pop());
    }
    
      // add each char to a temp string
      // if current char is " "
        //stack.push(temp string)
        // empty temp string

  }
  }