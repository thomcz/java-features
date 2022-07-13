import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java14 {
    // Using yield, we can now effectively return values from a switch expression
    public boolean switchYield(String day) {
        boolean isTodayHoliday;
        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                isTodayHoliday = false;
                break;
            case "SATURDAY":
            case "SUNDAY":
                isTodayHoliday = true;
                break;
            default:
                throw new IllegalArgumentException("What's a " + day);
        }
        return isTodayHoliday;
    }

    // point out what exactly was null in a given line of code.
    public void helpfulNullPointer() {
        int[] arr = null;
        arr[0] = 1;
    }

}
