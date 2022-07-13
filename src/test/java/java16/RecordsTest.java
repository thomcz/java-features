package java16;

import java16.Records.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RecordsTest {

    @Test
    public void records() {
        Person max1 = new Person("Max");
        Person max2 = new Person("Max");

        boolean actual = max1.equals(max2);

        assertTrue(actual);
    }
}