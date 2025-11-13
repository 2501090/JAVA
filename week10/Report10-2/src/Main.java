import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] score = new int[10];

        int total = 0;
        float average;
        int max;
        int min;

        // 10개 점수 입력
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " : ");
            score[i] = scanner.nextInt();
        }

        // 초기값 설정 (반드시 모든 값이 입력된 후에 설정)
        max = score[0];
        min = score[0];

        // 합계, 최대값, 최소값 계산
        for (int i = 0; i < 10; i++) {
            total += score[i];

            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }

        // 평균 계산
        average = (float)total / 10.0f;

        System.out.println("--- 출력 결과 ---");
        System.out.println("합계 : " + total);
        System.out.printf("평균 : %.1f\n", average);
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}