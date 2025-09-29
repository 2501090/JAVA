import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 준비물
        Scanner keyboard = new Scanner(System.in);
        int totalPrice = 0;

        // 최종 결과를 담을 정수형 변수
        int supplyPrice = 0;
        int tax = 0;

        // 데이터입력
        System.out.print("판매금액(총액)을 입력하세요: ");
        totalPrice = keyboard.nextInt();

        // 처리
        // 1. 공급가액(금액) 계산: 판매금액 / 1.1
        //    (double 연산 후 int로 강제 형변환하여 소수점 이하를 버림 처리)
        supplyPrice = (int) (totalPrice / 1.1);

        // 2. 세금 계산: 총액 - 공급가액
        tax = totalPrice - supplyPrice;

        // 출력
        System.out.println("\n--- 계산 결과 ---");
        System.out.printf("판매금액(총액) : %,d원\n", totalPrice);
        System.out.printf("금액(공급가액) : %,d원\n", supplyPrice);
        System.out.printf("세금(부가가치세) : %,d원\n", tax);
    }
}