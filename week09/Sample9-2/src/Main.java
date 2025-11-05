import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        int start;
        int last;
        int sum = 0;

        while (true) {
            System.out.print("어디부터 더할까요? ");
            start = keyboard.nextInt();
            System.out.print("어디까지 더할까요? ");
            last = keyboard.nextInt();

            // read 오류 처리 : 오류구문에 alt+enter 후 첫번쨰 전등클릭
            if (start >= last) {
                System.err.println("에러 : start가 last보다 작아야 함");
                System.in.read();
            } else {
                break;
            }
        }

            for (int i = start; i <= last; i++) {
                sum += i;
            }

            System.out.printf("%d + %d + ... + %d = %,d\n", start, start + 1, last, sum);
    }
}