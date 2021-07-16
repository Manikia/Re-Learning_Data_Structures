public class PalindromeBackwards{
  public static void main(String[] args){
      String name = "kayak";
      String backwardsString = "";
    
      for(int i = name.length() - 1; i >= 0; i--)
      {
          backwardsString += name.charAt(i);
      }
      if(name.equals(backwardsString))
      {
          System.out.println("Its a match");
      }
      else{
        System.out.println("Its not a match");
      }

  }
}