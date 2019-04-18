
/** Here we import the scanner library, which we will need later on*/
import java.util.Scanner;

public class Main {
  /** Here we use a static function to reverse the strings that are put into the program */
  private static String reverseString(String arg) {
    StringBuilder reverse = new StringBuilder();
    /** For loop that that goes through the string for the amount of characters it has and outputs them in the reverse order */
    for(int idx = arg.length(); idx > 0; idx--)
      reverse.append(arg.charAt(idx - 1));
    return reverse.toString();
  }

  public static void main(String[] args) {
    /** this part of the code reverses all the input through the reverse function*/
    for(String argument : args){
      System.out.println(reverseString(argument));
    }
    /** setup for the usage of memory in the while loop */
    Memory mem = new Memory();
    Scanner scan = new Scanner(System.in);

  /** while loop that prints a message based on wether a certain input was found */
    while(scan.hasNextLine()) {
      String line = scan.nextLine();
      if(mem.canRemember(line))
        System.out.println("Pffft, everyone knows that!");
      else {
        System.out.println("You're so smart and intelligent!");
        mem.remember(line);
      }
    }
  }
}
