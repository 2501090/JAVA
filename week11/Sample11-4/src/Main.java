import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[][] employees = {
                {"김철수", "1111"}, {"이영희", "1211"}, {"박민수", "2111"},
                {"최지우", "1441"}, {"정우성", "1444"}, {"스미스", "1456"},
                {"장동건", "1678"}, {"데이빗", "1567"}, {"송혜교", "1789"},
                {"이정재", "1789"}
        };

        int[] hobong = {1, 4, 5, 3, 2, 1, 3, 4, 3, 2};

        // 급여 데이터: {0:기본급, 1:업무수당, 2:급여액, 3:세금, 4:지급액}
        int[][] salaries = new int[employees.length][5];

        // 호봉별 기본급 테이블
        int[] basePayTable = {0, 1650000, 1680000, 1700000, 1720000, 1750000};

        // 업무 수당 입력 (While Loop)
        int i = 0;
        while (i < employees.length) {
            System.out.printf("%s님의 업무 수당 입력 : ", employees[i][0]);

            int allowance = keyboard.nextInt();

            if (allowance >= 0 && allowance <= 1000000) {
                salaries[i][1] = allowance;
                i++;
            } else {
                System.out.println("ERROR : 업무 수당은 0 ~ 1,000,000 사이여야 합니다.");
            }
        }

        //급여 계산
        for (i = 0; i < employees.length; i++) {
            // 기본급 설정
            int rank = hobong[i];
            if (rank >= 1 && rank <= 5) {
                salaries[i][0] = basePayTable[rank];
            } else {
                salaries[i][0] = 0;
            }

            // 급여액 계산 (기본급 + 수당)
            salaries[i][2] = salaries[i][0] + salaries[i][1];

            // 세금 계산
            float taxRate;
            if (salaries[i][2] >= 2600000) {
                taxRate = 0.10f;
            } else if (salaries[i][2] >= 2000000) {
                taxRate = 0.08f;
            } else {
                taxRate = 0.05f;
            }
            salaries[i][3] = (int)(salaries[i][2] * taxRate);

            // 실 지급액 계산
            salaries[i][4] = salaries[i][2] - salaries[i][3];
        }

        // 정렬 (Bubble Sort - 지급액 기준 오름차순)
        for (i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (salaries[j][4] > salaries[j + 1][4]) {
                    // 3개의 배열(이름, 호봉, 급여)을 모두 동시에 swap 해야 데이터가 꼬이지 않습니다.

                    // 이름 swap
                    String[] tempEmp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = tempEmp;

                    // 호봉 swap
                    int tempHobong = hobong[j];
                    hobong[j] = hobong[j + 1];
                    hobong[j + 1] = tempHobong;

                    // 급여 swap
                    int[] tempSalary = salaries[j];
                    salaries[j] = salaries[j + 1];
                    salaries[j + 1] = tempSalary;
                }
            }
        }

        System.out.println("********");
        System.out.println("  이름    사번   호봉    기본급     업무수당     급여액       세금      지급액");
        System.out.println("********");
        for (i = 0; i < employees.length; i++) {
            System.out.printf("%4s %6s %4d %,10d %,10d %,10d %,9d %,10d\n",
                    employees[i][0], employees[i][1], hobong[i],
                    salaries[i][0], salaries[i][1], salaries[i][2], salaries[i][3], salaries[i][4]);
        }
        System.out.println("********");    }
}