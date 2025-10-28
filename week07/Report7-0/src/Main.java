import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int x;
        String result;

        System.out.print("정수 x 입력 : ");
        x = keyboard.nextInt();

        result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.printf("%d는 %s입니다.\n", x, result);

        if (x % 2 == 0) {
            result = "짝수";
        } else {
            result = "홀수";
        }
        System.out.printf("%d는 %s입니다.\n", x, result);

        switch (x % 2) {
            case 0 :
                result = "짝수";
                break;
            default :
                result = "홀수";
        }
        System.out.printf("%d는 %s입니다.\n", x, result);

        if (x % 2 == 0) {
            result = "짝수";
        }
        if (x % 2 != 0) {
            result = "홀수";
        }
        System.out.printf("%d는 %s입니다.\n", x, result);
    }
}