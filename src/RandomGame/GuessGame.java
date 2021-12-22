/*
 * Created by Axel_ST on 21.12.2021
 *
 * Head First Java, 2nd Edition (RU) p. 69
 */

package RandomGame;

public class GuessGame {
   Player p1;
   Player p2;
   Player p3;
   
   public void startGame() {
      p1 = new Player();
      p2 = new Player();
      p3 = new Player();
      
      int targetNumber = (int) (Math.random() * 10);
      System.out.println("I'm guess the number from 0 to 9.");
      
      while (true) {
         System.out.println("The number is " + targetNumber);
         
         p1.guess();
         p2.guess();
         p3.guess();
   
         System.out.println("First player's guess is " + p1.number);
         System.out.println("Second player's guess is " + p2.number);
         System.out.println("Third player's guess is " + p3.number);
         
         if (p1.number == targetNumber)
            p1.isRight = true;
         if (p2.number == targetNumber)
            p2.isRight = true;
         if (p3.number == targetNumber)
            p3.isRight = true;
         
         if (p1.isRight || p2.isRight || p3.isRight) {
            System.out.println("We've got a winner!");
            System.out.println("Is first player the winner? - " + p1.isRight);
            System.out.println("Is second player the winner? - " + p2.isRight);
            System.out.println("Is third player the winner? - " + p3.isRight);
            System.out.println("The end of the game.");
            break;
         } else {
            System.out.println("Another try, please!");
         }
      }
   }
}
