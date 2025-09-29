import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        final int PRICE_PER_PYEONG = 56000;

        int area = 0;
        long totalPrice = 0;
        long finalPrice = 0;

        // 데이터입력
        System.out.print("주택의 평수를 입력하세요: ");
        area = keyboard.nextInt();

        // 처리
        // 1. 총 가격 계산
        totalPrice = (long)area * PRICE_PER_PYEONG;

        // 2. 1,000원 미만 버림 처리 (정수 나눗셈의 버림 특성 이용)
        finalPrice = (totalPrice / 1000) * 1000;

        // 출력
        System.out.printf("계산된 총 가격: %,d원\n", totalPrice);
        System.out.printf("1,000원 미만 버림 후 최종 가격: %,d원\n", finalPrice);
    }
}