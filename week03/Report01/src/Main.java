import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.print("첫 번째 숫자를 입력하세요 : \n");
        num1 = keyboard.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : \n");
        num2 = keyboard.nextInt();

        result = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, result);
    }
}