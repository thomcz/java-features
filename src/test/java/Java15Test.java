import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Java15Test {
    private final Java15 java15 = new Java15();

    @Test
    void textBlocks() {
        String expected = """
                Hello
                World""";

        String actual = java15.textBlocks();

        assertEquals(expected, actual);
    }
}