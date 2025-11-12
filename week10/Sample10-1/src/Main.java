import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        // 선언
        // int[] java;

        // 정의
        // java = new int[10];

        // java[0] ~ java[4] 의미
        // int[] java = new int[5];

        Scanner keyboard = new Scanner(System.in);
        String[] name = {"홍길동", "이재명", "윤석열", "경복대", "오세훈"};
//        int[] java = new int[] {95, 70, 80, 75, 100};
        int[] java = new int[name.length];
        int total = 0;
        float avg = 0.0f;

        int i = 0;
        while (true) {
            System.out.printf("%s님의 java성적 입력 : ", name[i]);
            java[i] = keyboard.nextInt();

            if (java[i] >= 0 && java[i] <= 100) {
                i++;
                if (i >= name.length)
                    break;
                else {
                    System.err.println("ERROR : 0점 ~ 100점 사이");
                    System.in.read();
                }
            }

            for (i = 0; i < java.length; i++)
                total += java[i];

            avg = (float) total / java.length;

            for (i = 0; i < java.length; i++) {
                System.out.printf("%s 학생은 = %3d 점 \n", i + 1, java[i]);
                System.out.printf("총점 : %3d 점\n", total);
                System.out.printf("");
            }
        }
    }
}