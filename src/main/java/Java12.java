import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java12 {
    //  two new methods in the String class.
    // - indent adjusts the indentation of each line
    // - transform accepts a single argument function as a parameter that will be applied to the string.
    public String transform(String original) {
        return original;
    }

    // Teeing Collector is a composite of two downstream collectors.
    public double teeingCollector(List<Double> numbers) {
        Long count = numbers.stream().count();
        Double sum = numbers.stream().mapToDouble(i -> i).sum();

        return sum/count;
    }

    public NumberFormat formatNumber(int i) {
        // NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        // likesShort.setMaximumFractionDigits(2);
        return null;
    }
}
