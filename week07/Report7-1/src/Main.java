import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a, b, c; // 입력받을 세 정수
        int max, mid, min; // 대, 중, 소

        // 1. 입력
        System.out.print("3개의 정수 : ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        // 2. 처리
        if (a >= b && a >= c) {
            max = a;
            if (b >= c) {
                mid = b;
                min = c;
            } else {
                mid = c;
                min = b;
            }
        } else if (b >= a && b >= c) {
            max = b;
            if (a >= c) {
                mid = a;
                min = c;
            } else {
                mid = c;
                min = a;
            }
        } else {
            max = c;
            if (a >= b) {
                mid = a;
                min = b;
            } else {
                mid = b;
                min = a;
            }
        }

        // 3. 출력
        System.out.printf("입력 받은 %d, %d, %d를 크기 순으로 나열하면 %d, %d, %d 입니다\n",
                a, b, c, min, mid, max);
    }
}