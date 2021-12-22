/*
 * Created by Axel_ST on 22.12.2021
 *
 * Head First Java, 2nd Edition (RU) p. 73
 */

package DrumKit;

public class DrumKitTestDrive {
   public static void main(String[] args) {
      DrumKit dk = new DrumKit();
      dk.playSnare();
      dk.snare = false;
      dk.playTopHat();
      if (dk.snare)
         dk.playSnare();
   }
}
