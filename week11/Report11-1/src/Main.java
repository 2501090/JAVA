import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int MAX = 10;
        final int BASE_FEE = 1200;

        String[] no = new String[MAX];
        String[] name = new String[MAX];
        int[] code = new int[MAX];
        double[] usage = new double[MAX];

        int count = 0;

        // 입력 단계
        System.out.println("데이터 입력을 시작합니다. (최대 10명)");
        System.out.println("중간에 멈추고 결과를 보려면 번호에 'exit'를 입력하세요.");

        while (count < MAX) {
            // [수정] 몇 번째 입력인지 눈에 보이게 출력
            System.out.printf("\n[%d번째 사람] 번호(종료:exit) 이름 구분(1~5) 사용량 입력 : ", count + 1);

            String inputNo = keyboard.next();
            if (inputNo.equalsIgnoreCase("exit")) break; // exit 입력 시 반복 종료

            no[count] = inputNo;
            name[count] = keyboard.next();
            code[count] = keyboard.nextInt();
            usage[count] = keyboard.nextDouble();
            count++;
        }

        // 출력 단계
        System.out.println("\n[ 수도 요금 명세서 ]");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("   번호     이름    구분    사용량    사용금액      TAX     납부액     비고");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            String typeName = "";
            int price = 0;
            double taxRate = 0.0;
            String note = "";

            switch (code[i]) {
                case 1: typeName = "가정용"; price = 40; taxRate = 0.05; break;
                case 2: typeName = "영업용"; price = 55; taxRate = 0.035; break;
                case 3: typeName = "공장용"; price = 78; taxRate = 0.025; break;
                case 4: typeName = "관공서"; price = 35; taxRate = 0.015; break;
                case 5: typeName = "군기관"; price = 20; taxRate = 0.0; note = "일괄징수"; break;
            }

            // 계산 로직
            long roundUsage = Math.round(usage[i]);
            long usageAmount = roundUsage * price;
            long tax = (long)((BASE_FEE + usageAmount) * taxRate);
            tax = (tax / 10) * 10;
            long total = BASE_FEE + usageAmount + tax;

            // 결과 출력
            System.out.printf("   %-6s  %-4s  %-4s  %6.1f   %,7d   %,6d   %,7d    %s\n",
                    no[i], name[i], typeName, usage[i], usageAmount, tax, total, note);
        }
        System.out.println("-----------------------------------------------------------------------");
    }
}