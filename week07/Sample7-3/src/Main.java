import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num;
        String result;

        System.out.print("정수 입력 : ");
        num = keyboard.nextInt();

        //[1]
        //조건 얀신지
        result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.printf("%d는 %s입니다.\n", num, result);

        //[2]
        if (num % 2 == 0) {
            result = "짝수";
        } else {
            result = "홀수";
        }
        System.out.printf("%d는 %s입니다.\n", num, result);

        //[3]
        switch (num % 2) {
            case 0 :
                result = "짝수";
                break;
            //case1은 default와 바꿔쓸수 ㅇ
            default :
                result = "홀수";
            //break 생략 가능 ㅇ
        }

        //+하나의 조건일때 이런식으로 쓸수도 있다.
        if (num % 2 == 0) {
            result = "짝수";
        } if (num % 2 == 1) {
            result = "홀수";
        }
        System.out.printf("%d는 %s입니다.\n", num, result);

    }
}