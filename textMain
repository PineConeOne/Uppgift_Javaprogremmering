package assignment;

import java.util.Scanner;
import java.util.Arrays;

public class textMain {
    public static void main(String[] args) {
        String textIn = "";
        Text telegram = new Text(textIn);
        Scanner sc = new Scanner(System.in);
        String[] textArray = new String[0];
        System.out.println("Skriv in text på flera rader, skriv sedan 'stop' när du är klar!");
        // Skapar en loop för att få in text-strängarna i en Array m.h.a. metoden
        // "addTextIn". För att stoppa vid rätt tillfälle används metoden "stop".
        boolean carryOn = true;
        while (carryOn) {
            textIn = sc.nextLine();
            if (telegram.stop(textIn)){
                carryOn = false;
            } else  {
                textArray = telegram.addTextIn(textArray, textIn);
            }
        }

        System.out.println("Det är " + telegram.countCharacters(textArray) + " antal tecken.");
        System.out.println("Det är " + telegram.countLines(textArray) + " antal rader.");
        System.out.println("Det är " + telegram.countWords(textArray) + " antal ord.");
        System.out.println("Det eller de längsta orden är:\n" + Arrays.toString(telegram.longestWord(textArray)));
    }
}
