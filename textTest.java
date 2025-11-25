package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class textTest {

    @Test
    public void testOfText() {
        Text text1 = new Text("wolf monkey capybara");
    }

    @Test
    public void testOfCountLines() {
        Text text1 = new Text("wolf \nmonkey \ncapybara");
        assertEquals(3, text1.countLines(new String[]{"wolf", "monkey", "capybara"}));
    }

    @Test
    public void testOfCountWords() {
        Text text1 = new Text("wolf monkey capybara elephant");
        assertEquals(4, text1.countWords(new String[]{"wolf", "monkey", "capybara", "elephant"}));
    }

    @Test
    public void testOfStop() {
        Text text1 = new Text("wolf");
        assertFalse(text1.stop(String.valueOf(text1)));
    }
}
