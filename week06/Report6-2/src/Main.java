import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            System.out.print("주유할 리터 수: ");
            double ltr = keyboard.nextDouble();

            System.out.print("리터당 가격: ");
            int price = keyboard.nextInt();

            double total = ltr * price;

            if (total >= 50000) {
                total = total * 0.93; // 7% 할인
            }

            long result = (long) (total * 1.1); // 10% 부가세 추가

            System.out.printf("최종 결제 금액은 %,d원 입니다.\n", result);
    }
}