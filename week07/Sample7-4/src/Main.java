import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        int result;

        System.out.print("두 개의 정수를 입력 : ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        //if-else
        if (num1 >= num2) {
            result = num1;
        } else {
            result = num2;
        }
        System.out.printf("입력한 정수 %d와 %d중에 큰수는 %d입니다.", num1, num2, result);

        //switch문 주의!
//        switch (num1 >= num2) {
//            **boolean같은 값 > 특정 조건에서 switch문 쓰면 안됨
//        }

        //switch문
        int temp = num1 >= num2 ? 1 : 2;
        switch (temp) {
            case 1 :
                result = num1;
                break;
            default:
                result = num2;
        }

        //
        result = num1 >= num2 ? num1 : num2;
        System.out.printf("입력한 정수 %d와 %d중에 큰수는 %d입니다.", num1, num2, result);
    }
}