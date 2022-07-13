package java16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Java16Test {
private final Java16 java16 = new Java16();
    @Test
    void patternMatchingInstanceOf() {
        String actual = java16.patternMatchingInstanceOf("test");

        assertEquals("test", actual);
    }

    @Test
    void vectorApi() {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        int[] expected = {6, 8, 10, 12};

        int[] actual = java16.vectorApi(a, b);

        assertEquals(expected, actual);
    }
}