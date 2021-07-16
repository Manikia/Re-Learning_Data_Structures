public class PalindromeLoop{
    public static void main(String[] args) {
      
      String name = "kayaki";
      int HLength = name.length() / 2;
      boolean isPalindrome = true;
        
      for(int i = 0; i <= HLength; i++)
      {
          //check if its comparable
        int index1 = i;
        int index2 = name.length() - i - 1;
        Character name2 = name.charAt(index1);
        
        if(!(name2.equals(name.charAt(index2))))
        {
            System.out.println("Comparing " + name.charAt(index1) + " and " + name.charAt(index2));
            // System.out.println("Not a Palindrome");
            isPalindrome = false;
        }
        else
        {
            System.out.println("Comparing " + name.charAt(index1) + " and " + name.charAt(index2));
        }
    }
    
    if(isPalindrome){
      System.out.println("Its a Palindrome");
    }
    else{
      System.out.println("Not a Palindrome");
    }
  }
}