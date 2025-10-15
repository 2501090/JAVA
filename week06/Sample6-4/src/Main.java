import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        int degree;
        float result;

        System.out.print("섭씨온도 입력 : ");
        degree = Keyboard.nextInt();

        result = degree * (9.0f / 5) + 32;

        System.out.printf("섭씨온도 %d\u2103는 화씨온도%.2f\u2109 입니다\n", degree, result);

    }
}