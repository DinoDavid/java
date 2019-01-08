import java.util.Scanner;
import java.time.*;

public class ChatBot {
  //Created a scanner
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Hello Boy\n");

    String answer1 = scanner.next();

    System.out.print("What do you what me to do?\n");
/*    System.out.print("Remember my name = 1\nTell me what time is it = 2\n");

    int a1 = scanner.nextInt();
    int a2 = scanner.nextInt();

    if (a1 == 1){
      System.out.print("What is your name?\n");

      String name = scanner.next();

      System.out.print("Your name is saved");

    }
      else if (a2 == 2){
*/      // create a Zone Id for Europe/Oslo
      ZoneId zoneId = ZoneId.of("Europe/Oslo");

      // create Clock with system(zoneId) method
      Clock clock = Clock.system(zoneId);

      // get instant of class
      Instant instant = clock.instant();

      // base Clock with default zone
      Clock realClock=Clock.system(zoneId);
      System.out.println(clock.instant());
/*    }
    else {
      System.out.print("You typed something wrong!");
    }
*/    //System.out.println(String.format("%s", answer));
  }
}
