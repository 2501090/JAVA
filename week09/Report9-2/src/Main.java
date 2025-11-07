//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int month = (500 * 10) + (100 * 10);
        int total = 0;

        // 30년 * 12개월 = 360개월 동안 반복
        for (int i = 0; i < (30 * 12); i++) {
            total = total + month; // 매달 저금액을 total에 누적
        }

        System.out.printf("30년 동안 모은 총 저금액: %,d원\n", total);
    }
}