package assignment;

public class Text {

    public Text(String text) {
    }

    // Metod för att avbryta.
    public boolean stop(String text) {
        if (!text.equals("stop")) {
            return false;
        } else {
            return true;
        }
    }

    // Räknar symboler.
    public int countCharacters(String[] textArray) {
        char[] lettersInArray = null;
        int count = 0;
        // Itererar över arrayen med text-strängarna
        // och skriver ut antalet symboler, inklusive mellanslag.
        for (int i = 0; i < textArray.length; i++) {
            lettersInArray = textArray[i].toCharArray();
            count += lettersInArray.length;
        }
        return count;
    }

    // Räknar rader genom att ta ut längden på arrayen.
    public int countLines(String[] textArray) {
        return textArray.length;
    }

    // Räknar ord.
    public int countWords(String[] textArray) {
        int count = 0;
        // Itererar över arrayen och räknar antalet ord genom att
        // dela upp arrayen(split) och mäta längden på den.
        for (int i = 0; i < textArray.length; i++) {
            count += textArray[i].split(" ").length;
        }
        return count;
    }

    // Tar ut det/de längsta orden.
    public String[] longestWord(String[] textArray) {
        // Dela upp arrayen i ord.
        String textString = String.join(" ", textArray);
        String[] textArraySplit = textString.split(" ");
        // Hitta längden på längsta ordet genom att iterera genom
        // arrayen med strängar. Spara i maxLength.
        int maxLength = 0;
        for (int i = 0; i < textArraySplit.length; i++)
            if (textArraySplit[i].length() > maxLength) {
                maxLength = textArraySplit[i].length();
            }
        // Iterera genom arrayen igen, denna gång för att hitta antalet ord
        // som är längst. Spara i numberOfLongestWords.
        int numberOfLongestWords = 0;
        for (int i = 0; i < textArraySplit.length; i++) {
            if (textArraySplit[i].length() == maxLength) numberOfLongestWords++;
        }
        // Skapa en array så lång som antalet längsta ord. Sedan
        // stoppas alla längsta ord in i arrayen via en for-loop.
        String[] longestWordsArray = new String[numberOfLongestWords];
        int longestWordsIndex = 0;
        for (int i = 0; i < textArraySplit.length; i++) {
            if (textArraySplit[i].length() == maxLength) {
                longestWordsArray[longestWordsIndex] = textArraySplit[i];
                longestWordsIndex++;
            }
        }
        // Returnera arrayen med alla längsta ord.
        return longestWordsArray;
    }

    // Metod för att stoppa in test-strängarna i en array.
    public String[] addTextIn(String textArray[], String textIn) {
        int antalTextIn = textArray.length;
        String textArrayNew[] = new String[antalTextIn + 1];
        // Skapar en ny array för varje rad och stoppar in den
        // gamla arrayen och den nya raden som scannats in i den.
        for (int i = 0; i < antalTextIn; i++)
            textArrayNew[i] = textArray[i];
        textArrayNew[antalTextIn] = textIn;
        return textArrayNew;
    }
}
