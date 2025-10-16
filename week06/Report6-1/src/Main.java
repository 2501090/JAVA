import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int PRICE = 5000;

        System.out.print("구매할 식권 개수를 입력하세요: ");
        int cnt = keyboard.nextInt();
        int rate = 0;

        if (cnt >= 30) {
            rate = 20;
        } else if (cnt >= 20) {
            rate = 15;
        } else if (cnt >= 10) {
            rate = 10;
        }

        long total = (long) cnt * PRICE;
        long result = total - (total * rate / 100);

        System.out.printf("식권 %d장을 구매하여 %d%% 할인을 받아 최종 결제 금액은 %,d원 입니다.\n", cnt, rate, result);
    }
}