import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 준비물
        Scanner keyboard = new Scanner(System.in);
        int dollarCnt = 0;
        int halfCnt = 0;
        int quarterCnt = 0;
        int dimeCnt = 0;
        int nickelCnt = 0;
        int pennyCnt = 0;
        int totalCent = 0;

        // 데이터입력
        System.out.print("달러 개수를 입력하세요: ");
        dollarCnt = keyboard.nextInt();
        System.out.print("하프 개수를 입력하세요: ");
        halfCnt = keyboard.nextInt();
        System.out.print("쿼터 개수를 입력하세요: ");
        quarterCnt = keyboard.nextInt();
        System.out.print("다임 개수를 입력하세요: ");
        dimeCnt = keyboard.nextInt();
        System.out.print("니켈 개수를 입력하세요: ");
        nickelCnt = keyboard.nextInt();
        System.out.print("페니 개수를 입력하세요: ");
        pennyCnt = keyboard.nextInt();

        // 처리 (총 금액 계산: 가중치 합산)
        totalCent = (dollarCnt * 100) +
                (halfCnt * 50) +
                (quarterCnt * 25) +
                (dimeCnt * 10) +
                (nickelCnt * 5) +
                (pennyCnt * 1);

        // 출력
        System.out.printf("\n총 금액은 %,d cent 입니다.\n", totalCent);
    }
}