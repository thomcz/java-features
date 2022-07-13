package java16;

public class Java16 {
    // pattern is (1) a predicate (2) local variable (pattern variable)
    public String patternMatchingInstanceOf(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return "";
    }

    // provide vector computations
    public int[] vectorApi(int[] a, int[] b) {
        return new int[0];
    }
}
