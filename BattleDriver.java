import java.util.Scanner;

class BattleDriver {
   public static void main (String args[]) {
      BillNye bill = new BillNye();
      Player user = new Player();
      Scanner in = new Scanner(System.in);
      boolean quit = false;
      boolean error = false;
      char choice;
      
      //Set players
      user.player("You");
      bill.player();
      
      bill.facePrint();
      
      //Welcome
      System.out.println("You have entered the Bill Nye battle simulator!");
      System.out.println("Press \"q\" at any time to quit");
      
      do {
         //Display health
         displayHealth(user, bill);
         
         do {
            try {
               error = false;
               
               //Give options to (a)ttack, (b)lock, or drink (p)otion
               System.out.print("Will you (a)ttack, (b)lock, or drink (p)otion? ");
               choice = in.next().charAt(0);
               
               if (choice == 'a') {
                  user.attack();
               } else if (choice == 'b') {
                  user.block();
               } else if (choice == 'p') {
                  user.potion();
               } else if (choice == 'q') {
                  quit = true;
                  System.exit(0);
               } else {
                  error = true;
                  System.out.println("Sorry, invalid response.");
               }
            } catch (Exception e) {
               error = true;
               System.out.println("Sorry, invalid response.");
            }
         } while (error);
         
         //Bill Nye chooses what he will do
         bill.battleChoice();
         
         //Battle happens
         user.battle(bill);
         
         //Go back to user choice
      } while (user.getHP() > 0 && bill.getHP() > 0 && !quit);
      
      //Declare winner
      if (user.getHP() <= 0 && bill.getHP() <= 0) {
         System.out.println("Gasp! It's a tie!");
      } else if (user.getHP() <= 0) {
         System.out.println("Bill wins!");
      } else if (bill.getHP() <= 0) {
         System.out.println("You win!");
      } else {
         System.out.println("I win!");
      }
   }
   
   public static void displayHealth(Player user, Player enemy) {
      System.out.println("Your HP: " + user.getHP());
      System.out.println("Bill's HP: " + enemy.getHP());
   }
}