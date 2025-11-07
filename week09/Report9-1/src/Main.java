//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int total = 37;
        int legs = 102;

        for (int c = 0; c <= total; c++) {
            int d = total - c;
            if ((c * 2) + (d * 4) == legs) {
                System.out.printf("닭: %d마리, 개: %d마리\n", c, d);
                break;
            }
        }
    }
}