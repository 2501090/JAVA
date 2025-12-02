public class Compute {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int max4(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }
}