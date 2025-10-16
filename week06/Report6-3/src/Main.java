import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("나이: ");
        int age = keyboard.nextInt();

        System.out.print("교통카드 사용 여부 (y/n): ");
        char card = keyboard.next().charAt(0);

        System.out.print("탑승 시간 (0시-23시): ");
        int time = keyboard.nextInt();

        double fare = 0;

        if (age >= 19) { // 성인
            fare = (card == 'y') ? 1250 : 1350;
        } else if (age >= 13) { // 청소년
            fare = (card == 'y') ? 750 : 850;
        } else { // 어린이
            fare = 450;
        }

        if (time >= 22 || time < 5) {
            fare = fare * 1.2; // 심야 할증 20%
        }

        System.out.printf("최종 요금은 %,.0f원 입니다.\n", fare);
    }
}