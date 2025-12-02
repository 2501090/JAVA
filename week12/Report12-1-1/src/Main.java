public class Main {
    public static void main(String[] args) {

        int n1, n2, n3, n4;
        int result;

        n1 = Input.readData("첫 번째수");
        n2 = Input.readData("두 번째수");
        n3 = Input.readData("세 번째수");
        n4 = Input.readData("네 번째수");

        result = Compute.max4(n1, n2, n3, n4);

        Output.display(n1, n2, n3, n4, result);
    }
}