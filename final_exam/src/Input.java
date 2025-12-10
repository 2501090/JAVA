import java.util.Scanner;

public class Input {
    static Scanner keyboard = new Scanner(System.in);

    public static int[][] inputData(String[][] classStudents, int classNum) {
        System.out.printf("*** %d반 성적 입력 ***\n", classNum);

        // [학생수][7] 크기: 국,영,수,선택,총점,반석차,전교석차
        int[][] classScore = new int[classStudents.length][7];

        for (int i = 0; i < classStudents.length; i++) {
            String name = classStudents[i][1];
            String gender = classStudents[i][2];

            // 기본 과목 입력
            classScore[i][0] = readScore(classNum, name, "국어");
            classScore[i][1] = readScore(classNum, name, "영어");
            classScore[i][2] = readScore(classNum, name, "수학");

            // 선택 과목 (성별에 따라 기술/가사)
            String subName = gender.equals("남") ? "기술" : "가사";
            classScore[i][3] = readScore(classNum, name, subName);

            System.out.println(".......................................");
        }
        return classScore;
    }

    // 입력
    private static int readScore(int classNum, String name, String subject) {
        int score = -1;
        while (true) {
            System.out.printf("%d반 학생 %s의 %s 점수 입력 : ", classNum, name, subject);
            try {
                String inputStr = keyboard.next();
                score = Integer.parseInt(inputStr);

                // 유효성 검사 (0~100)
                if (score >= 0 && score <= 100) {
                    break;
                } else {
                    System.out.println("ERROR : 점수는 0에서 100 사이여야 합니다. 다시 입력하세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR : 숫자를 입력하세요.");
            }
        }
        return score;
    }
}