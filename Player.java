import java.util.Random;

class Player {
   protected static Random rand = new Random();
   protected String name = "";
   protected int hp;
   protected int strength;
   protected int addStrength = 0;
   private boolean block = false;
   
   public void player(String name) {
      this.name = name;
      hp = 100;
      strength = 10;
   }
   
   public int getHP() {
      return hp;
   }
   
   public int getStrength() {
      return strength;
   }
   
   public void attack () {
      addStrength = rand.nextInt(30) + 1;
   }
   
   public void block () {
      block = true;
   }
   
   public void potion () {
      int roll = rand.nextInt(6) + 1;
      switch(roll) {
         case 1:
            strength += 10;
            System.out.println(name + " gained 10 strength!");
            break;
         case 2: 
            strength += 20;
            System.out.println(name + " gained 20 strength!");
            break;
         case 3:
            addStrength = 30;
            System.out.println(name + " attack(s) with an extra 30 strength!");
            break;
         case 4:
            hp += 5;
            System.out.println(name + " gained 5 hp!");
            break;
         case 5:
            hp += 10;
            System.out.println(name + " gained 15 hp!");
            break;
         case 6:
            hp += 15;
            System.out.println(name + " gained 15 hp!");
            break;
         default:
            hp += 1;
            System.out.println(name + " gained 1 hp..."); 
            break;
      }
   }
   
   public void battle (Player enemy) {
      int userStrength = strength + addStrength;
      int enemyStrength = enemy.strength + enemy.addStrength;
      int strengthDiff = Math.abs(userStrength - enemyStrength);
            
      if (block && enemy.block) {
         System.out.println("\nBoth players blocked! No damage taken.");
      } 
      else if (block || enemy.block) {
         System.out.println("\nAttack blocked. No damage taken.");
      }
      else {
         System.out.print("\nYour strenth: " + (strength + addStrength) + ", ");
         System.out.print("Their strength: " + (enemy.strength + enemy.addStrength) + ". ");
         
         if (userStrength > enemyStrength) {
            enemy.hp -= strengthDiff;
            System.out.println("They take " + strengthDiff + " damage.");
         } else if (userStrength < enemyStrength) {
            hp -= strengthDiff;
            System.out.println("You take " + strengthDiff + " damage.");
         } else {
            System.out.println("No one takes damage");
         }
      }
      
      addStrength = 0;
      enemy.addStrength = 0;
      block = false;
      enemy.block = false;
   }
}