import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scan = new Scanner(System.in);
      Scanner inSS = null;
      String stringOne;
      String stringTwo;
      int indexOfComma = -1;
      
      System.out.println("Enter input string:");
      String userInput = scan.nextLine().trim();
      
      
      while(!userInput.equalsIgnoreCase("Q")) {
         // condition to check whether input contains a comma
         boolean containsComma = (userInput.indexOf(indexOfComma) >= 0);
         
         while(!containsComma) {
            System.out.println("Error: No comma in string");
            System.out.println("Enter input string:");
            userInput = scan.nextLine().trim();
            containsComma = userInput.indexOf(indexOfComma) >= 0);
            if(userInput.equalsIgnoreCase("Q")); {
               break
            }
         }
         
         if(userInput.equalsIgnoreCase("Q")); {
            break
         }
         
         inSS = new Scanner(userInput.trim());
         
         stringOne = inSS.next().replaceAll(", $", "");
         stringTwo = inSS.next();
         System.out.println("First word: " + stringOne);
         System.out.println("Second word " + stringTwo);
         
         System.out.println("Enter input string:");
         userInput = scan.nextLine().trim();
         
         inSS.close();
      }
      
      scan.close();
         
         
            
            
      
         
      
      return;
   }
}