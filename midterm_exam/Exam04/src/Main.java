public class Main {
    public static void main(String[] args) {

        int purchaseCost = 1015000; // 매입원가
        double profitRate = 0.3;     // 이익율 (30%)
        double taxRate = 0.1;        // 세율 (10%)

        // 정가 = 매입원가 * (1 + 이익율)
        int regularPrice = (int) (purchaseCost * (1.0 + profitRate));

        // 매출 세액 = 정가 * 세율 (10 %)
        int salesTax = (int) (regularPrice * taxRate);

        // 매입 세액 = 매입원가 * 세율 (10 %)
        int purchaseTax = (int) (purchaseCost * taxRate);

        // 납부세액 = 매출 세액 - 매입 세액
        int result = salesTax - purchaseTax;

        System.out.printf("정가: %,d원\n", regularPrice);
        System.out.printf("매출 세액: %,d원\n", salesTax);
        System.out.printf("매입 세액: %,d원\n", purchaseTax);
        System.out.printf("납부할 세금(납부세액)은 %,d원 입니다.\n", result);
    }
}