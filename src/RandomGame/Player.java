/*
 * Created by Axel_ST on 21.12.2021
 *
 * Head First Java, 2nd Edition (RU) p. 70
 */

package RandomGame;

public class Player {
   int number = 0;
   boolean isRight = false;
   public void guess() {
      number = (int) (Math.random() * 10);
      System.out.println("I think, the number is " + number);
   }
}
