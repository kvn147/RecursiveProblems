import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RecursionTest {

    @Test
    void vowels() {
        int actualVowelCount = Recursion.vowels("hello");
        assertEquals(2, actualVowelCount);
    }

    @Test
    void smallest() {
        int actualSmallest = Recursion.smallest(new int[] {20, 10, 14, 3, 1});
        assertEquals(1, actualSmallest);
    }

    @Test
    void duplicateNeighbors() {
        boolean actualDuplicate = Recursion.duplicateNeighbors("abba");
        assertEquals(true, actualDuplicate);
    }

    @Test
    void longestWord() {
        String actualLongest = Recursion.longestWord(new String[] {"and", "as", "abba", "are"});
        assertEquals("abba", actualLongest);
    }

    @Test
    void lucasNumber() {
        int actualLucas = Recursion.lucasNumber(8);
        assertEquals(47, actualLucas);
    }

}
