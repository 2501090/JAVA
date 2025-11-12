import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[] name = new String[]{"홍길동", "이재명", "윤석열", "경복대", "오세훈", "강민성", "김진성", "니키타", "김정은", "김시온"};

        String[] hakbun = {"2501002", "2501004", "2501006", "2501007", "2501008",
                "2501014", "2501063", "2501098", "2501044", "2501028"};

        int[] kor = new int[name.length];
        int[] eng = new int[name.length];
        int[] math = new int[name.length];
        int[] total = new int[name.length];
        int[] rank = new int[name.length];
        float[] avg = new float[name.length];
        boolean swapped = false;

        int i = 0;
        while (i < name.length) {
            System.out.printf("%s 학생의 국어 성적 입력 :", name[i]);
            kor[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 영어 성적 입력 :", name[i]);
            eng[i] = keyboard.nextInt();
            System.out.printf("%s 학생의 수학 성적 입력 :", name[i]);
            math[i] = keyboard.nextInt();

            if ((kor[i] >= 0 && kor[i] <= 100) &&
                    (eng[i] >= 0 && eng[i] <= 100) &&
                    (math[i] >= 0 && math[i] <= 100)) {
                i++;
            } else {
                System.err.println("ERROR : 0 ~ 100");
                System.in.read();
            }
        }

        for (i = 0; i < name.length; i++) {
            total[i] = kor[i] + eng[i] + math[i];
        }

        for (i = 0; i < name.length; i++) {
            avg[i] = total[i] / 3.0f;
        }

        for (i = 0; i < name.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < name.length - 1 - i; j++) {
                if (avg[j] < avg[j + 1]) { //내림차순
                    String text = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = text;

                    text = hakbun[j];
                    hakbun[j] = hakbun[j + 1];
                    hakbun[j + 1] = text;

                    int temp = kor[j];
                    kor[j] = kor[j + 1];
                    kor[j + 1] = temp;

                    temp = math[j];
                    math[j] = math[j + 1];
                    math[j + 1] = temp;

                    temp = eng[j];
                    eng[j] = eng[j + 1];
                    eng[j + 1] = temp;

                    temp = total[j];
                    total[j] = total[j + 1];
                    total[j + 1] = temp;

                    // [오류 1 수정] avg 배열도 함께 교환
                    float tempAvg = avg[j];
                    avg[j] = avg[j + 1];
                    avg[j + 1] = tempAvg;

                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        // [오류 2, 3 수정] 등수 계산 로직 변경
        rank[0] = 1; // 1등(첫 번째)은 1등으로 초기화
        for (i = 1; i < name.length; i++) {
            if (avg[i] == avg[i - 1]) { // 이전 사람과 평균이 같으면
                rank[i] = rank[i - 1]; // 같은 등수 부여
            } else {
                rank[i] = i + 1; // 평균이 다르면 현재 위치(i+1)를 등수로 부여
            }
        }

        System.out.println("******************************************");
        System.out.println("  학번     이름   국어  영어  수학  총점   평균   등수");
        System.out.println("******************************************");
        for (i = 0; i < name.length; i++) {
            System.out.printf("%7s %3s %3d %3d %3d %3d %5.1f %3d\n",
                    hakbun[i], name[i], kor[i], eng[i], math[i], total[i], avg[i], rank[i]);
        }
        System.out.println("******************************************");
    }
}