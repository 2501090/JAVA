import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 준비물
        Scanner keyboard = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int first = 0;
        int second = 0;

        // 문 1) 데이터입력
        a = 3;
        b = 4;

        // 문 1) 처리 및 출력
        System.out.printf("a = %d, b = %d\n", ++a, b++);
        System.out.printf("원래값 a = %d, b = %d\n", a, b);

        // 문 2) 데이터입력
        first = 3;
        second = 4;

        // 문 2) 처리 및 출력
        System.out.printf("a = %d, b = %d\n", --first, second--);
        System.out.printf("원래값 a = %d, b = %d\n", first, second);
    }
}