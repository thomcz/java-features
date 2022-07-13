import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Java12Test {

    private final Java12 java12 = new Java12();

    @Test
    void transform_splitString() {

        String actual = java12.transform("reverse");

        assertEquals("esrever", actual);
    }

    @Test
    void teeingCollector() {
        List<Double> numbers = List.of(1d, 2d, 3d, 4d, 5d);

        double actual = java12.teeingCollector(numbers);

        assertEquals(3d, actual);
    }

    @Test
    void formatNumber() {
        NumberFormat actual = java12.formatNumber(2592);

//        assertEquals("2.59K", actual);
//        assertEquals("2.59 thousand", actual);
    }
}