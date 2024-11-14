package Unit_3.If;

import java.util.Scanner;

public class mnfk {
      public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
      String command = scan.next(); // use nextLine() in your own IDE
      if (command.equals("n")){
          System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
      } else if (command.equals("e")){
          System.out.println("As you enter the beach shack you find nobody but you do find some oil and a communist flag \n suddenly the US files in out of nowhere decding to give you a taste of freedom \n with a can of napalm ");
      } else if (command.equals("s")) { 
          System.out.println("You decide to make a raft with your helpful sportball companion and get stranded in the middle of the ocean");
      } else if (command.equals("w")){
          System.out.println("You see a beach with nobody on it you decide to sit on the sand watching the sun go down. \n" + //
                            " You realized that nobody is coming for you. You know your fate and instead of trying to fight it you decide to stand up and walk straight into the ocean with no intent of turning back.");
      }
      else {
        System.out.print("You can’t go in that direction");
      }
      // Add else-ifs for s, e, w, and an else for any other input. Be creative!


      System.out.println("End of adventure!");
      scan.close();
   }
}
